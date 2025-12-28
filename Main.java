import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Human human = new Human("Alex", 20, true);
        Employee employee = new Employee("Diana", 28, true, "Designer", 3500.0f);

        System.out.print("Student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Student age: ");
        int studentAge = scanner.nextInt();

        System.out.print("Student alive (true/false): ");
        boolean studentAlive = scanner.nextBoolean();

        scanner.nextLine();

        System.out.print("Student major: ");
        String studentMajor = scanner.nextLine();

        System.out.print("Student GPA: ");
        float studentGpa = scanner.nextFloat();

        Student student = new Student(studentName, studentAge, studentAlive, studentMajor, studentGpa);

        System.out.println(human.sayHello());
        System.out.println(human.getInfo());

        System.out.println(employee.sayHello());
        System.out.println(employee.getInfo());

        System.out.println(student.sayHello());
        System.out.println(student.getInfo());

        System.out.println("Student count: " + Student.studentCount);
        human.setName("Andrew (updated)");
        System.out.println("New human name: " + human.getName());

        employee.setSalary(employee.getSalary() + 500.0f);
        System.out.println("New employee salary: " + employee.getSalary());

        student.setGpa(student.getGpa() + 0.2f);
        System.out.println("New student GPA: " + student.getGpa());
    }
}
