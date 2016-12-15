package CoreJava.day_5;

/**
 * @author 李智
 * @date 2016/12/15
 */
public class GenericTest_8 {
    public static void main(String[] args) {

        Box<String> name = new Box<String>("core");
        Box<Integer> age = new Box<Integer>(712);
        Box<Number> number = new Box<Number>(314);

        getData(name);
        getData(age);
        getData(number);

        //getUpperNumberData(name); // 1
        getUpperNumberData(age);    // 2
        getUpperNumberData(number); // 3
    }

    public static void getData(Box<?> data) {
        System.out.println("data :" + data.getData());
    }

    public static void getUpperNumberData(Box<? extends Number> data) {
        System.out.println("data :" + data.getData());
    }

}
