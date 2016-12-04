package CoreJava.day_2;

/**
 * @author 李智
 * @date 2016/12/3
 */
public class ClassDemo {
    public static void main(String[] args) {
        String name = "justdoitlee";
        Class stringClass = name.getClass();
        System.out.println("类名称：" +
                stringClass.getName());
        System.out.println("是否为借口：" +
                stringClass.isInterface());
        System.out.println("是否为基本数据类型：" +
                stringClass.isPrimitive());
        System.out.println("是否为数组：" +
                stringClass.isArray());
        System.out.println("父类名称：" +
                stringClass.getSuperclass().getName());

//        Class stringClass = String.class; 另一种方式获取class实例
    }
}
