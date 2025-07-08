// Q1: Animal Family
class AnimalQ1 {
    void Sound() {
        System.out.println("Some generic animal sound");
    }
}

class BirdQ1 extends AnimalQ1 {
    void Sound() {
        System.out.println("Chirp chirp");
    }
}

class CatQ1 extends AnimalQ1 {
    void Sound() {
        System.out.println("Meow");
    }
}

// Q2: Vehicle speedUp
class VehicleQ2 {
    int speed = 0;

    void speedUp() {
        speed += 5;
        System.out.println("Vehicle speed: " + speed);
    }
}

class CarQ2 extends VehicleQ2 {
    void speedUp() {
        speed += 20;
        System.out.println("Car speed: " + speed);
    }
}

class BicycleQ2 extends VehicleQ2 {
    void speedUp() {
        speed += 2;
        System.out.println("Bicycle speed: " + speed);
    }
}

// Q3: Shape calculateArea
abstract class ShapeQ3 {
    abstract double calculateArea();
}

class CircleQ3 extends ShapeQ3 {
    double radius;

    CircleQ3(double r) {
        radius = r;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class RectangleQ3 extends ShapeQ3 {
    double width, height;

    RectangleQ3(double w, double h) {
        width = w;
        height = h;
    }

    double calculateArea() {
        return width * height;
    }
}

class TriangleQ3 extends ShapeQ3 {
    double base, height;

    TriangleQ3(double b, double h) {
        base = b;
        height = h;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Q4: Employee calculateSalary
class EmployeeQ4 {
    double calculateSalary() {
        return 0;
    }
}

class ManagerQ4 extends EmployeeQ4 {
    double calculateSalary() {
        return 80000;
    }
}

class ProgrammerQ4 extends EmployeeQ4 {
    double calculateSalary() {
        return 60000;
    }
}

// Q5: Sports play
class SportsQ5 {
    void play() {
        System.out.println("Playing some sport");
    }
}

class FootballQ5 extends SportsQ5 {
    void play() {
        System.out.println("Playing Football");
    }
}

class BasketballQ5 extends SportsQ5 {
    void play() {
        System.out.println("Playing Basketball");
    }
}

class RugbyQ5 extends SportsQ5 {
    void play() {
        System.out.println("Playing Rugby");
    }
}

// Q6: Shape getArea and getPerimeter
abstract class ShapeQ6 {
    abstract double getArea();

    abstract double getPerimeter();
}

class CircleQ6 extends ShapeQ6 {
    double radius;

    CircleQ6(double r) {
        radius = r;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class RectangleQ6 extends ShapeQ6 {
    double width, height;

    RectangleQ6(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

class TriangleQ6 extends ShapeQ6 {
    double a, b, c;

    TriangleQ6(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double getPerimeter() {
        return a + b + c;
    }
}

// Q7: Animal move and makeSound
class AnimalQ7 {
    void move() {
        System.out.println("Animal moves");
    }

    void makeSound() {
        System.out.println("Animal sound");
    }
}

class BirdQ7 extends AnimalQ7 {
    void move() {
        System.out.println("Bird flies");
    }

    void makeSound() {
        System.out.println("Tweet");
    }
}

class PantheraQ7 extends AnimalQ7 {
    void move() {
        System.out.println("Panthera prowls");
    }

    void makeSound() {
        System.out.println("Roar");
    }
}

// Q8: Shape draw and calculateArea
abstract class ShapeQ8 {
    abstract void draw();

    abstract double calculateArea();
}

class CircleQ8 extends ShapeQ8 {
    double radius;

    CircleQ8(double r) {
        radius = r;
    }

    void draw() {
        System.out.println("Drawing Circle");
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class SquareQ8 extends ShapeQ8 {
    double side;

    SquareQ8(double s) {
        side = s;
    }

    void draw() {
        System.out.println("Drawing Square");
    }

    double calculateArea() {
        return side * side;
    }
}

class TriangleQ8 extends ShapeQ8 {
    double base, height;

    TriangleQ8(double b, double h) {
        base = b;
        height = h;
    }

    void draw() {
        System.out.println("Drawing Triangle");
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Q9: BankAccount deposit and withdraw
class BankAccountQ9 {
    double balance = 0;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }
}

class SavingsAccountQ9 extends BankAccountQ9 {
    void withdraw(double amount) {
        if (amount > 1000) {
            System.out.println("Withdrawal limit exceeded for SavingsAccount");
        } else if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class CheckingAccountQ9 extends BankAccountQ9 {
    void withdraw(double amount) {
        double fee = 1.5;
        if (amount + fee <= balance) {
            balance -= (amount + fee);
        } else {
            System.out.println("Insufficient funds for CheckingAccount");
        }
    }
}

// Q10: Animal eat and sound
class AnimalQ10 {
    void eat() {
        System.out.println("Animal eats");
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class LionQ10 extends AnimalQ10 {
    void eat() {
        System.out.println("Lion eats meat");
    }

    void sound() {
        System.out.println("Roar");
    }
}

class TigerQ10 extends AnimalQ10 {
    void eat() {
        System.out.println("Tiger eats meat");
    }

    void sound() {
        System.out.println("Growl");
    }
}

class PantherQ10 extends AnimalQ10 {
    void eat() {
        System.out.println("Panther eats meat");
    }

    void sound() {
        System.out.println("Screech");
    }
}

// Q11: Vehicle startEngine and stopEngine
class VehicleQ11 {
    void startEngine() {
        System.out.println("Vehicle engine started");
    }

    void stopEngine() {
        System.out.println("Vehicle engine stopped");
    }
}

class CarQ11 extends VehicleQ11 {
    void startEngine() {
        System.out.println("Car engine started with key");
    }

    void stopEngine() {
        System.out.println("Car engine stopped");
    }
}

class MotorcycleQ11 extends VehicleQ11 {
    void startEngine() {
        System.out.println("Motorcycle engine started with button");
    }

    void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }
}

// Q12: Shape draw and calculateArea (Circle and Cylinder)
abstract class ShapeQ12 {
    abstract void draw();

    abstract double calculateArea();
}

class CircleQ12 extends ShapeQ12 {
    double radius;

    CircleQ12(double r) {
        radius = r;
    }

    void draw() {
        System.out.println("Drawing Circle");
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class CylinderQ12 extends ShapeQ12 {
    double radius, height;

    CylinderQ12(double r, double h) {
        radius = r;
        height = h;
    }

    void draw() {
        System.out.println("Drawing Cylinder");
    }

    double calculateArea() {
        // Total surface area = 2πr(h + r)
        return 2 * Math.PI * radius * (height + radius);
    }
}

// Main class to demonstrate
public class q1toq12 {
    public static void main(String[] args) {
        // Q1
        System.out.println("\n--- Q1: Animal Family ---");
        AnimalQ1 a1 = new BirdQ1();
        AnimalQ1 a2 = new CatQ1();
        a1.Sound();
        a2.Sound();

        // Q2
        System.out.println("\n--- Q2: Vehicle speedUp ---");
        VehicleQ2 v1 = new CarQ2();
        VehicleQ2 v2 = new BicycleQ2();
        v1.speedUp();
        v2.speedUp();

        // Q3
        System.out.println("\n--- Q3: Shape calculateArea ---");
        ShapeQ3 s1 = new CircleQ3(3);
        ShapeQ3 s2 = new RectangleQ3(4, 5);
        ShapeQ3 s3 = new TriangleQ3(3, 6);
        System.out.println("Circle area: " + s1.calculateArea());
        System.out.println("Rectangle area: " + s2.calculateArea());
        System.out.println("Triangle area: " + s3.calculateArea());

        // Q4
        System.out.println("\n--- Q4: Employee calculateSalary ---");
        EmployeeQ4 e1 = new ManagerQ4();
        EmployeeQ4 e2 = new ProgrammerQ4();
        System.out.println("Manager salary: " + e1.calculateSalary());
        System.out.println("Programmer salary: " + e2.calculateSalary());

        // Q5
        System.out.println("\n--- Q5: Sports play ---");
        SportsQ5 sp1 = new FootballQ5();
        SportsQ5 sp2 = new BasketballQ5();
        SportsQ5 sp3 = new RugbyQ5();
        sp1.play();
        sp2.play();
        sp3.play();

        // Q6
        System.out.println("\n--- Q6: Shape getArea and getPerimeter ---");
        ShapeQ6 sh1 = new CircleQ6(2);
        ShapeQ6 sh2 = new RectangleQ6(2, 3);
        ShapeQ6 sh3 = new TriangleQ6(3, 4, 5);
        System.out.println("Circle2 area: " + sh1.getArea() + ", perimeter: " + sh1.getPerimeter());
        System.out.println("Rectangle2 area: " + sh2.getArea() + ", perimeter: " + sh2.getPerimeter());
        System.out.println("Triangle2 area: " + sh3.getArea() + ", perimeter: " + sh3.getPerimeter());

        // Q7
        System.out.println("\n--- Q7: Animal move and makeSound ---");
        AnimalQ7 an1 = new BirdQ7();
        AnimalQ7 an2 = new PantheraQ7();
        an1.move();
        an1.makeSound();
        an2.move();
        an2.makeSound();

        // Q8
        System.out.println("\n--- Q8: Shape draw and calculateArea ---");
        ShapeQ8 sh31 = new CircleQ8(2);
        ShapeQ8 sh32 = new SquareQ8(3);
        ShapeQ8 sh33 = new TriangleQ8(4, 5);
        sh31.draw();
        System.out.println("Area: " + sh31.calculateArea());
        sh32.draw();
        System.out.println("Area: " + sh32.calculateArea());
        sh33.draw();
        System.out.println("Area: " + sh33.calculateArea());

        // Q9
        System.out.println("\n--- Q9: BankAccount deposit and withdraw ---");
        SavingsAccountQ9 sa = new SavingsAccountQ9();
        CheckingAccountQ9 ca = new CheckingAccountQ9();
        sa.deposit(2000);
        sa.withdraw(500);
        System.out.println("Savings balance: " + sa.balance);
        ca.deposit(2000);
        ca.withdraw(500);
        System.out.println("Checking balance: " + ca.balance);

        // Q10
        System.out.println("\n--- Q10: Animal eat and sound ---");
        AnimalQ10 l = new LionQ10();
        AnimalQ10 t = new TigerQ10();
        AnimalQ10 p = new PantherQ10();
        l.eat();
        l.sound();
        t.eat();
        t.sound();
        p.eat();
        p.sound();

        // Q11
        System.out.println("\n--- Q11: Vehicle startEngine and stopEngine ---");
        VehicleQ11 car2 = new CarQ11();
        VehicleQ11 moto = new MotorcycleQ11();
        car2.startEngine();
        car2.stopEngine();
        moto.startEngine();
        moto.stopEngine();

        // Q12
        System.out.println("\n--- Q12: Shape draw and calculateArea (Circle and Cylinder) ---");
        ShapeQ12 c4 = new CircleQ12(2);
        ShapeQ12 cyl = new CylinderQ12(2, 5);
        c4.draw();
        System.out.println("Circle4 area: " + c4.calculateArea());
        cyl.draw();
        System.out.println("Cylinder surface area: " + cyl.calculateArea());
    }
}
