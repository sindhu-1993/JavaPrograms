// 8. Write a Java program to test if a given string contains the specified sequence of char values.  

// Sample Output:

// Original String: PHP Exercises and Python Exercises                                                           
// Specified sequence of char values: and                                                                        
// true 

public class q8 {
    public static void main(String[] args) {
        String originalString = "PHP Exercises and Python Exercises";
        String sequence = "and";
        System.out.println("Original String: " + originalString);
        System.out.println("Specified sequence of char values: " + sequence);
        System.out.println(originalString.contains(sequence));
    }
}
