import java.util.*;

public class PriorityQueueExamples {
    public static void main(String[] args) {
        // 1. Create and print priority queue
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Blue");
        System.out.println("1. PriorityQueue: " + pq);

        // 2. Iterate
        System.out.print("2. Iterated: ");
        for (String s : pq)
            System.out.print(s + " ");
        System.out.println();

        // 3. Add all to another priority queue
        PriorityQueue<String> copy = new PriorityQueue<>(pq);
        System.out.println("3. Copied: " + copy);

        // 4. Insert element
        pq.offer("Yellow");
        System.out.println("4. After insert: " + pq);

        // 5. Remove all
        pq.clear();
        System.out.println("5. After clear: " + pq);

        // 6. Count elements
        System.out.println("6. Size: " + copy.size());

        // 7. Compare two queues
        PriorityQueue<String> another = new PriorityQueue<>(Arrays.asList("Red", "Green", "Blue"));
        System.out.println("7. Equal? " + copy.equals(another));

        // 8. Retrieve head
        System.out.println("8. Peek: " + copy.peek());

        // 9. Retrieve and remove head
        System.out.println("9. Poll: " + copy.poll());

        // 10. Convert to array
        Object[] arr = copy.toArray();
        System.out.println("10. Array: " + Arrays.toString(arr));

        // 11. Convert to string
        System.out.println("11. As string: " + copy.toString());

        // 12. Convert to max priority queue
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        maxPQ.addAll(Arrays.asList(1, 3, 5, 2));
        System.out.println("12. Max PQ: " + maxPQ);
    }
}

// output:

// 1. PriorityQueue: [Blue, Red, Green]
// 2. Iterated: Blue Red Green
// 3. Copied: [Blue, Red, Green]
// 4. After insert: [Blue, Red, Green, Yellow]
// 5. After clear: []
// 6. Size: 3
// 7. Equal? false
// 8. Peek: Blue
// 9. Poll: Blue
// 10. Array: [Green, Red]
// 11. As string: [Green, Red]
// 12. Max PQ: [5, 2, 3, 1]