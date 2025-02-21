package Collections.Intro;

import java.util.*;

public class CollectionsOverview {
        public static void main(String[] args) {
            // List
            List<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            System.out.println("List: " + list);
    
            // Set
            Set<Integer> set = new HashSet<>();
            set.add(1);
            set.add(2);
            set.add(2); // This won't be added
            System.out.println("Set: " + set);
    
            // Map
            Map<String, Integer> map = new HashMap<>();
            map.put("One", 1);
            map.put("Two", 2);
            System.out.println("Map: " + map);
    
            // Queue
            Queue<String> queue = new LinkedList<>();
            queue.offer("First");
            queue.offer("Second");
            System.out.println("Queue: " + queue);
            System.out.println("Queue poll: " + queue.poll());
    
            // Deque
            Deque<String> deque = new ArrayDeque<>();
            deque.addFirst("Start");
            deque.addLast("End");
            System.out.println("Deque: " + deque);
    
            // Stack
            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            stack.push(2);
            System.out.println("Stack: " + stack);
            System.out.println("Stack pop: " + stack.pop());
        }
    }

