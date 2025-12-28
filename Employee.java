public class Employee extends Human {
    private String position;
    private float salary;

    public Employee(String name, int age, boolean alive, String position, float salary) {
        super(name, age, alive);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }

    @Override
    public String getInfo() {
        return "Employee: name=" + getName() + ", age=" + getAge() + ", alive=" + isAlive()
                + ", position=" + position + ", salary=" + salary;
    }
}
