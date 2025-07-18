package Task;

import java.util.Random;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // take string input form user
        System.out.println("Enter a string to reverse:");
        int length = sc.nextInt();
        //Generate random string
        String radomString = "";
        Random r = new Random();
        for (int i =0; i<length; ++i){
            String characters = "";
            radomString += characters.charAt(r.nextInt(characters.length()));
        }
        //step 3: print original string
        System.out.println("Genetrate random string:"+ radomString);
        String reversed = "";
        for(int i =radomString.length()-1; i>=0; --i){
            reversed += radomString.charAt(i);
        }
        //print reversed string
        System.out.println("Reversed String:"+reversed);


    }
}
