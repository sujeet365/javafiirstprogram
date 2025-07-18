package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Deletecomprasion {
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i< 100000; ++i){
            arrayList.add(i);
            linkedList.add(i);
        }
        long start1 = System.nanoTime();
        arrayList.remove(50000);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        linkedList.remove(50000);
        long end2 =System.nanoTime();
        System.out.println("ArrayList Delete Middle:"+(end1 -start1)+ "ns");
        System.out.println("LinkedList Delete Middle:" + (end2 -start2)+"ns");
    }
}
