package Inter;

import java.util.*;

// Question 1: Shape Interface
interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    double width, height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double getArea() {
        return width * height;
    }
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

// Question 2: Animal Interface
interface Animal {
    void bark();
}

class Dog implements Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Question 3: Flyable Interface
interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft is flying in space");
    }
}

class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky");
    }
}

class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter is flying above ground");
    }
}

// Question 4: Banking System
interface Account {
    void deposit(double amount);

    void withdraw(double amount);

    double calculateInterest();

    double viewBalance();
}

class SavingsAccount implements Account {
    private double balance;
    private double interestRate = 0.04;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public double viewBalance() {
        return balance;
    }

    public void savingsFeature() {
        System.out.println("Savings account feature");
    }
}

class CurrentAccount implements Account {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double calculateInterest() {
        return 0;
    }

    public double viewBalance() {
        return balance;
    }

    public void currentFeature() {
        System.out.println("Current account feature");
    }
}

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void showAccounts() {
        for (Account acc : accounts) {
            System.out.println("Balance: " + acc.viewBalance());
        }
    }
}

// Question 5: Resizable Interface
interface Resizable {
    void resizeWidth(int width);

    void resizeHeight(int height);
}

class ResizableRectangle implements Resizable {
    int width, height;

    public ResizableRectangle(int w, int h) {
        width = w;
        height = h;
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeHeight(int height) {
        this.height = height;
    }

    public void printSize() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

// Question 6: Drawable Interface
interface Drawable {
    void draw();
}

class DrawableCircle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class DrawableRectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class DrawableTriangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

// Question 7: Sortable Interface (Ascending)
interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements Sortable {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
    }
}

class SelectionSort implements Sortable {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            int tmp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = tmp;
        }
    }
}

// Question 8: Playable Interface
interface Playable {
    void play();
}

class Football implements Playable {
    public void play() {
        System.out.println("Playing Football");
    }
}

class Volleyball implements Playable {
    public void play() {
        System.out.println("Playing Volleyball");
    }
}

class Basketball implements Playable {
    public void play() {
        System.out.println("Playing Basketball");
    }
}

// Question 9: Searchable Interface
interface Searchable {
    boolean search(String keyword);
}

class Document implements Searchable {
    String text;

    Document(String t) {
        text = t;
    }

    public boolean search(String keyword) {
        return text.contains(keyword);
    }
}

class WebPage implements Searchable {
    String html;

    WebPage(String h) {
        html = h;
    }

    public boolean search(String keyword) {
        return html.contains(keyword);
    }
}

// Question 10: Encryptable Interface
interface Encryptable {
    String encrypt(String data);

    String decrypt(String encryptedData);
}

class AES implements Encryptable {
    public String encrypt(String data) {
        return "AES:" + data;
    }

    public String decrypt(String encryptedData) {
        return encryptedData.replace("AES:", "");
    }
}

class RSA implements Encryptable {
    public String encrypt(String data) {
        return "RSA:" + data;
    }

    public String decrypt(String encryptedData) {
        return encryptedData.replace("RSA:", "");
    }
}

// Question 11: Sortable Interface (Descending)
interface DescSortable {
    void sort(int[] arr);
}

class QuickSort implements DescSortable {
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++)
            if (arr[j] > pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        int tmp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = tmp;
        return i + 1;
    }
}

class MergeSort implements DescSortable {
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1], R = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2)
            arr[k++] = (L[i] > R[j]) ? L[i++] : R[j++];
        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }
}

// Main method to demonstrate all outputs
public class Interface {
    public static void main(String[] args) {
        // Q1
        System.out.println("Q1: Shape Areas");
        Shape rect = new Rectangle(5, 3);
        Shape circ = new Circle(2);
        Shape tri = new Triangle(4, 6);
        System.out.println("Rectangle: " + rect.getArea());
        System.out.println("Circle: " + circ.getArea());
        System.out.println("Triangle: " + tri.getArea());

        // Q2
        System.out.println("\nQ2: Animal Bark");
        Animal dog = new Dog();
        dog.bark();

        // Q3
        System.out.println("\nQ3: Flyable Objects");
        Flyable s = new Spacecraft(), a = new Airplane(), h = new Helicopter();
        s.fly_obj();
        a.fly_obj();
        h.fly_obj();

        // Q4
        System.out.println("\nQ4: Banking System");
        Bank bank = new Bank();
        SavingsAccount sa = new SavingsAccount();
        CurrentAccount ca = new CurrentAccount();
        sa.deposit(1000);
        ca.deposit(2000);
        bank.addAccount(sa);
        bank.addAccount(ca);
        bank.showAccounts();
        System.out.println("Savings Interest: " + sa.calculateInterest());
        sa.savingsFeature();
        ca.currentFeature();

        // Q5
        System.out.println("\nQ5: Resizable Rectangle");
        ResizableRectangle rr = new ResizableRectangle(10, 20);
        rr.printSize();
        rr.resizeWidth(30);
        rr.resizeHeight(40);
        rr.printSize();

        // Q6
        System.out.println("\nQ6: Drawable Shapes");
        Drawable dc = new DrawableCircle(), dr = new DrawableRectangle(), dt = new DrawableTriangle();
        dc.draw();
        dr.draw();
        dt.draw();

        // Q7
        System.out.println("\nQ7: Sortable Ascending");
        int[] arr1 = { 5, 2, 8, 1 };
        int[] arr2 = { 5, 2, 8, 1 };
        BubbleSort bs = new BubbleSort();
        SelectionSort ss = new SelectionSort();
        bs.sort(arr1);
        ss.sort(arr2);
        System.out.print("BubbleSort: ");
        for (int i : arr1)
            System.out.print(i + " ");
        System.out.print("\nSelectionSort: ");
        for (int i : arr2)
            System.out.print(i + " ");
        System.out.println();

        // Q8
        System.out.println("\nQ8: Playable Sports");
        Playable fb = new Football(), vb = new Volleyball(), bb = new Basketball();
        fb.play();
        vb.play();
        bb.play();

        // Q9
        System.out.println("\nQ9: Searchable");
        Document doc = new Document("Java programming language");
        WebPage wp = new WebPage("<html>Java is awesome</html>");
        System.out.println("Document search 'Java': " + doc.search("Java"));
        System.out.println("WebPage search 'Python': " + wp.search("Python"));

        // Q10
        System.out.println("\nQ10: Encryptable");
        Encryptable aes = new AES(), rsa = new RSA();
        String encAes = aes.encrypt("data"), encRsa = rsa.encrypt("data");
        System.out.println("AES Encrypted: " + encAes + ", Decrypted: " + aes.decrypt(encAes));
        System.out.println("RSA Encrypted: " + encRsa + ", Decrypted: " + rsa.decrypt(encRsa));

        // Q11
        System.out.println("\nQ11: Sortable Descending");
        int[] arr3 = { 5, 2, 8, 1 };
        int[] arr4 = { 5, 2, 8, 1 };
        QuickSort qs = new QuickSort();
        MergeSort ms = new MergeSort();
        qs.sort(arr3);
        ms.sort(arr4);
        System.out.print("QuickSort: ");
        for (int i : arr3)
            System.out.print(i + " ");
        System.out.print("\nMergeSort: ");
        for (int i : arr4)
            System.out.print(i + " ");
        System.out.println();
    }
}
