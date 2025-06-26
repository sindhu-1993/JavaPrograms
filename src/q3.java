// 3. Write a Java program to get the character (Unicode code point) before the specified index within the String.  

// Sample Output:

// Original String : ramaresource.com                                                                              
// Character(unicode point) = 119                                                                                
// Character(unicode point) = 99

public class q3 {
    public static void main(String[] args) {
        String str = "ramaresource.com";
        System.out.println("Original String : " + str);

        int index1 = 1;
        int index2 = 15;

        int codePoint1 = str.codePointBefore(index1);
        int codePoint2 = str.codePointBefore(index2);

        System.out.println("Character(unicode point) = " + codePoint1);
        System.out.println("Character(unicode point) = " + codePoint2);
    }
}
