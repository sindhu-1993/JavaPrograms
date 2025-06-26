public class q1314 {
    public static void main(String[] args) {
        // Check if two String objects contain the same data (case-sensitive)
        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "Mike Royko";
        String str4 = "Stephen Edwin King";

        System.out.println("Question 13:");
        System.out.println("Write a Java program to compare two strings lexicographically. " +
                "Also compare two strings, ignoring case differences.");
        System.out.println("Sample Output:");
        System.out.println("\"" + str1 + "\" equals \"" + str2 + "\"? " + str1.equals(str2));
        System.out.println("\"" + str1 + "\" equals \"" + str3 + "\"? " + str1.equals(str3));
        System.out.println("\"" + str1 + "\" equals \"" + str4 + "\"? " + str1.equals(str4));
        System.out.println(".....................................................");

        // Compare strings ignoring case
        String str5 = "stephen edwin king";
        System.out.println("Question 14:");
        System.out.println("Write a Java program to compare two strings, ignoring case differences.");
        System.out.println("Sample Output:");
        System.out.println("\"" + str1 + "\" equals \"" + str2 + "\"? " + str1.equalsIgnoreCase(str2));
        System.out.println("\"" + str1 + "\" equals \"" + str5 + "\"? " + str1.equalsIgnoreCase(str5));
    }
}
