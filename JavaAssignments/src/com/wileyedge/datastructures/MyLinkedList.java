package com.wileyedge.datastructures;

public class MyLinkedList{
	Node head;
	int size;
	public MyLinkedList(){
		size=0;
	}
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			size++;
		}
	}
	public void addFirst(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	public void addLast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
	public void insertAtIndex(int data,int idx) {
		Node currNode=head;
		Node newNode=new Node(data);
		while(idx>1) {
			currNode=currNode.next;
			idx--;
		}
		Node nextNode=currNode.next;
		newNode.next=nextNode;
		currNode.next=newNode;
	}
	public void delete(int idx) {
		Node currNode=head;
		while(idx>1) {
			currNode=currNode.next;
			idx--;
		}
		currNode.next=currNode.next.next;
	}
	public int getFirst() {
		return head.data;
	}
	public int getLast() {
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		return currNode.data;
	}
	public void removeFirst() {
		if(head==null) { 
			System.out.println("List is empty");
			return;
		}
		head=this.head.next;
		size--;
	}
	public void removeLast() {
		if(head==null)  { 
			System.out.println("List is empty");
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		Node currNode=head;
		Node lastNode = head.next;
	       while(lastNode.next != null) {
	           currNode = currNode.next;
	           lastNode = lastNode.next;
	       }
	    currNode.next = null;
	}
	public void printList() {
		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data+" ");
			currNode=currNode.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		MyLinkedList list=new MyLinkedList();
		list.addLast(5);
	    list.addLast(10);
	    list.addLast(15);
	    list.addFirst(20);
	    list.insertAtIndex(100,2);
	    list.printList();
	    System.out.println(list.getFirst());
	    list.delete(2);
	    list.addLast(90);
	    list.printList();

	}
}