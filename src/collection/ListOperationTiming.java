package collection;

import java.util.*;

public class ListOperationTiming {

    public static void main(String[] args) {
        int size = 100000;

        // INSERTION
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) arrayList.add(i);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList Insertion Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) linkedList.add(i);
        end = System.currentTimeMillis();
        System.out.println("LinkedList Insertion Time: " + (end - start) + " ms");

        // UPDATE
        start = System.currentTimeMillis();
        arrayList.set(size / 2, 9999);
        end = System.currentTimeMillis();
        System.out.println("ArrayList Update Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        linkedList.set(size / 2, 9999);
        end = System.currentTimeMillis();
        System.out.println("LinkedList Update Time: " + (end - start) + " ms");

        // DELETION
        start = System.currentTimeMillis();
        arrayList.remove(size / 2);
        end = System.currentTimeMillis();
        System.out.println("ArrayList Deletion Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        linkedList.remove(size / 2);
        end = System.currentTimeMillis();
        System.out.println("LinkedList Deletion Time: " + (end - start) + " ms");
    }
}
