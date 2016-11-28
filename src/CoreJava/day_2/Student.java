package CoreJava.day_2;

/**
 * @author 李智
 * @date 2016/11/28
 */
public class Student extends Person {
    private String major;

    public Student(String major, String name, int age) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "i am a student for" + major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' + "major='" + major + '\'' +
                '}';
    }
}
