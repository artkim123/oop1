public class Student extends Human {
    private String major;
    private float gpa;

    public static int studentCount = 0;

    public Student(String name, int age, boolean alive, String major, float gpa) {
        super(name, age, alive);
        this.major = major;
        this.gpa = gpa;
        studentCount++;
    }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public float getGpa() { return gpa; }
    public void setGpa(float gpa) { this.gpa = gpa; }

    @Override
    public String getInfo() {
        return "Student: name=" + getName() + ", age=" + getAge() + ", alive=" + isAlive()
                + ", major=" + major + ", gpa=" + gpa;
    }
}
