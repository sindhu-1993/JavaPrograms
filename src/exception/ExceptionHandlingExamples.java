package exception;

import java.io.*;
import java.util.*;

public class ExceptionHandlingExamples {

    // 1. Throws and catches a basic exception
    public static void problem1() {
        try {
            throw new Exception("This is a custom exception in problem 1");
        } catch (Exception e) {
            System.out.println("Problem 1: Caught exception - " + e.getMessage());
        }
    }

    // 2. Throws an exception if the number is odd
    public static void problem2(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception("Problem 2: Number is odd");
        } else {
            System.out.println("Problem 2: Number is even");
        }
    }

    // 3. Reads a file and throws exception if not found
    public static void problem3(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        System.out.println("Problem 3: File found. Reading contents...");
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

    // 4. Throws exception if any number is positive in file
    public static void problem4(String fileName) throws Exception {
        Scanner sc = new Scanner(new File(fileName));
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num > 0) {
                sc.close();
                throw new Exception("Problem 4: Found positive number: " + num);
            }
        }
        sc.close();
        System.out.println("Problem 4: All numbers are non-positive.");
    }

    // 5. Throws exception if file is empty
    public static void problem5(String fileName) throws Exception {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        if (!sc.hasNextLine()) {
            sc.close();
            throw new Exception("Problem 5: File is empty");
        } else {
            System.out.println("Problem 5: File has content");
        }
        sc.close();
    }

    // 6. Throws exception if duplicate numbers found in list
    public static void problem6(List<Integer> numbers) throws Exception {
        Set<Integer> seen = new HashSet<>();
        for (int num : numbers) {
            if (!seen.add(num)) {
                throw new Exception("Problem 6: Duplicate number found - " + num);
            }
        }
        System.out.println("Problem 6: All numbers are unique");
    }

    // 7. Throws exception if string does not contain vowels
    public static void problem7(String input) throws Exception {
        if (!input.toLowerCase().matches(".*[aeiou].*")) {
            throw new Exception("Problem 7: No vowels found in string");
        } else {
            System.out.println("Problem 7: String contains vowels");
        }
    }

    public static void main(String[] args) {
        problem1();

        try {
            problem2(4); // Change to 5 to see exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            problem3("test.txt"); // File must exist in project root
        } catch (Exception e) {
            System.out.println("Problem 3: " + e.getMessage());
        }

        try {
            problem4("numbers.txt"); // File should contain only 0 or negative
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            problem5("check.txt"); // File should be empty to raise exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            List<Integer> nums = Arrays.asList(1, 2, 3, 4); // Add duplicate like (2, 2) to test
            problem6(nums);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            problem7("Java"); // Try "bcdfg" to raise exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
