// 11. Write a Java program to create a new String object with the contents of a character array.

public class q11 {
    public static void main(String[] args) {
        char[] charArray = { 'T', 'h', 'e', ' ', 'b', 'o', 'o', 'k', ' ', 'c', 'o', 'n', 't', 'a', 'i', 'n', 's', ' ',
                '2', '3', '4', ' ', 'p', 'a', 'g', 'e', 's', '.' };
        String str = new String(charArray);
        System.out.println(str);
    }
}
