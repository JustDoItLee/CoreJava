package CoreJava.day_2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 李智
 * @date 2016/12/5
 */
public class CommandUtil {
    public static Object getCommand(Map requestMap,
                                    String commandClass)
            throws Exception {
        Class c = Class.forName(commandClass);
        Object o = c.newInstance();

        return updateCommand(requestMap, o);
    }

    // 使用reflection自动找出要更新的属性
    public static Object updateCommand(
            Map requestMap,
            Object command)
            throws Exception {
        Method[] methods =
                command.getClass().getDeclaredMethods();

        for (int i = 0; i < methods.length; i++) {
            // 略过private、protected成员
            // 且找出必须是set开头的方法
            if (!Modifier.isPrivate(methods[i].getModifiers()) &&
                    !Modifier.isProtected(methods[i].getModifiers()) &&
                    methods[i].getName().startsWith("set")) {
                // 取得不包括set方法
                String name = methods[i].getName()
                        .substring(3)
                        .toLowerCase();
                // 如果setter名称键值对相同
                // 调用对应的setter并给值
                if (requestMap.containsKey(name)) {
                    String param = (String) requestMap.get(name);
                    Object[] values = findOutParamValues(
                            param, methods[i]);
                    methods[i].invoke(command, values);
                }
            }
        }
        return command;
    }

    // 转换对应类型
    private static Object[] findOutParamValues(
            String param, Method method) {
        Class[] params = method.getParameterTypes();
        Object[] objs = new Object[params.length];

        for (int i = 0; i < params.length; i++) {
            if (params[i] == String.class) {
                objs[i] = param;
            } else if (params[i] == Short.TYPE) {
                short number = Short.parseShort(param);
                objs[i] = new Short(number);
            } else if (params[i] == Integer.TYPE) {
                int number = Integer.parseInt(param);
                objs[i] = new Integer(number);
            } else if (params[i] == Long.TYPE) {
                long number = Long.parseLong(param);
                objs[i] = new Long(number);
            } else if (params[i] == Float.TYPE) {
                float number = Float.parseFloat(param);
                objs[i] = new Float(number);
            } else if (params[i] == Double.TYPE) {
                double number = Double.parseDouble(param);
                objs[i] = new Double(number);
            } else if (params[i] == Boolean.TYPE) {
                boolean bool = Boolean.parseBoolean(param);
                objs[i] = new Boolean(bool);
            }
        }
        return objs;
    }

    public static void main(String[] args) throws Exception {
        Map<String, String> request =
                new HashMap<String, String>();
        request.put("name", "caterpillar");
        request.put("score", "90");
        Object obj = CommandUtil.getCommand(request, args[0]);
        System.out.println(obj);
    }
}
