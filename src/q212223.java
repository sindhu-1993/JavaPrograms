// 21. Write a Java program to get the last index of a string within a string.  

// Sample Output:

//  a  b c  d  e  f  g  h i  j                                                                                   
// ===========================                                                                                   
// 36 10 7 40 33 16 42 32 6 20                                                                                   

// k  l  m  n  o  p q  r  s  t                                                                                   
// ===========================                                                                                   
// 8 35 22 14 41 23 4 29 24 31                                                                                   

//  u  v  w  x  y  z                                                                                             
// =================                                                                                             
// 21 27 13 18 38 37
// Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."

// .....................................................

// 22. Write a Java program to get the length of a given string.  

// Sample Output:

// The string length of 'example.com' is: 11
// .....................................................

// 23. Write a Java program to find whether a region in the current string matches a region in another string.  

// Sample Output:

// str1[0 - 7] == str2[28 - 35]? true                                                                            
// str1[9 - 15] == str2[9 - 15]? false 

public class q212223 {
    public static void main(String[] args) {
        // 21. Get the last index of each alphabet character in a sample string
        String sample = "The quick brown fox jumps over the lazy dog.";
        System.out.println("21. Last index of each alphabet character in the sample string:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int lastIndex = sample.lastIndexOf(ch);
            System.out.println("'" + ch + "' : " + lastIndex);
        }
        System.out.println();

        // 22. Get the length of a given string
        String str = "example.com";
        System.out.println("22. The string length of '" + str + "' is: " + str.length());
        System.out.println();

        // 23. Check if a region in one string matches a region in another string
        String str1 = "Welcome to w3resource.com";
        String str2 = "I love w3resource.com";
        // Compare str1[0-7] with str2[28-35] (adjusted for string length)
        boolean match1 = str1.regionMatches(0, str2, str2.length() - 8, 8);
        System.out.println(
                "23. str1[0 - 7] == str2[" + (str2.length() - 8) + " - " + (str2.length() - 1) + "]? " + match1);

        // Compare str1[9-15] with str2[9-15]
        boolean match2 = str1.regionMatches(9, str2, 9, 7);
        System.out.println("str1[9 - 15] == str2[9 - 15]? " + match2);
    }
}
