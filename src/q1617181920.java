// 16. Write a Java program to get the contents of a given string as a byte array.  

// Sample Output:

// The new String equals This is a sample String.
// .....................................................

// 17. Write a Java program to get the contents of a given string as a character array.  

// Sample Output:

// The char array equals "[C@2a139a55"
// .....................................................

// 18. Write a Java program to create a unique identifier of a given string.  

// Sample Output:

// The hash for Python Exercises. is 863132599 
// .....................................................

// 19. Write a Java program to get the index of all the characters of the alphabet.  

// Sample Output:

// a  b c  d e  f  g h i  j                                                                                     
// =========================                                                                                     
// 36 10 7 40 2 16 42 1 6 20                                                                                     

// k  l  m  n  o  p q  r  s  t                                                                                   
// ===========================                                                                                   
// 8 35 22 14 12 23 4 11 24 31                                                                                   

// u  v  w  x  y  z                                                                                              
// ================                                                                                              
// 5 27 13 18 38 37
// Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."

// .....................................................

// 20. Write a Java program to get the canonical representation of the string object.  

// Sample Output:

// str1 == str2? false                                                                                           
// str1 == str3? true
// .....................................................
public class q1617181920 {
    public static void main(String[] args) {
        // 16. Get contents of a given string as a byte array
        String str = "This is a sample String.";
        byte[] byteArray = str.getBytes();
        String newStr = new String(byteArray);
        System.out.println("The new String equals " + newStr + ".");
        System.out.println(".....................................................");

        // 17. Get contents of a given string as a character array
        char[] charArray = str.toCharArray();
        System.out.println("The char array equals \"" + charArray.toString() + "\"");
        System.out.println(".....................................................");

        // 18. Create a unique identifier (hash) of a given string
        String hashStr = "Python Exercises.";
        int hash = hashStr.hashCode();
        System.out.println("The hash for " + hashStr + " is " + hash);
        System.out.println(".....................................................");

        // 19. Get the index of all the characters of the alphabet in a sample string
        String sample = "The quick brown fox jumps over the lazy dog.";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("a  b c  d e  f  g h i  j");
        System.out.println("=========================");
        for (int i = 0; i < 10; i++) {
            char ch = alphabet.charAt(i);
            System.out.print(sample.indexOf(ch) + " ");
        }
        System.out.println("\n");
        System.out.println("k  l  m  n  o  p q  r  s  t");
        System.out.println("===========================");
        for (int i = 10; i < 20; i++) {
            char ch = alphabet.charAt(i);
            System.out.print(sample.indexOf(ch) + " ");
        }
        System.out.println("\n");
        System.out.println("u  v  w  x  y  z");
        System.out.println("================");
        for (int i = 20; i < 26; i++) {
            char ch = alphabet.charAt(i);
            System.out.print(sample.indexOf(ch) + " ");
        }
        System.out.println();
        System.out.println(".....................................................");

        // 20. Get the canonical representation of the string object
        String str1 = new String("Java Exercises");
        String str2 = new String("Java Exercises");
        String str3 = str1.intern();
        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 == str3? " + (str1 == str3));
        System.out.println(".....................................................");
    }
}
