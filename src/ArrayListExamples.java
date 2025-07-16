import java.util.*;

public class ArrayListExamples {
    public static void main(String[] args) {
        // 1. Create a new array list, add some colors (string), and print out the
        // collection.
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("1. Colors: " + colors);

        // 2. Iterate through all elements in the array list.
        System.out.print("2. Iterated colors: ");
        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();

        // 3. Insert an element into the array list at the first position.
        colors.add(0, "Yellow");
        System.out.println("3. After inserting at first: " + colors);

        // 4. Retrieve an element at a specified index.
        System.out.println("4. Element at index 2: " + colors.get(2));

        // 5. Update a specific element.
        colors.set(1, "Orange");
        System.out.println("5. After update: " + colors);

        // 6. Remove the third element.
        colors.remove(2);
        System.out.println("6. After removing third element: " + colors);

        // 7. Search for an element.
        System.out.println("7. Contains 'Blue'? " + colors.contains("Blue"));

        // 8. Sort the list.
        Collections.sort(colors);
        System.out.println("8. Sorted list: " + colors);

        // 9. Copy one list into another.
        List<String> copy = new ArrayList<>(colors);
        System.out.println("9. Copied list: " + copy);

        // 10. Shuffle elements.
        Collections.shuffle(colors);
        System.out.println("10. Shuffled list: " + colors);

        // 11. Reverse elements.
        Collections.reverse(colors);
        System.out.println("11. Reversed list: " + colors);

        // 12. Extract a portion.
        List<String> subList = colors.subList(1, 3);
        System.out.println("12. Sublist (index 1 to 2): " + subList);

        // 13. Compare two lists.
        System.out.println("13. Are colors and copy equal? " + colors.equals(copy));

        // 14. Swap two elements.
        Collections.swap(colors, 0, 1);
        System.out.println("14. After swapping index 0 and 1: " + colors);

        // 15. Join two lists.
        List<String> joined = new ArrayList<>(colors);
        joined.addAll(copy);
        System.out.println("15. Joined list: " + joined);

        // 16. Clone a list.
        List<String> cloned = new ArrayList<>(colors);
        System.out.println("16. Cloned list: " + cloned);

        // 17. Empty a list.
        List<String> temp = new ArrayList<>(colors);
        temp.clear();
        System.out.println("17. Emptied list: " + temp);

        // 18. Test if list is empty.
        System.out.println("18. Is temp empty? " + temp.isEmpty());

        // 19. Trim capacity to size (not visible in output but done)
        ((ArrayList<String>) colors).trimToSize();
        System.out.println("19. Trimmed list size: " + colors.size());

        // 20. Increase capacity (automatic in ArrayList, no direct method)
        ((ArrayList<String>) colors).ensureCapacity(20);
        System.out.println("20. Increased capacity (logical, no output)");

        // 21. Replace second element
        colors.set(1, "Purple");
        System.out.println("21. After replacing second element: " + colors);

        // 22. Print elements using index
        System.out.print("22. Elements by index: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " ");
        }
        System.out.println();
    }
}

// output:

// 1. Colors: [Red, Green, Blue]
// 2. Iterated colors: Red Green Blue
// 3. After inserting at first: [Yellow, Red, Green, Blue]
// 4. Element at index 2: Green
// 5. After update: [Yellow, Orange, Green, Blue]
// 6. After removing third element: [Yellow, Orange, Blue]
// 7. Contains 'Blue'? true
// 8. Sorted list: [Blue, Orange, Yellow]
// 9. Copied list: [Blue, Orange, Yellow]
// 10. Shuffled list: [Blue, Orange, Yellow]
// 11. Reversed list: [Yellow, Orange, Blue]
// 12. Sublist (index 1 to 2): [Orange, Blue]
// 13. Are colors and copy equal? false
// 14. After swapping index 0 and 1: [Orange, Yellow, Blue]
// 15. Joined list: [Orange, Yellow, Blue, Blue, Orange, Yellow]
// 16. Cloned list: [Orange, Yellow, Blue]
// 17. Emptied list: []
// 18. Is temp empty? true
// 19. Trimmed list size: 3
// 20. Increased capacity (logical, no output)
// 21. After replacing second element: [Orange, Purple, Blue]
// 22. Elements by index: Orange Purple Blue
