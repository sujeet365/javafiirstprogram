package collection;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
       // LinkedList<Integer> list = new LinkedList<>();
       // Stack<Integer> list = new Stack<>();
       // Vector<Integer> list = new Stack<>();
        TreeSet<Integer> list = new TreeSet<>();
       /* Set<Integer>list = new Set<Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };*/
       // Vector<Integer> list = new Vector<>();
        Scanner sc = new Scanner(System.in);
        list.add(sc.nextInt());
        list.add(54);
        list.add(34);
        list.add(30);
        list.add(36);
        list.add(36);
       // list.addLast(6);

       // list.addFirst(25);
        System.out.println(list);
       // list.set(2,54);
        System.out.println(list);
       // System.out.println(list.capacity());
       // System.out.println(list.peek());
      //  list.pop();
        System.out.println(list);
        /* for(int i : list) {              // for each loop
            System.out.println(i);         //System.out.println(list.size());
        */
       /* Iterator itr = list.iterator();   // it is a interface in collector
        while(itr.hasNext()){
            System.out.println(itr.next());*/
      //  }
    }
}