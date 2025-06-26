// 10. Write a Java program to compare a given string to the specified string buffer.  

// Sample Output:

// Comparing example.com and example.com: true                                                                   
// Comparing Example.com and example.com: false 

public class q10 {
    public static void main(String[] args) {
        String str1 = "example.com";
        StringBuffer sb1 = new StringBuffer("example.com");
        String str2 = "Example.com";

        System.out.println("Comparing " + str1 + " and " + sb1 + ": " + str1.contentEquals(sb1));
        System.out.println("Comparing " + str2 + " and " + sb1 + ": " + str2.contentEquals(sb1));
    }
}
