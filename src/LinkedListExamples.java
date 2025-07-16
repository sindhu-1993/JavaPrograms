import java.util.*;

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("1. Appended: " + list);

        System.out.print("2. Iterate: ");
        for (String s : list)
            System.out.print(s + " ");
        System.out.println();

        System.out.print("3. From index 1: ");
        Iterator<String> it = list.listIterator(1);
        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();

        System.out.print("4. Reverse: ");
        Iterator<String> rev = list.descendingIterator();
        while (rev.hasNext())
            System.out.print(rev.next() + " ");
        System.out.println();

        list.add(1, "X");
        System.out.println("5. After insert at index 1: " + list);

        list.addFirst("Start");
        list.addLast("End");
        System.out.println("6. First & Last added: " + list);

        list.offerFirst("Front");
        System.out.println("7. Insert front: " + list);

        list.offerLast("Back");
        System.out.println("8. Insert end: " + list);

        list.addAll(2, Arrays.asList("Y", "Z"));
        System.out.println("9. Add at index 2: " + list);

        System.out.println("10. First: " + list.getFirst() + ", Last: " + list.getLast());

        System.out.println("11. Elements with index:");
        for (int i = 0; i < list.size(); i++)
            System.out.println(i + ": " + list.get(i));

        list.remove("X");
        System.out.println("12. After removing 'X': " + list);

        list.removeFirst();
        list.removeLast();
        System.out.println("13. After removing first & last: " + list);

        list.clear();
        System.out.println("14. After clearing: " + list);

        list.addAll(Arrays.asList("One", "Two", "Three"));
        Collections.swap(list, 0, 2);
        System.out.println("15. Swapped: " + list);

        Collections.shuffle(list);
        System.out.println("16. Shuffled: " + list);

        LinkedList<String> another = new LinkedList<>(Arrays.asList("Four", "Five"));
        LinkedList<String> joinedLL = new LinkedList<>(list);
        joinedLL.addAll(another);
        System.out.println("17. Joined lists: " + joinedLL);

        LinkedList<String> clonedLL = new LinkedList<>(list);
        System.out.println("18. Cloned list: " + clonedLL);

        String removed = list.poll();
        System.out.println("19. Removed first: " + removed);

        String peekFirst = list.peekFirst();
        System.out.println("20. Peek first: " + peekFirst);

        String peekLast = list.peekLast();
        System.out.println("21. Peek last: " + peekLast);

        System.out.println("22. Contains 'Two'? " + list.contains("Two"));

        ArrayList<String> toArrayList = new ArrayList<>(list);
        System.out.println("23. Converted to ArrayList: " + toArrayList);

        LinkedList<String> listA = new LinkedList<>(Arrays.asList("X", "Y"));
        LinkedList<String> listB = new LinkedList<>(Arrays.asList("X", "Y"));
        System.out.println("24. Lists equal? " + listA.equals(listB));

        System.out.println("25. Is list empty? " + list.isEmpty());

        list.set(1, "Updated");
        System.out.println("26. After replace: " + list);
    }
}

// output:

// 1. Appended: [A, B, C]
// 2. Iterate: A B C
// 3. From index 1: B C
// 4. Reverse: C B A
// 5. After insert at index 1: [A, X, B, C]
// 6. First & Last added: [Start, A, X, B, C, End]
// 7. Insert front: [Front, Start, A, X, B, C, End]
// 8. Insert end: [Front, Start, A, X, B, C, End, Back]
// 9. Add at index 2: [Front, Start, Y, Z, A, X, B, C, End, Back]
// 10. First: Front, Last: Back
// 11. Elements with index:
// 0: Front
// 1: Start
// 2: Y
// 3: Z
// 4: A
// 5: X
// 6: B
// 7: C
// 8: End
// 9: Back
// 12. After removing 'X': [Front, Start, Y, Z, A, B, C, End, Back]
// 13. After removing first & last: [Start, Y, Z, A, B, C, End]
// 14. After clearing: []
// 15. Swapped: [Three, Two, One]
// 16. Shuffled: [Three, Two, One]
// 17. Joined lists: [Three, Two, One, Four, Five]
// 18. Cloned list: [Three, Two, One]
// 19. Removed first: Three
// 20. Peek first: Two
// 21. Peek last: One
// 22. Contains 'Two'? true
// 23. Converted to ArrayList: [Two, One]
// 24. Lists equal? true
// 25. Is list empty? false
// 26. After replace: [Two, Updated]
// PS C:\Users\schow\OneDrive\Desktop\java programs>
