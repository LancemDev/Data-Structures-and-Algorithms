package LinkedLists;

public class linked{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        System.out.println(head.data);
        System.out.println(head.next.data);
    }
