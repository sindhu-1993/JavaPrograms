// 9. Write a Java program to compare a given string to the specified character sequence.  

// Sample Output:

// Comparing example.com and example.com: true                                                                   
// Comparing Example.com and example.com: false

public class q9 {
    public static void main(String[] args) {
        String str1 = "example.com";
        CharSequence cs1 = "example.com";
        CharSequence cs2 = "Example.com";

        System.out.println("Comparing " + str1 + " and " + cs1 + ": " + str1.contentEquals(cs1));
        System.out.println("Comparing " + cs2 + " and " + str1 + ": " + cs2.equals(str1));
    }
}