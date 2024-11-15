package Collections;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // List example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List: " + list);

        // Set example
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2); // This won't be added as Set doesn't allow duplicates
        System.out.println("Set: " + set);

        // Map example
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("Map: " + map);

        // Queue example
        Queue<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println("Queue: " + queue);
        System.out.println("Queue poll: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}