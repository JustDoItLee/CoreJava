package CoreJava.day_5;

/**
 * @author 李智
 * @date 2016/12/15
 */
public class GenericTest_5 {
    public static void main(String[] args) {

        Boxs<Integer> a = new Boxs<Integer>(712);
//        Box<Number> b = a;  // 1
        Boxs<Float> f = new Boxs<Float>(3.14f);
//        b.setData(f);        // 2

    }

    public static void getData(Box<Number> data) {
        System.out.println("data :" + data.getData());
    }
}

class Boxs<T> {

    private T data;

    public Boxs() {

    }

    public Boxs(T data) {
        setData(data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}