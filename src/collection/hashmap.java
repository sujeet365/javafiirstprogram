package collection;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] agrs){
        HashMap<Integer,String> map=new HashMap<Integer, String>();
        map.put(2,"12345");
        map.put(4,"arms");
        Set s = map.entrySet();
       Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
           // Map.Entry m = (Map.Entry)itr.next();
           // System.out.println(m.getKey()+""+m.getValue());
        }
       System.out.println("Iterating Hashmap...");
        for(Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        /*for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }*/
       // System.out.println(map);
        map.forEach((Key, Value) ->{
            System.out.println(Key+ " "+Value);
            if(Value.equals("arms")){
                System.out.println(Key);
            }
        });
    }
}
