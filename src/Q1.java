
// 1. Write a Java program to get the character at the given index within the String.  

// Sample Output:

// Original String = Java Exercises!                                                                             
// The character at position 0 is J                                                                              
// The character at position 10 is i 

public class Q1 {
    public static void main(String[] args) {
        String str = "Java Exercises!";
        System.out.println("Original String = " + str);
        int index1 = 0;
        int index2 = 10;
        System.out.println("The character at position " + index1 + " is " + str.charAt(index1));
        System.out.println("The character at position " + index2 + " is " + str.charAt(index2));
    }
}
