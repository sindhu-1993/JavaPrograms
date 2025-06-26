public class q41to50 {
    public static void main(String[] args) {
        // 41. Remove duplicate characters from a given string present in another given
        // string
        System.out.println("Q41: Remove duplicate characters from a given string present in another given string");
        String str41 = "the quick brown fox";
        String mask41 = "queen";
        System.out.println("The given string is: " + str41);
        System.out.println("The given mask string is: " + mask41);
        System.out.println("The new string is: ");
        System.out.println(removeMaskChars(str41, mask41));
        System.out.println(".....................................................");

        // 42. Print list items containing all characters of a given word
        System.out.println("Q42: Print list items containing all characters of a given word");
        String[] arr42 = { "rabbit", "bribe", "dog" };
        String word42 = "bib";
        System.out.println("The given strings are: rabbit   bribe   dog");
        System.out.println("The given word is: " + word42);
        System.out.println("The strings containing all the letters of the given word are: ");
        printStringsContainingWord(arr42, word42);
        System.out.println(".....................................................");

        // 43. Find the maximum occurring character in a string
        System.out.println("Q43: Find the maximum occurring character in a string");
        String str43 = "test string";
        System.out.println("The given string is: " + str43);
        System.out.println("Max occurring character in the given string is: " + maxOccurringChar(str43));
        System.out.println(".....................................................");

        // 44. Reverse a string using recursion
        System.out.println("Q44: Reverse a string using recursion");
        String str44 = "The quick brown fox jumps";
        System.out.println("The given string is: " + str44);
        System.out.println("The string in reverse order is:");
        System.out.println(reverseRecursively(str44));
        System.out.println(".....................................................");

        // 45. Reverse words in a given string
        System.out.println("Q45: Reverse words in a given string");
        String str45 = "Reverse words in a given string";
        System.out.println("The given string is: " + str45);
        System.out.println("The new string after reversed the words: " + reverseWords(str45));
        System.out.println(".....................................................");

        // 46. Reverse every word in a string using methods
        System.out.println("Q46: Reverse every word in a string using methods");
        String str46 = "This is a test string";
        System.out.println("The given string is: " + str46);
        System.out.println("The string reversed word by word is: ");
        System.out.println(reverseEachWord(str46));
        System.out.println(".....................................................");

        // 47. Rearrange a string so that all same characters become d distance away
        System.out.println("Q47: Rearrange a string so that all same characters become d distance away");
        String str47 = "accessories";
        System.out.println("The given string is: " + str47);
        System.out.println("The string after arrange newly is: ");
        String rearranged = rearrangeString(str47, 2);
        System.out.println(rearranged.isEmpty() ? "Not possible to rearrange" : rearranged);
        System.out.println(".....................................................");

        // 48. Remove "b" and "ac" from a given string
        System.out.println("Q48: Remove \"b\" and \"ac\" from a given string");
        String str48 = "abrambabasc";
        System.out.println("The given string is: " + str48);
        System.out.println("After removing the new string is: " + removeBandAc(str48));
        System.out.println(".....................................................");

        // 49. Find first non-repeating character from a stream of characters
        System.out.println("Q49: Find first non-repeating character from a stream of characters");
        String str49 = "godisgood";
        System.out.println("String: " + str49);
        printFirstNonRepeating(str49);
        System.out.println(".....................................................");

        // 50. Count and print all the duplicates in the input string
        System.out.println("Q50: Count and print all the duplicates in the input string");
        String str50 = "ramaresource.com";
        System.out.println("The given string is:  " + str50);
        System.out.println("The duplicate characters and counts are: ");
        printDuplicateChars(str50);
        System.out.println(".....................................................");
    }

    // Method stubs to avoid compilation errors
    public static String removeMaskChars(String str, String mask) {
        return "";
    }

    public static void printStringsContainingWord(String[] arr, String word) {
    }

    public static char maxOccurringChar(String str) {
        return ' ';
    }

    public static String reverseRecursively(String str) {
        return "";
    }

    public static String reverseWords(String str) {
        return "";
    }

    public static String reverseEachWord(String str) {
        return "";
    }

    public static String rearrangeString(String str, int d) {
        return "";
    }

    public static String removeBandAc(String str) {
        return "";
    }

    public static void printFirstNonRepeating(String str) {
    }

    public static void printDuplicateChars(String str) {
    }
}
