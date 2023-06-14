package buoi10;
import java.util.*;

public class MyStack {
	Node top;
	MyStack(){top=null;}
	void CreatS()
	{
		top=null;
	}
	boolean EmptyS()
	{
		return top==null;
	}
	void Push(int x)
	{
		top=new Node(x,top);
	}
	int Pop()
	{
		int x=0;
		if(top==null)
		{
			System.out.println("\n Ngan xep rong");
		}else
		{
			x=top.data;
			top=top.next;
		}
		return x;
	}
	void nhap()
	{
		int x;
		Scanner kb=new Scanner(System.in);
		while(true)
		{
			System.out.println("Nhap 1 so <>0 de them vao NX:");
			x=kb.nextInt();
			if(x==0)break;
			Push(x);
		}
		System.out.println("Da them xong");
	}
	int sum()
	{
		int k=0;
		MyStack t=new MyStack();
		int x=0;
		while(!EmptyS())
		{
			x=Pop();
			k=k+x;
			t.Push(x);
		}
		while(!t.EmptyS())
		{
			x=t.Pop();
			Push(x);
		}
		return k;
	}
	void in()
	{
		MyStack t=new MyStack();
		System.out.println("\n Noi dung ngan xep");
		while(!EmptyS())
		{
			int x=Pop();
			System.out.println(x+" ");
			t.Push(x);
		}while(!t.EmptyS())
		{
			int x=t.Pop();
			Push(x);
		}
	}
	void append()
	{
		
	}
	public static void main(String[] args) {
		MyStack S=new MyStack();
//		S.Push(3);
//		S.Push(2);
//		S.Push(7);
//		S.Push(6);
//		S.Push(9);
//		while(!S.EmptyS())
//		{
//			System.out.println(S.Pop()+" ");
//		}
		S.nhap();
		S.in();
		System.out.println("tong="+S.sum());
	}
}
