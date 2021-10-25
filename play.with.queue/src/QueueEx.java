import java.util.*;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("Mansoor");
        q.add("Nagi");
        q.add("Musleh");
        q.add("Al Qassim");

        System.out.println("Original" + q);
        System.out.println("This element is polled first   "+ q.poll());
        Deque<String> de = new LinkedList<>();
        de.offer("1");
        de.offer("10");
        de.offer("3");
        de.offer("13");
        de.offer("5");
        de.offer("16");
        de.offer("7");
        de.offer("18");
        de.offer("9");
        de.offer("100");
        de.offer("11");
        de.offer("122");

        System.out.println("DeQure   " + de);
        System.out.println(de.pop());
        System.out.println(de.pop());
        System.out.println(de.pop());
        System.out.println(de.pop());
        System.out.println(de.pop());
        System.out.println(de.pop());
        System.out.println(de.pop());
        System.out.println(de.pop());
        System.out.println(de.pop());
        System.out.println(de.pop());
        System.out.println(de.pop());
        System.out.println(de.pop());

    }
}
