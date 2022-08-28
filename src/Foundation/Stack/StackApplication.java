package Foundation.Stack;

// Implementing stack

import java.util.Iterator;
import java.util.Stack;

public class StackApplication {
    public static void main(String[] args) {
        Stack<String> example = new Stack<>(); // creates an object of the stack
        example.push("hello"); // recall, inserts a new element into the stack
        example.push("hi");
        example.push("go");
        example.push("come");
        System.out.println(example);

        example.pop();
        System.out.println(example); // deletes the first element on the stack ("come")

        System.out.println(example.peek()); // accesses the first object in the stack

        boolean checkStack = example.empty(); // validates if the stack is empty or not
        System.out.println(checkStack); // prints false to the terminal cause the stack is not empty


        int find = example.search("hi"); // used int because the return type for this command returns an integer type
        System.out.println(find);

        // to iterate over a stack, use the Iterator class
        Iterator<String> run = example.iterator();
        while (run.hasNext()){
            Object store = run.next();
            System.out.println(store);
            System.out.println();

            // find the size, numbers of elements in the stack
            System.out.println(example.size());
        }
    }
}

