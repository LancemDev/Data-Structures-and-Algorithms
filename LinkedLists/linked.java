package LinkedLists;

import java.util.LinkedList;

//Write a Linked List code in Java.
//        The code should have methods to add elements, delete elements, search for elements, print the elements in the list.
//        The code should be able to handle edge cases like adding at the beginning, adding at the end, adding in the middle, deleting the first element, deleting the last element, deleting in the middle, searching for an element that is not present in the list, etc.
//        The code should be able to handle exceptions like NullPointerException, etc.
//        The code should be able to handle generic types.
public class linked {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);

        System.out.println(list);
    }
}
