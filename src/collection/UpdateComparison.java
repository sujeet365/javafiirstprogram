package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UpdateComparison {
    public static void main(String[] args){
        List<Integer>arrayList = new ArrayList<>();
        List<Integer>linkedList = new LinkedList<>();
        for(int i=0; i<100000; ++i){
            arrayList.add(i);
            linkedList.add(i);
        }
        long start1 =System.nanoTime();
        arrayList.set(50000,999);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        linkedList.set(50000,999);
        long end2 =System.nanoTime();
        System.out.println("ArrayList Update:"+(end1 - start1)+"ns");
        System.out.println("LinkedList Update:"+(end2 - start2)+"ns");
    }
}
