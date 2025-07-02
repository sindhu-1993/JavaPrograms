
import java.util.*;
import java.time.*;

// 1. Person
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// 2. Dog
class Dog {
    private String name, breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void printInfo() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }
}

// 3. Rectangle
class Rectangle {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void printInfo() {
        System.out.println("Area: " + area() + ", Perimeter: " + perimeter());
    }
}

// 4. Circle
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void printInfo() {
        System.out.printf("Area: %.2f, Circumference: %.2f\n", area(), circumference());
    }
}

// 5. Book with collection
class Book {
    private String title, author, isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ")";
    }

    // Static collection for demonstration
    private static List<Book> collection = new ArrayList<>();

    public static void addBook(Book b) {
        collection.add(b);
    }

    public static void removeBook(Book b) {
        collection.remove(b);
    }

    public static void printCollection() {
        for (Book b : collection)
            System.out.println(b);
    }
}

// 6. Employee with salary update
class Employee {
    private String name, jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public void printInfo() {
        System.out.println(name + " (" + jobTitle + "), Salary: " + salary);
    }
}

// 7. Bank and Account
class Account {
    private String accountNumber, customerName;
    private double balance;

    public Account(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance)
            return false;
        balance -= amount;
        return true;
    }

    public String toString() {
        return accountNumber + ": " + customerName + ", Balance: " + balance;
    }
}

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void removeAccount(Account acc) {
        accounts.remove(acc);
    }

    public Account findAccount(String accNum) {
        for (Account a : accounts)
            if (a.getAccountNumber().equals(accNum))
                return a;
        return null;
    }

    public void deposit(String accNum, double amt) {
        Account a = findAccount(accNum);
        if (a != null)
            a.deposit(amt);
    }

    public boolean withdraw(String accNum, double amt) {
        Account a = findAccount(accNum);
        return a != null && a.withdraw(amt);
    }

    public void printAccounts() {
        for (Account a : accounts)
            System.out.println(a);
    }
}

// 8. TrafficLight
class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public boolean isRed() {
        return "red".equalsIgnoreCase(color);
    }

    public boolean isGreen() {
        return "green".equalsIgnoreCase(color);
    }

    public void printInfo() {
        System.out.println("Color: " + color + ", Duration: " + duration);
    }
}

// 9. Employee with hire date
class EmployeeWithHireDate {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public EmployeeWithHireDate(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int yearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void printInfo() {
        System.out.println(name + ", Salary: " + salary + ", Years of Service: " + yearsOfService());
    }
}

// 10. Student with courses
class Student {
    private String name;
    private String grade;
    private List<String> courses = new ArrayList<>();

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void printInfo() {
        System.out.println(name + ", Grade: " + grade + ", Courses: " + courses);
    }
}

// 11. Library with books
class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void removeBook(Book b) {
        books.remove(b);
    }

    public void printBooks() {
        for (Book b : books)
            System.out.println(b);
    }
}

// 12. Airplane
class Airplane {
    private String flightNumber, destination;
    private LocalTime departureTime;
    private boolean delayed = false;

    public Airplane(String flightNumber, String destination, LocalTime departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public void delayFlight(int minutes) {
        departureTime = departureTime.plusMinutes(minutes);
        delayed = true;
    }

    public String getStatus() {
        return delayed ? "Delayed" : "On Time";
    }

    public void printInfo() {
        System.out.println(
                flightNumber + " to " + destination + " departs at " + departureTime + " (" + getStatus() + ")");
    }
}

// 13. Inventory
class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int q) {
        this.quantity = q;
    }

    public String toString() {
        return name + " (" + quantity + ")";
    }
}

class Inventory {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(Product p) {
        products.remove(p);
    }

    public List<Product> lowInventory(int threshold) {
        List<Product> low = new ArrayList<>();
        for (Product p : products)
            if (p.getQuantity() < threshold)
                low.add(p);
        return low;
    }

    public void printProducts() {
        for (Product p : products)
            System.out.println(p);
    }
}

// 14. School
class School {
    private List<Student> students = new ArrayList<>();
    private List<String> teachers = new ArrayList<>();
    private List<String> classes = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(Student s) {
        students.remove(s);
    }

    public void addTeacher(String t) {
        teachers.add(t);
    }

    public void removeTeacher(String t) {
        teachers.remove(t);
    }

    public void createClass(String c) {
        classes.add(c);
    }

    public void printInfo() {
        System.out.println("Students: " + students.size() + ", Teachers: " + teachers.size() + ", Classes: " + classes);
    }
}

// 15. MusicLibrary
class Song {
    private String title, artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String toString() {
        return title + " by " + artist;
    }
}

class MusicLibrary {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song s) {
        songs.add(s);
    }

    public void removeSong(Song s) {
        songs.remove(s);
    }

    public void playRandomSong() {
        if (songs.isEmpty())
            System.out.println("No songs to play.");
        else
            System.out.println("Playing: " + songs.get(new Random().nextInt(songs.size())));
    }
}

// 16. Shape (abstract) and subclasses
abstract class Shape {
    public abstract double area();

    public abstract double perimeter();
}

class RectangleShape extends Shape {
    private double width, height;

    public RectangleShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}

class CircleShape extends Shape {
    private double radius;

    public CircleShape(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class TriangleShape extends Shape {
    private double a, b, c;

    public TriangleShape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter() {
        return a + b + c;
    }
}

// 17. Movie
class Movie {
    private String title, director;
    private List<String> actors = new ArrayList<>();
    private List<String> reviews = new ArrayList<>();

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public void addActor(String actor) {
        actors.add(actor);
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void printInfo() {
        System.out.println(title + " directed by " + director + ", Actors: " + actors + ", Reviews: " + reviews);
    }
}

// 18. Restaurant
class MenuItem {
    private String name;
    private double price;
    private List<Integer> ratings = new ArrayList<>();

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addRating(int rating) {
        ratings.add(rating);
    }

    public double averageRating() {
        if (ratings.isEmpty())
            return 0;
        int sum = 0;
        for (int r : ratings)
            sum += r;
        return (double) sum / ratings.size();
    }

    public String toString() {
        return name + " ($" + price + "), Avg Rating: " + averageRating();
    }
}

class Restaurant {
    private List<MenuItem> menu = new ArrayList<>();

    public void addItem(MenuItem item) {
        menu.add(item);
    }

    public void removeItem(MenuItem item) {
        menu.remove(item);
    }

    public void printMenu() {
        for (MenuItem m : menu)
            System.out.println(m);
    }
}

// 19. FlightHotelBooking
class Reservation {
    private String type, details;

    public Reservation(String type, String details) {
        this.type = type;
        this.details = details;
    }

    public String toString() {
        return type + ": " + details;
    }
}

class BookingSystem {
    private List<Reservation> reservations = new ArrayList<>();

    public List<String> searchFlights(String from, String to) {
        return Arrays.asList("Flight1: " + from + " to " + to, "Flight2: " + from + " to " + to);
    }

    public List<String> searchHotels(String city) {
        return Arrays.asList("HotelA in " + city, "HotelB in " + city);
    }

    public void bookReservation(String type, String details) {
        reservations.add(new Reservation(type, details));
    }

    public void cancelReservation(Reservation r) {
        reservations.remove(r);
    }

    public void printReservations() {
        for (Reservation r : reservations)
            System.out.println(r);
    }
}

// Main class to demonstrate
public class q1toq19 {
    public static void main(String[] args) {
        // 1
        Person p1 = new Person("Alice", 30), p2 = new Person("Bob", 25);
        p1.printInfo();
        p2.printInfo();

        // 2
        Dog d1 = new Dog("Max", "Labrador"), d2 = new Dog("Bella", "Beagle");
        d1.setName("Charlie");
        d1.setBreed("Golden Retriever");
        d1.printInfo();
        d2.printInfo();

        // 3
        Rectangle r = new Rectangle(5, 3);
        r.printInfo();

        // 4
        Circle c = new Circle(4);
        c.printInfo();

        // 5
        Book b1 = new Book("Java Basics", "John Doe", "123"), b2 = new Book("OOP", "Jane Smith", "456");
        Book.addBook(b1);
        Book.addBook(b2);
        Book.printCollection();
        Book.removeBook(b1);
        Book.printCollection();

        // 6
        Employee e = new Employee("Sam", "Manager", 5000);
        e.printInfo();
        e.updateSalary(6000);
        e.printInfo();

        // 7
        Bank bank = new Bank();
        Account acc1 = new Account("A001", "Tom", 1000), acc2 = new Account("A002", "Jerry", 2000);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.deposit("A001", 500);
        bank.withdraw("A002", 300);
        bank.printAccounts();

        // 8
        TrafficLight tl = new TrafficLight("red", 30);
        tl.printInfo();
        tl.changeColor("green", 45);
        tl.printInfo();

        // 9
        EmployeeWithHireDate eh = new EmployeeWithHireDate("Linda", 7000, LocalDate.of(2015, 6, 1));
        eh.printInfo();

        // 10
        Student s = new Student("Mike", "A");
        s.addCourse("Math");
        s.addCourse("Science");
        s.removeCourse("Math");
        s.printInfo();

        // 11
        Library lib = new Library();
        lib.addBook(b2);
        lib.printBooks();
        lib.removeBook(b2);
        lib.printBooks();

        // 12
        Airplane ap = new Airplane("FL123", "Paris", LocalTime.of(10, 30));
        ap.printInfo();
        ap.delayFlight(60);
        ap.printInfo();

        // 13
        Inventory inv = new Inventory();
        Product prod1 = new Product("Pen", 5), prod2 = new Product("Notebook", 2);
        inv.addProduct(prod1);
        inv.addProduct(prod2);
        inv.printProducts();
        System.out.println("Low inventory: " + inv.lowInventory(3));

        // 14
        School school = new School();
        school.addStudent(s);
        school.addTeacher("Mrs. Green");
        school.createClass("History");
        school.printInfo();

        // 15
        MusicLibrary ml = new MusicLibrary();
        Song song1 = new Song("SongA", "Artist1"), song2 = new Song("SongB", "Artist2");
        ml.addSong(song1);
        ml.addSong(song2);
        ml.playRandomSong();
        ml.removeSong(song1);
        ml.playRandomSong();

        // 16
        Shape rect = new RectangleShape(4, 5), circ = new CircleShape(3), tri = new TriangleShape(3, 4, 5);
        System.out.println("Rectangle area: " + rect.area() + ", perimeter: " + rect.perimeter());
        System.out.println("Circle area: " + circ.area() + ", perimeter: " + circ.perimeter());
        System.out.println("Triangle area: " + tri.area() + ", perimeter: " + tri.perimeter());

        // 17
        Movie m = new Movie("Inception", "Nolan");
        m.addActor("Leonardo");
        m.addReview("Great!");
        m.printInfo();

        // 18
        Restaurant rest = new Restaurant();
        MenuItem mi = new MenuItem("Pizza", 12.5);
        mi.addRating(5);
        mi.addRating(4);
        rest.addItem(mi);
        rest.printMenu();
        rest.removeItem(mi);
        rest.printMenu();

        // 19
        BookingSystem bs = new BookingSystem();
        System.out.println("Flights: " + bs.searchFlights("NYC", "LA"));
        System.out.println("Hotels: " + bs.searchHotels("LA"));
        bs.bookReservation("Flight", "NYC to LA");
        bs.bookReservation("Hotel", "HotelA in LA");
        bs.printReservations();
    }
}