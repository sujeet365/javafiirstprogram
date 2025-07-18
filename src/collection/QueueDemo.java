package collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args){
       // PriorityQueue<Integer> list = new PriorityQueue<>();
        ArrayDeque<Integer>list =new ArrayDeque<>();
        list.add(30);
        list.add(39);
        //list.peek();
       // System.out.println(list.peek());
        list.add(38);
       // list.poll();
       // System.out.println(list.poll());
        list.offer(43);
        list.add(48);
        list.offer(23);
        System.out.println(list);
    }
}
