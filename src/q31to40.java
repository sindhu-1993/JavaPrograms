import java.util.*;

public class q31to40 {

    // 31. Trim leading and trailing whitespace
    public static void trimWhitespace(String str) {
        System.out.println("31. Trim leading and trailing whitespace");
        System.out.println("Original String: " + str);
        System.out.println("New String: " + str.trim());
        System.out.println(".....................................................");
    }

    // 32. Longest Palindromic Substring
    public static void longestPalindromicSubstring(String s) {
        System.out.println("32. Longest Palindromic Substring");
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int maxLen = 1, start = 0;

        for (int i = 0; i < n; i++)
            dp[i][i] = true;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLen = 2;
            }
        }

        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    if (len > maxLen) {
                        start = i;
                        maxLen = len;
                    }
                }
            }
        }
        System.out.println("The given string is: " + s);
        System.out.println(
                "The longest palindrome substring in the given string is; " + s.substring(start, start + maxLen));
        System.out.println("The length of the palindromic substring is: " + maxLen);
        System.out.println(".....................................................");
    }

    // 33. All interleavings of two strings
    public static void interleavings(String s1, String s2) {
        System.out.println("33. All interleavings of two strings");
        System.out.println("The given strings are: " + s1 + "  " + s2 + "    --> ");
        System.out.println("The interleavings strings are: ");
        interleavingsHelper(s1, s2, "");
        System.out.println(".....................................................");
    }

    private static void interleavingsHelper(String s1, String s2, String res) {
        if (s1.length() == 0 && s2.length() == 0) {
            System.out.println(res);
            return;
        }
        if (s1.length() > 0)
            interleavingsHelper(s1.substring(1), s2, res + s1.charAt(0));
        if (s2.length() > 0)
            interleavingsHelper(s1, s2.substring(1), res + s2.charAt(0));
    }

    // 34. Second most frequent character
    public static void secondMostFrequentChar(String str) {
        System.out.println("34. Second most frequent character");
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);

        int first = 0, second = 0;
        char firstChar = '\0', secondChar = '\0';
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            if (count > first) {
                second = first;
                secondChar = firstChar;
                first = count;
                firstChar = entry.getKey();
            } else if (count > second && count != first) {
                second = count;
                secondChar = entry.getKey();
            }
        }
        System.out.println("The given string is: " + str);
        if (secondChar != '\0')
            System.out.println("The second most frequent char in the string is: " + secondChar);
        else
            System.out.println("No second most frequent character found.");
        System.out.println(".....................................................");
    }

    // 35. All permutations with repetition
    public static void permuteWithRepetition(String str, int len) {
        System.out.println("35. All permutations with repetition");
        System.out.println("The given string is: " + str);
        System.out.println("The permuted strings are:");
        permuteWithRepetitionHelper(str, "", len);
        System.out.println(".....................................................");
    }

    private static void permuteWithRepetitionHelper(String str, String prefix, int len) {
        if (prefix.length() == len) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permuteWithRepetitionHelper(str, prefix + str.charAt(i), len);
        }
    }

    // 36. Check if two strings are interleaving of a given string
    public static void isInterleaving(String s, String s1, String s2) {
        System.out.println("36. Check if two strings are interleaving of a given string");
        boolean result = isInterleavingHelper(s, s1, s2, 0, 0, 0);
        System.out.println("The given string is: " + s);
        System.out.println("The interleaving strings are " + s1 + " and " + s2);
        System.out.println("The given string is interleaving: " + result);
        System.out.println(".....................................................");
    }

    private static boolean isInterleavingHelper(String s, String s1, String s2, int i, int j, int k) {
        if (k == s.length() && i == s1.length() && j == s2.length())
            return true;
        if (k == s.length())
            return false;
        boolean a = (i < s1.length() && s.charAt(k) == s1.charAt(i))
                && isInterleavingHelper(s, s1, s2, i + 1, j, k + 1);
        boolean b = (j < s2.length() && s.charAt(k) == s2.charAt(j))
                && isInterleavingHelper(s, s1, s2, i, j + 1, k + 1);
        return a || b;
    }

    // 37. Longest substring without repeating characters
    public static void longestUniqueSubstring(String s) {
        System.out.println("37. Longest substring without repeating characters");
        int n = s.length(), maxLen = 0, start = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        List<Character> longest = new ArrayList<>();
        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                longest.clear();
                for (int i = left; i <= right; i++)
                    longest.add(s.charAt(i));
            }
        }
        System.out.println("Input String : " + s);
        System.out.println("The longest substring : " + longest);
        System.out.println("The longest Substring Length : " + maxLen);
        System.out.println(".....................................................");
    }

    // 38. Remove duplicates from string
    public static void removeDuplicates(String s) {
        System.out.println("38. Remove duplicates from string");
        Set<Character> seen = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            if (c != ' ')
                seen.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ' || seen.contains(c)) {
                if (c != ' ')
                    sb.append(c);
                seen.remove(c);
            }
        }
        System.out.println("The given string is:  " + s);
        System.out.println("After removing duplicates characters the new string is: ");
        System.out.println(sb.toString());
        System.out.println(".....................................................");
    }

    // 39. First non-repeating character
    public static void firstNonRepeatingChar(String s) {
        System.out.println("39. First non-repeating character");
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        char res = '\0';
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                res = entry.getKey();
                break;
            }
        }
        System.out.println("The given string is: " + s);
        System.out.println("The first non repeated character in String is: " + res);
        System.out.println(".....................................................");
    }

    // 40. Divide string in n equal parts
    public static void divideString(String s, int n) {
        System.out.println("40. Divide string in n equal parts");
        int len = s.length();
        if (len % n != 0) {
            System.out.println("Cannot divide string into " + n + " equal parts.");
            return;
        }
        int partLen = len / n;
        System.out.println("The given string is: " + s);
        System.out.println("The string divided into " + n + " parts and they are: ");
        for (int i = 0; i < len; i += partLen) {
            System.out.println(s.substring(i, i + partLen));
        }
        System.out.println(".....................................................");
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // 31
        trimWhitespace(
                "  Java Exercises                                                                               ");
        // 32
        longestPalindromicSubstring("thequickbrownfoxxofnworbquickthe");
        // 33
        interleavings("WX", "YZ");
        // 34
        secondMostFrequentChar("successes");
        // 35
        permuteWithRepetition("PQR", 3);
        // 36
        isInterleaving("PMQNO", "MNO", "PQ");
        isInterleaving("PNQMO", "MNO", "PQ");
        // 37
        longestUniqueSubstring("pickoutthelongestsubstring");
        // 38
        removeDuplicates("ramaresource.com ");
        // 39
        firstNonRepeatingChar("gibblegabbler");
        // 40
        divideString("abcdefghijklmnopqrstuvwxy", 5);
    }
}