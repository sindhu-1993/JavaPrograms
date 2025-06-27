/**
 * 31. Trim leading and trailing whitespace
 * Removes leading and trailing whitespace from a given string using String.trim().
 * Prints the original and the trimmed string.
 */

/**
 * 32. Longest Palindromic Substring
 * Finds and prints the longest palindromic substring in a given string.
 * Uses center expansion to check for both odd and even length palindromes.
 * Prints the original string, the longest palindrome, and its length.
 */

/**
 * 33. All interleavings of two strings
 * Recursively prints all possible interleavings of two given strings.
 * Maintains the order of characters from each string.
 * 
 * printInterleavings():
 * Calls the interleavings method with sample strings and prints all interleavings.
 */

/**
 * 34. Second most frequent character
 * Finds and prints the second most frequent character in a given string.
 * Uses a frequency array to count occurrences of each character.
 */

/**
 * 35. All permutations with repetition
 * Recursively generates and prints all possible permutations of a string with repetition allowed.
 * The length of each permutation is equal to the length of the original string.
 * 
 * printPermutationsWithRepetition():
 * Calls the permutation method with a sample string and prints all permutations.
 */

/**
 * 36. Check if two strings are interleaving of a given string
 * Checks if a given string is an interleaving of two other strings using dynamic programming.
 * Returns true if the string can be formed by interleaving the two strings, false otherwise.
 * 
 * checkInterleaving():
 * Demonstrates the isInterleaving method with sample strings and prints the results.
 */

/**
 * 37. Longest substring without repeating characters
 * Finds and prints the longest substring in a given string that contains no repeating characters.
 * Uses a sliding window approach with an array to track last seen positions of characters.
 * Prints the substring and its length.
 */

/**
 * 38. Remove duplicates from string
 * Removes duplicate characters from a string while preserving the order of first occurrences.
 * Prints the original string and the result after removing duplicates.
 */

/**
 * 39. First non-repeating character
 * Finds and prints the first non-repeating character in a given string.
 * Uses a frequency array to count occurrences and then finds the first character with count 1.
 */

/**
 * 40. Divide string in n equal parts
 * Divides a string into n equal parts if possible.
 * Prints each part or a message if the string cannot be divided equally.
 */
public class q31to40 {

    // 31. Trim leading and trailing whitespace
    public static void trimWhitespace() {
        String original = "  Java Exercises                                                                               ";
        String trimmed = original.trim();
        System.out.println("Original String: " + original);
        System.out.println("New String: " + trimmed);
        System.out.println(".....................................................");
    }

    // 32. Longest Palindromic Substring
    public static void longestPalindromicSubstring() {
        String s = "thequickbrownfoxxofnworbquickthe";
        String result = "";
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            // Odd length
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLen) {
                    maxLen = r - l + 1;
                    result = s.substring(l, r + 1);
                }
                l--;
                r++;
            }
            // Even length
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLen) {
                    maxLen = r - l + 1;
                    result = s.substring(l, r + 1);
                }
                l--;
                r++;
            }
        }
        System.out.println("The given string is: " + s);
        System.out.println("The longest palindrome substring in the given string is; " + result);
        System.out.println("The length of the palindromic substring is: " + maxLen);
        System.out.println(".....................................................");
    }

    // 33. All interleavings of two strings
    public static void interleavings(String s1, String s2, String res) {
        if (s1.length() == 0 && s2.length() == 0) {
            System.out.println(res);
            return;
        }
        if (s1.length() > 0)
            interleavings(s1.substring(1), s2, res + s1.charAt(0));
        if (s2.length() > 0)
            interleavings(s1, s2.substring(1), res + s2.charAt(0));
    }

    public static void printInterleavings() {
        String s1 = "WX", s2 = "YZ";
        System.out.println("The given strings are: " + s1 + "  " + s2 + "    --> ");
        System.out.println("The interleavings strings are: ");
        interleavings(s1, s2, "");
        System.out.println(".....................................................");
    }

    // 34. Second most frequent character
    public static void secondMostFrequentChar() {
        String s = "successes";
        int[] freq = new int[256];
        for (char c : s.toCharArray())
            freq[c]++;
        int first = 0, second = 0;
        for (int f : freq)
            if (f > first)
                first = f;
        for (int f : freq)
            if (f > second && f < first)
                second = f;
        char result = 0;
        for (int i = 0; i < freq.length; i++)
            if (freq[i] == second) {
                result = (char) i;
                break;
            }
        System.out.println("The given string is: " + s);
        System.out.println("The second most frequent char in the string is: " + result);
        System.out.println(".....................................................");
    }

    // 35. All permutations with repetition
    public static void permuteWithRepetition(String s, String res, int n) {
        if (res.length() == n) {
            System.out.println(res);
            return;
        }
        for (int i = 0; i < s.length(); i++)
            permuteWithRepetition(s, res + s.charAt(i), n);
    }

    public static void printPermutationsWithRepetition() {
        String s = "PQR";
        int n = s.length();
        System.out.println("The given string is: " + s);
        System.out.println("The permuted strings are:");
        permuteWithRepetition(s, "", n);
        System.out.println(".....................................................");
    }

    // 36. Check if two strings are interleaving of a given string
    public static boolean isInterleaving(String s, String s1, String s2) {
        if (s.length() != s1.length() + s2.length())
            return false;
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i > 0 && s.charAt(i + j - 1) == s1.charAt(i - 1))
                    dp[i][j] |= dp[i - 1][j];
                if (j > 0 && s.charAt(i + j - 1) == s2.charAt(j - 1))
                    dp[i][j] |= dp[i][j - 1];
            }
        }
        return dp[s1.length()][s2.length()];
    }

    public static void checkInterleaving() {
        String s = "PMQNO", s1 = "MNO", s2 = "PQ";
        System.out.println("The given string is: " + s);
        System.out.println("The interleaving strings are " + s1 + " and " + s2);
        System.out.println("The given string is interleaving: " + isInterleaving(s, s1, s2));
        s = "PNQMO";
        System.out.println("\nThe given string is: " + s);
        System.out.println("The interleaving strings are " + s1 + " and " + s2);
        System.out.println("The given string is interleaving: " + isInterleaving(s, s1, s2));
        System.out.println(".....................................................");
    }

    // 37. Longest substring without repeating characters
    public static void longestUniqueSubstring() {
        String s = "pickoutthelongestsubstring";
        int maxLen = 0, start = 0;
        int[] last = new int[256];
        for (int i = 0; i < 256; i++)
            last[i] = -1;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            if (last[s.charAt(r)] >= l)
                l = last[s.charAt(r)] + 1;
            last[s.charAt(r)] = r;
            if (r - l + 1 > maxLen) {
                maxLen = r - l + 1;
                start = l;
            }
        }
        System.out.println("Input String : " + s);
        System.out.print("The longest substring : [");
        for (int i = start; i < start + maxLen; i++) {
            System.out.print(s.charAt(i));
            if (i < start + maxLen - 1)
                System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("The longest Substring Length : " + maxLen);
        System.out.println(".....................................................");
    }

    // 38. Remove duplicates from string
    public static void removeDuplicates() {
        String s = "ramaresource.com";
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (char c : s.toCharArray()) {
            if (!seen[c]) {
                sb.append(c);
                seen[c] = true;
            }
        }
        System.out.println("The given string is:  " + s);
        System.out.println("After removing duplicates characters the new string is: ");
        System.out.println(sb.toString());
        System.out.println(".....................................................");
    }

    // 39. First non-repeating character
    public static void firstNonRepeatingChar() {
        String s = "gibblegabbler";
        int[] freq = new int[256];
        for (char c : s.toCharArray())
            freq[c]++;
        char result = 0;
        for (char c : s.toCharArray()) {
            if (freq[c] == 1) {
                result = c;
                break;
            }
        }
        System.out.println("The given string is: " + s);
        System.out.println("The first non repeated character in String is: " + result);
        System.out.println(".....................................................");
    }

    // 40. Divide string in n equal parts
    public static void divideStringInParts() {
        String s = "abcdefghijklmnopqrstuvwxy";
        int n = 5;
        int len = s.length();
        System.out.println("The given string is: " + s);
        if (len % n != 0) {
            System.out.println("Cannot divide string into " + n + " equal parts.");
        } else {
            int partLen = len / n;
            System.out.println("The string divided into " + n + " parts and they are: ");
            for (int i = 0; i < len; i += partLen) {
                System.out.println(s.substring(i, i + partLen));
            }
        }
        System.out.println(".....................................................");
    }

    public static void main(String[] args) {
        trimWhitespace();
        longestPalindromicSubstring();
        printInterleavings();
        secondMostFrequentChar();
        printPermutationsWithRepetition();
        checkInterleaving();
        longestUniqueSubstring();
        removeDuplicates();
        firstNonRepeatingChar();
        divideStringInParts();
    }
}