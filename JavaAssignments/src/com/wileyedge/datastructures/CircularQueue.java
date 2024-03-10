package com.wileyedge.datastructures;

public class CircularQueue {
	Node head, tail = null;
	class Node{
		Node prev;
		Node next;
		int data;
		public Node(int data) {
			this.data=data;
		}
	}
	public void addFirst(int data) {
		Node newNode=new Node(data);
		if(head!=null) {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
			head.prev=tail;
		}
		if(tail==null) {
			head=tail=newNode;
			head.prev=tail;
			tail.next=head;
		}
	}
	public void add(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			head.prev=tail;
			tail.next=head;
		}else {
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
			tail.next=head;
		}
	}
	public void addLast(int data) {
		add(data);
	}
	public void removeFirst() {
		if(head==null) System.out.println("Underflow");
		else {
			head=head.next;
			head.prev=tail;
		}
	}
	public void removeLast() {
		if(tail==null) System.out.println("Underflow");
		else {
			tail=tail.prev;
			tail.next=head;
		}
	}
	public void removeAtIdx(int idx) {
		Node currNode=head;
		while(idx>1 && currNode!=null) {
			currNode=currNode.next;
		}
		Node nextNode=currNode.next.next;
		currNode.next=nextNode;
		nextNode.prev=currNode;
	}
	public void printStartToEnd() {
		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data+" ");
			currNode=currNode.next;
		}
		System.out.print("null");
	}
	public void printEndToStart() {
		Node currNode=tail;
		while(currNode!=null) {
			System.out.print(currNode.data+" ");
			currNode=currNode.prev;
		}
		System.out.print("null");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.add(40);
		dll.add(50);
		dll.addFirst(60);
		dll.removeLast();
		dll.removeAtIdx(1);
		dll.printEndToStart();
		System.out.println();
		dll.printStartToEnd();
	}
}
