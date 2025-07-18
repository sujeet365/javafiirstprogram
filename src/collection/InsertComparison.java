package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertComparison {
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long start1 = System.nanoTime();
        for(int i=0; i<100000; ++i) arrayList.add(i);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        for(int i =0; i<100000; ++i) linkedList.add(i);
        long end2 = System.nanoTime();
        System.out.println("ArrayList Insert at End:" +(end1 - start1) + "ns");
        System.out.println("LinkedList Insert at End:" +(end2 - start2) + "ns");
    }
}
