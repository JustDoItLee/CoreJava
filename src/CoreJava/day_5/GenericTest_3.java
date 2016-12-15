package CoreJava.day_5;

/**
 * @author 李智
 * @date 2016/12/15
 */
public class GenericTest_3 {
    public static void main(String[] args) {

        Box<String> name = new Box<String>("core");
        System.out.println("name:" + name.getData());
    }

}

class Box<T> {

    private T data;

    public Box() {

    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

}