package app;

import datastructures.LinkedList;

public class LinkedListTest
{
    public static void main(String[] args)
    {
	int[] arr = { 5, 1, 0, 4, 7, 2, 9, 3, 4, 6 };
	LinkedList l = new LinkedList();
	l.createLinkedListFromArray(arr);
	l.printLinkedList();
	l.addNode(21);
	l.printLinkedList();
	l.reverseLinkedList();
	l.printLinkedList();
	l.reverseLinkedList();
	l.printLinkedList();
    }
}
