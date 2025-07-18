package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args){
        HashSet hs = new HashSet<>();
        hs.add(30);
        hs.add(40);
        System.out.println(hs);
        Iterable<Object> set = null;
        Iterator<Object> i=set.iterator();
        while(i.hasNext()){
            System.out.println(hs);
        }
    }
}
