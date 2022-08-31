package Foundation.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

import static java.lang.System.*;

public class LinkedListApplication {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        // primitive operations to add an element
        list.add("come");
        list.add("hi");
        list.add("by");
        list.add(3, "list"); // add the element at the index position specified

        list.remove(1); // removes the first element || the position if specified
        // list.removeFirst(); removes the element at the top
        // list.removeLast(); removes the last element

        Iterator<String> loop = list.iterator();
        while (loop.hasNext()) {
             out.println(loop.next()); // prints the next element
        }
        out.println(list.size()); // prints the size of the linked list

        // search through a linked list the returns a bool data type if present or not
        boolean bool = list.contains("go");
        out.println(bool);
    }
}
