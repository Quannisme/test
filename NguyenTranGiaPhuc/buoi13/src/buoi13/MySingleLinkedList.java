package buoi13;
import java.util.ArrayList;
import java.text.BreakIterator;
import java.util.*;
public class MySingleLinkedList {
	Node head;
	Scanner sc=new Scanner(System.in);
	MySingleLinkedList(){
		head=null;
	}
	void append(int x) // them vao cuoi
	{
		Node t=new Node(x);
		if(head==null)
		{
			head=t;
		}else
		{
			Node p=head;
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=t;
		}
	}
	void add(int x)
	{
		head=new Node(x,head);
	}
	void insert(int x , int k)//them vao vi tri
	{
		if(k<1)
		{
			System.out.println("vi tri chen khong hop le ");
		}else if(k==1)
		{
			head=new Node(x,head);
		}else
		{
			int vt=1;
			Node p=head;
			while(p!=null && vt<k-1)
			{
				vt++;
				p=p.next;
			}
			if( p==null)
			{
				System.out.println("vi tri chen khong hop le");
			}else
			{
				Node t=new Node(x,p.next);
				p.next=t;
			}
		}
	}
	void remove(int k) {
		if(k<1||head==null)
		{
			System.out.println("khong xoa dc");
		}else if(k==1)
		{
			head=head.next;
		}else
		{
			int vt=1;
			Node p=head;
			while(p!=null && vt<k-1)
			{
				vt++;
				p=p.next;
			}
			if(p==null||p.next==null)
			{
				System.out.println("\n vi tri xoa khong hop le!");
			}else
			{
				p.next=p.next.next;
			}
		}
	}
//	void removeFirst()
//	{
//		if(head==null)
//		{
//			System.out.println("khong xoa dc:");
//		}else
//		{
//			head=head.next;
//		}
//	}
//	void removeLast()
//	{
//		if(head==null)
//		{
//			System.out.println("khong xoa dc:");
//		}else if(head==1)
//		{
//			head=null;
//		}else
//		{
//			Node p;
//			p.next=null;
//		}
//	}
	int dem()
	{
		int k=0;
		Node p=head;
		while(p!=null) {k++;p=p.next;}
		return k;
	}
	int tong()
	{
		int k=0;
		Node p=head;
		while(p!=null)
		{
			k=k+p.data;
			p=p.next;
		}
		return k;
	}
	void nhapds()
	{
		int x;
		Node cuoi=null;
		head=null;
		while(true)
		{
			System.out.println("Nhap x:");
			x=sc.nextInt();
			if(x==0)
			{
				break;
			}
			Node t=new Node(x);
			if(head==null) head=cuoi=t;
			else {
				cuoi.next=t;
				cuoi=t;
			}
		}
	}
	void in()
	{
		System.out.println("\n Noi dung danh sach :\n ====>");
		Node p=head;
		while (p!=null)
		{
			System.out.println(p);
			p=p.next;
		}
		System.out.println("null \n");
	}
	public static void main(String[] args)
	{
		MySingleLinkedList L=new MySingleLinkedList();
//		L.add(3);
//		L.add(2);
//		L.add(7);
//		L.add(6);
//		L.add(9);
//		L.add(8);
//		L.in();
		L.nhapds();
		L.in();
	}
}
