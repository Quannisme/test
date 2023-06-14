package buoi12;

import java.util.Scanner;
public class MyQueue {
	Node head, tail;
	MyQueue(){
		head = tail = null;
	}
	
	boolean EmptyQ() {
		return head == null;
	}
	
	void AddQ(int x) {
		Node t = new Node(x);
		if(head == null) head = tail    = t;
		else {
			tail.next = t;
			tail = t;
		}
		
	}
	
	int RemoveQ() {
		int x=0;
		if(head == null) System.out.println("Hang doi rong");
		else {
			x = head.data;
			if(head.next == null) head = tail = null;
			else head = head.next;
		}
		return x;
	}
	
	void nhap() {
		int x;
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("Nhap 1 so <>0 de them vao NX: ");
			x= kb.nextInt(); if(x==0) break;
			AddQ(x);
		}
		System.out.println("Da them xong");
	}
	
	void in() {
		MyQueue t = new MyQueue();
		System.out.println("Noi dung ngan xep: ");
		while(!EmptyQ()) {
			int x = RemoveQ();
			System.out.println(x+" "); t.AddQ(x);
		}
	}
	
	int sum()
	{
		int k=0;
		MyQueue t=new MyQueue();
		int x=0;
		while(!EmptyQ())
		{
			x=RemoveQ();
			k=k+x;
			t.AddQ(x);
		}
		while(!t.EmptyQ())
		{
			x=t.RemoveQ();
			AddQ(x);
		}
		return k;
	}
	
	void demle() {
		
	}
	
	public static void main(String[] args) {
		MyQueue p = new MyQueue();
//		p.AddQ(3); p.AddQ(2); p.AddQ(7); p.AddQ(6);
		p.nhap();
		while (!p.EmptyQ()) {
			int x = p.RemoveQ();
			System.out.println(x+" ");
		}
	}
}	
