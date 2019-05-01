package datastructures;

public class LinkedList
{
    LinkedListNode head;
    int size;

    public LinkedList()
    {
	this.head = null;
	this.size = 0;
    }

    public LinkedList(int head)
    {
	this();
	this.head = new LinkedListNode(head);
	this.size++;
    }

    public void createLinkedListFromArray(int[] arr)
    {
	if(this.head != null)
	    return;
	
	this.head = new LinkedListNode(arr[0]);
	this.size++;
	LinkedListNode curr = this.head;

	for (int i = 1; i < arr.length; i++)
	{
	    LinkedListNode aNode = new LinkedListNode(arr[i]);
	    curr.next = aNode;
	    this.size++;
	    curr = curr.next;
	}
    }

    public void printLinkedList()
    {
	LinkedListNode curr = this.head;

	while (curr != null)
	{
	    if (curr.next == null)
	    {
		System.out.print(curr.data);
		System.out.println();
		return;
	    }
	    else
	    {
		System.out.print(curr.data + " --> ");
		curr = curr.next;
	    }
	}
    }

    public void reverseLinkedList()
    {
	LinkedListNode curr = this.head;
	LinkedListNode prev = null;
	LinkedListNode next = null;

	while (curr != null)
	{
	    next = curr.next;
	    curr.next = prev;
	    prev = curr;
	    curr = next;
	}
	this.head = prev;
    }
    
    public void addNode(int data)
    {
	LinkedListNode aNode = new LinkedListNode(data);	
	LinkedListNode curr = this.head;
	
	while(curr.next != null)
	    curr = curr.next; // go to the end
	
	curr.next = aNode; // add at end
	this.size++;
    }
    
    public void deleteNode(int data)
    {
	if(this.head.data == data)
	{
	    this.head = this.head.next;
	    this.size--;
	}
	
	LinkedListNode curr = this.head;
	
	while(curr.next != null)
	{
	    if(curr.next.data == data)
		curr.next = curr.next.next;
	    
	    curr = curr.next;
	}
    }
}
