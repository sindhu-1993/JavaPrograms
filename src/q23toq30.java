public class q23toq30 {
    public static void main(String[] args) {
        // 24. Replace a specified character with another character
        System.out.println("Q24: Replace a specified character with another character");
        String str24 = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Original string: " + str24);
        String replaced24 = str24.replace('d', 'f');
        System.out.println("New String: " + replaced24);
        System.out.println(".....................................................");

        // 25. Replace each substring matching regex with replacement
        System.out.println("Q25: Replace each substring matching regex with replacement");
        String str25 = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Original string: " + str25);
        String replaced25 = str25.replaceAll("fox", "cat");
        System.out.println("New String: " + replaced25);
        System.out.println(".....................................................");

        // 26. Check if a string starts with another string
        System.out.println("Q26: Check if a string starts with another string");
        String s1 = "Red is favorite color.";
        String s2 = "Orange is also my favorite color.";
        String start = "Red";
        System.out.println(s1 + " starts with " + start + "? " + s1.startsWith(start));
        System.out.println(s2 + " starts with " + start + "? " + s2.startsWith(start));
        System.out.println(".....................................................");

        // 27. Get a substring between two positions
        System.out.println("Q27: Get a substring between two positions");
        String str27 = "The quick brown fox jumps over the lazy dog.";
        int startIdx = 10; // index of 'b' in "brown"
        int endIdx = 25; // index after 's' in "jumps"
        String substr27 = str27.substring(startIdx, endIdx);
        System.out.println("old = " + str27);
        System.out.println("new = " + substr27);
        System.out.println(".....................................................");

        // 28. Create a character array from a string
        System.out.println("Q28: Create a character array from a string");
        String str28 = "Java Exercises.";
        char[] charArray28 = str28.toCharArray();
        for (char c : charArray28) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println(".....................................................");

        // 29. Convert all characters to lowercase
        System.out.println("Q29: Convert all characters to lowercase");
        String str29 = "The Quick BroWn FoX!";
        System.out.println("Original String: " + str29);
        System.out.println("String in lowercase: " + str29.toLowerCase());
        System.out.println(".....................................................");

        // 30. Convert all characters to uppercase
        System.out.println("Q30: Convert all characters to uppercase");
        String str30 = "The Quick BroWn FoX!";
        System.out.println("Original String: " + str30);
        System.out.println("String in uppercase: " + str30.toUpperCase());
        System.out.println(".....................................................");
    }
}