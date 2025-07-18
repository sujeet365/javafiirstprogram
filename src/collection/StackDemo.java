package collection;

import java.util.Stack;


public class StackDemo {
    /*public static void main(String[] args){
        Stack<Integer> list = new Stack<>();
        list.push(2);
        list.push(40);
        list.push(50);
        while(!list.isEmpty()) {
            System.out.println(list.pop());
        }

    }*/
    public static void stack_push(Stack<Integer> stack){
        for(int i =0; i<5; ++i){
            stack.push(i);
        }
    }
    public static void stack_pop(Stack<Integer> stack){
        System.out.println("Pop Operation:");
        for(int i =0;i<5; i++){
            Integer u = (Integer) stack.pop();
            System.out.println(u);
        }
    }
    public static void stack_peek(Stack<Integer> stack){
        Integer element = (Integer) stack.peek();
        System.out.println("Elemennt on stack top:" + element);
    }
     static  void stack_search(Stack<Integer> stack, int element){
        Integer pos =(Integer) stack.search(element);
        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position:" + pos);
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack ,2);
        stack_search(stack,6);
    }
}
