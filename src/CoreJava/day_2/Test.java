package CoreJava.day_2;

/**
 * @author 李智
 * @date 2016/11/28
 */
/*
public class Test {
    public static void main(String[] args) {
        String str = new String();
        Lee lee = new Lee();
        lee.call(str);
    }

    static class Lee {
        public void call(Object obj) {
            System.out.println("这是个Object");
        }

        public void call(String str) {
            System.out.println("这是个String");
        }
    }
}*/
//重写方法
/*
public class Test {
    public static void main(String[] args) {
        String str = new String();
        Lee lee = new SecLee();
        lee.say(str);
    }

    static class Lee {
        public void say(String str) {
            System.out.println("这是个String");
        }
    }

    static class SecLee extends Lee {
        @Override
        public void say(String str) {
            System.out.println("这是第二李的String");
        }
    }
}*/
//重载方法
public class Test {
    public static void main(String[] args) {
        String str = new String();
        Lee lee = new SecLee();
        lee.say(str);
    }

    static class Lee {
        public void say(Object obj) {
            System.out.println("这是Object");
        }

        public void say(String str) {
            System.out.println("这是String");
        }
    }

    static class SecLee extends Lee {
        @Override
        public void say(Object obj) {
            System.out.println("这是第二李的Object");
        }

        @Override
        public void say(String str) {
            System.out.println("这是第二李的String");
        }
    }
}
