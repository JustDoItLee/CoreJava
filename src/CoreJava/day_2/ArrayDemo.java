package CoreJava.day_2;

/**
 * @author 李智
 * @date 2016/12/5
 */
public class ArrayDemo {
    public static void main(String[] args) {
        short[] sArr = new short[5];
        int[] iArr = new int[5];
        long[] lArr = new long[5];
        float[] fArr = new float[5];
        double[] dArr = new double[5];
        byte[] bArr = new byte[5];
        boolean[] zArr = new boolean[5];
        String[] strArr = new String[5];

        System.out.println("short 数组：" + sArr.getClass());
        System.out.println("int 数组：" + iArr.getClass());
        System.out.println("long 数组：" + lArr.getClass());
        System.out.println("float 数组：" + fArr.getClass());
        System.out.println("double 数组：" + dArr.getClass());
        System.out.println("byte 数组：" + bArr.getClass());
        System.out.println("boolean 数组：" + zArr.getClass());
        System.out.println("String 数组：" + strArr.getClass());
    }
}
