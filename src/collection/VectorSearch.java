package collection;

import java.util.Vector;

public class VectorSearch {
    public static void main(String[] args){
        Vector<String> vector = new Vector<>();
        vector.add("data structure");
        vector.add("algorithm");
        vector.add("operation system");
        String searchElement = "algorithm ";
        int index = vector.indexOf(searchElement);
        if(index != -1){
            System.out.println(searchElement + "found at index" + index);
        }
        else{
            System.out.println(searchElement +"not found in the vector" );
        }
    }
}
