import java.util.*;

public class HashSetExamples {
    public static void main(String[] args) {
        // 1. Append an element to the end of a hash set
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        System.out.println("1. HashSet: " + set);

        // 2. Iterate through all elements in the hash set
        System.out.print("2. Iterated: ");
        for (String s : set)
            System.out.print(s + " ");
        System.out.println();

        // 3. Get the number of elements in the hash set
        System.out.println("3. Size: " + set.size());

        // 4. Empty the hash set
        set.clear();
        System.out.println("4. Cleared: " + set);

        // 5. Test if hash set is empty
        System.out.println("5. Is empty? " + set.isEmpty());

        // 6. Clone a hash set
        HashSet<String> original = new HashSet<>(Arrays.asList("A", "B", "C"));
        HashSet<String> cloned = (HashSet<String>) original.clone();
        System.out.println("6. Cloned: " + cloned);

        // 7. Convert a hash set to an array
        String[] array = original.toArray(new String[0]);
        System.out.println("7. Array: " + Arrays.toString(array));

        // 8. Convert a hash set to a tree set
        TreeSet<String> treeSet = new TreeSet<>(original);
        System.out.println("8. TreeSet: " + treeSet);

        // 9. Convert a hash set to an ArrayList
        List<String> list = new ArrayList<>(original);
        System.out.println("9. ArrayList: " + list);

        // 10. Compare two hash sets
        HashSet<String> setA = new HashSet<>(Arrays.asList("X", "Y"));
        HashSet<String> setB = new HashSet<>(Arrays.asList("X", "Y"));
        System.out.println("10. Are equal? " + setA.equals(setB));

        // 11. Retain common elements
        setA.add("Z");
        setA.retainAll(setB);
        System.out.println("11. Common elements: " + setA);

        // 12. Remove all elements
        setA.clear();
        System.out.println("12. Emptied again: " + setA);
    }
}

// output:

// 1. HashSet: [Red]
// 2. Iterated: Red
// 3. Size: 1
// 4. Cleared: []
// 5. Is empty? true
// 6. Cloned: [A, B, C]
// 7. Array: [A, B, C]
// 8. TreeSet: [A, B, C]
// 9. ArrayList: [A, B, C]
// 10. Are equal? true
// 11. Common elements: [X, Y]
// 12. Emptied again: []