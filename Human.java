public class Human {
    private int age;
    private String name;
    private boolean alive;

    public Human(String name, int age, boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public boolean isAlive() { return alive; }
    public void setAlive(boolean alive) { this.alive = alive; }

    public String sayHello() {
        return "Hello, my name is " + name;
    }

    public String getInfo() {
        return "Human: name=" + name + ", age=" + age + ", alive=" + alive;
    }
}
