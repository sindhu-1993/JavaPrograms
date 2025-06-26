// 2. Write a Java program to get the character (Unicode code point) at the given index within the String.  

// Sample Output:

// Original String : google.com                                                                              
// Character(unicode point) = 51                                                                                 
// Character(unicode point) = 101 

public class q2 {
    public static void main(String[] args) {
        String str = "google.com";
        int index1 = 3;
        int index2 = 5;

        System.out.println("Original String : " + str);
        int codePoint1 = str.codePointAt(index1);
        int codePoint2 = str.codePointAt(index2);

        System.out.println("Character(unicode point) = " + codePoint1);
        System.out.println("Character(unicode point) = " + codePoint2);
    }
}