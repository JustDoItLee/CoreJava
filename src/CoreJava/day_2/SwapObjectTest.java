package CoreJava.day_2;

/**
 * @author 李智
 * @date 2016/11/26
 *
 * 交换两个对象引用测试
 */
public class SwapObjectTest {
    public static void swap(Employee x , Employee y){
        Employee temp = x;
        x = y ;
        y = temp;
    }

    public static void main(String[] args) {
        Employee a = new Employee("jack",1000);
        Employee b = new Employee("mao",2000);
        swap(a,b);
        System.out.println(a.getName());//输出jack
    }
}

//对象引用进行的是值传递
//方法不能改变基本数据类型的参数
//方法可以改变一个对象的参数的状态
//方法不能改变对象参数引用一个新的对象
