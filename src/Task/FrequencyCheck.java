package Task;

import java.util.Scanner;

public class FrequencyCheck {
    public static void main(String[] args){
        System.out.println("entre a number:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("Digit you want to find:");
        int digit = s.nextInt();
        int search;
        int count= 0;
        while(num!=0){
            search=num%10;
            if(digit== search){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);

    }
}
