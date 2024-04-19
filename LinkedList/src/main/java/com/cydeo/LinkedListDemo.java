package com.cydeo;

public class LinkedListDemo {
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4); // these notes are not linked each other. i will create a list for this.

        node1.next = node2;
        node2.next = node3;
        node3.next = node4 ;  // i chained them linked them each other by assigning.
        System.out.println(node1.id); // i will see an address. com.cydeo.Node@28a418fc
        System.out.println(node1.next.id+" this will be id of second node");



    }
}
