import java.util.*;

public class TreeSetExamples {
    public static void main(String[] args) {
        // 1. Create and print TreeSet
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("1. TreeSet: " + colors);

        // 2. Iterate
        System.out.print("2. Iterated: ");
        for (String c : colors)
            System.out.print(c + " ");
        System.out.println();

        // 3. Add all to another TreeSet
        TreeSet<String> copy = new TreeSet<>(colors);
        System.out.println("3. Copied set: " + copy);

        // 4. Reverse view
        System.out.println("4. Reverse: " + colors.descendingSet());

        // 5. First and last
        System.out.println("5. First: " + colors.first() + ", Last: " + colors.last());

        // 6. Clone
        TreeSet<String> clone = (TreeSet<String>) colors.clone();
        System.out.println("6. Cloned: " + clone);

        // 7. Size
        System.out.println("7. Size: " + colors.size());

        // 8. Compare
        System.out.println("8. Are equal? " + colors.equals(copy));

        // 9. Find numbers less than 7
        TreeSet<Integer> nums = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9));
        System.out.println("9. <7: " + nums.headSet(7));

        // 10. Greater than or equal to
        System.out.println("10. >=5: " + nums.ceiling(5));

        // 11. Less than or equal to
        System.out.println("11. <=5: " + nums.floor(5));

        // 12. Strictly > 5
        System.out.println("12. >5: " + nums.higher(5));

        // 13. Strictly < 5
        System.out.println("13. <5: " + nums.lower(5));

        // 14. Remove first
        System.out.println("14. Removed first: " + nums.pollFirst());

        // 15. Remove last
        System.out.println("15. Removed last: " + nums.pollLast());

        // 16. Remove a given element
        nums.remove(7);
        System.out.println("16. Removed 7: " + nums);
    }
}

// output:

// 1. TreeSet: [Blue, Green, Red]
// 2. Iterated: Blue Green Red
// 3. Copied set: [Blue, Green, Red]
// 4. Reverse: [Red, Green, Blue]
// 5. First: Blue, Last: Red
// 6. Cloned: [Blue, Green, Red]
// 7. Size: 3
// 8. Are equal? true
// 9. <7: [1, 3, 5]
// 10. >=5: 5
// 11. <=5: 5
// 12. >5: 7
// 13. <5: 3
// 14. Removed first: 1
// 15. Removed last: 9
// 16. Removed 7: [3, 5]