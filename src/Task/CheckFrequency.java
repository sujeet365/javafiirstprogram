package Task;

import java.util.Scanner;

public class CheckFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of number to input: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("enter the number:");
        for(int i = 0; i<n; ++i){
            numbers[i] = sc.nextInt();
        }
        System.out.print(" enter the number for checking its frequency: ");
        int target = sc.nextInt();
        int frequency = 0;
        for(int num: numbers){
            if(num == target){
                frequency++;
            }
        }
        System.out.println("frequency of number "+ target+"is: "+frequency);
    }
}
