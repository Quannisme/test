package buoi15_27_5_2023;
// Nguyen Van Quan
// nhap, in, xoa , dao , sap xep , chen  
import java.util.Scanner;
public class MyLinkedList {
	Node head;
	Scanner sc=new Scanner(System.in);
	MyLinkedList()
	{
		head=null;
	}
	//nhap danh sach
	void nhapsd()
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
			if(head==null)
			{
				head=cuoi=t;
			}else
			{
				cuoi.next=t;
				cuoi=t;
			}
		}
	}
	// in danh sach 
	void in()
	{
		System.out.println("\n Noi dung cua danh sach :==>");
		Node p=head;
		while(p!=null)
		{
			System.out.println(p);
			p=p.next;
		}
		System.out.println("null \n");
	}
	// xoa vi tri K
	void remove(int k)
	{
		if(k<1||head==null)
		{
			System.out.println("khong xoa duoc:");
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
				System.out.println("\n vi tri xoa khong hop le !");
			}else
			{
				p.next=p.next.next;
			}
		}
	}
	//sap xep
	public void sort()
	{
		for(Node i=head;i.next!=null ;i=i.next)
		{
			for(Node j=i.next ;j != null;j=j.next)
			{
				if(i.data > j.data)
				{
					int tmp=i.data;
					i.data=j.data;
					j.data=tmp;
				}
			}
		}
	}
	// chen 
	void insert(int x , int k)
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
	// dao 
	void dao()
	{
		Node t=null;
		Node p=head;
		while(p!=null)
		{
			Node q=p.next;
			p.next=t;
			t=p;
			p=q;
		}
		head=t;
	}
	public static void main(String[] args)
	{
		MyLinkedList p=new MyLinkedList();
		p.nhapsd();
		p.in();
		System.out.println("sap xep");
		p.sort();
		p.in();
		System.out.println("xoa so vi tri  5");
		p.remove(5);
		p.in();
		System.out.println("dao");
		p.dao();
		p.in();
		System.out.println("chen vi tri ");
		p.insert(99,5);
		p.in();
	}
}
