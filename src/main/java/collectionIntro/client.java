package collectionIntro;

import java.util.*;

 public class client {

    public static void main(String[] args) {
        //ArrayList -- >
        //is preferred because it makes your code more flexible and easier to maintain.
        // It allows you to change the type of list you're using (like switching from ArrayList to LinkedList)
        // without having to change your code everywhere.
        // This practice follows good programming principles.
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        //LinkedList
        List<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>();


        Set<String> hashset = new HashSet<>();
        Set<String> treeset = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();


        hashset.add("A");
        hashset.add("D");
        hashset.add("C");
        hashset.add("B");
        hashset.add("E");

//        System.out.println(hashset);

        treeset.add("A");
        treeset.add("C");
        treeset.add("E");
        treeset.add("B");
        treeset.add("D");

//        System.out.println(treeset);

        linkedHashSet.add("B");
        linkedHashSet.add("A");
        linkedHashSet.add("E");
        linkedHashSet.add("C");
        linkedHashSet.add("D");

//        System.out.println(linkedHashSet);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(1);
        pq.add(7);
        pq.add(8);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);

        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
