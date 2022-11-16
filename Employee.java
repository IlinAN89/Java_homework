package Java_homework.Java_homework;

public class Employee {
    private static int employeeCount;
    private String surname;
    private String name;
    private String middle_name;
    private String position;
    private String email;
    private long phone;
    private double salary;
    private int age;


    public Employee(String surname, String name, String middle_name, String position, String email, long phone, double salary, int age) {
        this.surname = surname;
        this.name = name;
        this.middle_name = middle_name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

        employeeCount++;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println(String.format("Сотрудник - %s %s %s (должность: %s, возраст: %s). Данные сотрудника: email - %s, телефон - %s, зарплата - %s.", surname, name, middle_name, position, age, email, phone, salary));
    }
}