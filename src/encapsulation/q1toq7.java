import java.util.ArrayList;

class Person1 {
    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

class BankAccount1 {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class Rectangle1 {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

class Employee1 {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_salary() {
        return String.format("$%.2f", employee_salary);
    }

    public void setEmployee_salary(double employee_salary) {
        this.employee_salary = employee_salary;
    }
}

class Circle1 {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Car1 {
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}

class Student1 {
    private int student_id;
    private String student_name;
    private ArrayList<Double> grades = new ArrayList<>();

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public boolean addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            return true;
        } else {
            System.out.println("Invalid grade: " + grade);
            return false;
        }
    }
}

public class q1toq7 {
    public static void main(String[] args) {
        // Q1
        System.out.println("\n--- Q1: Person ---");
        Person1 p = new Person1();
        p.setName("Alice");
        p.setAge(30);
        p.setCountry("USA");
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Country: " + p.getCountry());

        // Q2
        System.out.println("\n--- Q2: BankAccount ---");
        BankAccount1 ba = new BankAccount1();
        ba.setAccountNumber("123456789");
        ba.setBalance(5000.75);
        System.out.println("Account Number: " + ba.getAccountNumber());
        System.out.println("Balance: " + ba.getBalance());

        // Q3
        System.out.println("\n--- Q3: Rectangle ---");
        Rectangle1 r = new Rectangle1();
        r.setLength(5.0);
        r.setWidth(3.0);
        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());

        // Q4
        System.out.println("\n--- Q4: Employee ---");
        Employee1 e = new Employee1();
        e.setEmployee_id(101);
        e.setEmployee_name("Bob");
        e.setEmployee_salary(75000.50);
        System.out.println("Employee ID: " + e.getEmployee_id());
        System.out.println("Employee Name: " + e.getEmployee_name());
        System.out.println("Employee Salary: " + e.getEmployee_salary());

        // Q5
        System.out.println("\n--- Q5: Circle ---");
        Circle1 c = new Circle1();
        c.setRadius(4.0);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Perimeter: " + c.calculatePerimeter());

        // Q6
        System.out.println("\n--- Q6: Car ---");
        Car1 car = new Car1();
        car.setCompany_name("Toyota");
        car.setModel_name("Camry");
        car.setYear(2022);
        car.setMileage(15000.5);
        System.out.println("Company: " + car.getCompany_name());
        System.out.println("Model: " + car.getModel_name());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage: " + car.getMileage());

        // Q7
        System.out.println("\n--- Q7: Student ---");
        Student1 s = new Student1();
        s.setStudent_id(202);
        s.setStudent_name("Charlie");
        s.addGrade(85.5);
        s.addGrade(92.0);
        s.addGrade(105.0); // Invalid
        System.out.println("Student ID: " + s.getStudent_id());
        System.out.println("Student Name: " + s.getStudent_name());
        System.out.println("Grades: " + s.getGrades());
    }
}
