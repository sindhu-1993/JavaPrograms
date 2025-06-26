// 4. Write a Java program to count a number of Unicode code points in the specified text range of a String.  

// Sample Output:

// Original String : ramaresource.com                                                                                
// Codepoint count = 9

public class q4 {
    public static void main(String[] args) {
        String str = "ramaresource.com";
        int start = 0;
        int end = 9; // exclusive
        int codePointCount = str.codePointCount(start, end);
        System.out.println("Original String : " + str);
        System.out.println("Codepoint count = " + codePointCount);
    }
}
