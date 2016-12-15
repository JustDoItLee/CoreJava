package CoreJava.day_5;

/**
 * @author 李智
 * @date 2016/12/15
 */
public class GenericTest_6 {
    public static void main(String[] args) {

        Box<Number> name = new Box<Number>(99);
        Box<Integer> age = new Box<Integer>(712);

        getData(name);

        //The method getData(Box<Number>) in the type GenericTest is
        //not applicable for the arguments (Box<Integer>)
        getData(age);   // 1

    }

    public static void getData(Box<Number> data) {
        System.out.println("data :" + data.getData());
    }

}
