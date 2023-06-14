package buoi17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyBST {
	TNode root;
	int sn(TNode T)
	{
		if(T==null) return 0;
		else
			return 1+sn(T.left)+sn(T.right);
	}
	TNode chendd(int x,TNode T)
	{
		if(T==null) T=new TNode(x);
		else 
			if(sn(T.left)>sn(T.right))T.right=chendd(x,T.right);
			else T.left=chendd(x,T.left);
		return T;
	}
	void nhapcaydd()
	{
		root=null;
		Scanner sc=new Scanner(System.in);
		int x;
		while(true) {
			System.out.println("Nhap x khac 0 de them vao cay:");x=sc.nextInt();
			if(x==0)break;
			else root=chendd(x,root);
		}
	}
	TNode insertBST(int x,TNode T)
	{
		if(T==null)T=new TNode(x);
		else if(x==T.data)System.out.println("da co"+x+"trong cay \n");
		else if(x<T.data)T.left=insertBST(x,T.left);
		return T;
	}
	void insertBST(int x) {root=insertBST(x,root);}
	void duyet2(TNode T)
	{
		if(T!=null)
		{
			duyet2(T.left);
			System.out.println(" "+T.data);
			duyet2(T.right);
		}
	}
	void duyettrungtu()
	{
		duyet2(root);
	}
	void chieurong() {
		System.out.println("\n Duyet cay theo chieu rong :");
		Queue<TNode>Q=new LinkedList<TNode>();
		if(root!=null)Q.add(root);else System.out.println("cay rong");
		while(!Q.isEmpty()) {
			TNode x=Q.remove();
			System.out.println(x.data+"");
			if(x.left!=null)Q.add(x.left);
			if(x.right!=null)Q.add(x.right);
		}
	}
	TNode tx(int x, TNode T) {
		if(T==null)System.out.println("Cay rong, khong xoa duocj!");
		else if(x<T.data)T.left=tx(x,T.left);
			else if(x>T.data)T.right=tx(x,T.right);
			else {
				if(T.left==null && T.right==null)T=null;
				else if(T.left==null)T=T.right;
				else if(T.right==null)T=T.left;
				else {
					TNode p=T.left;
					while(p.right!=null)p=p.right;
					T.data=p.data;
					T.left=tx(p.data,T.left);
				}
			}
		return T;
	}
	public static void main(String[] args) {
		MyBST T=new MyBST();
		T.nhapcaydd();
		System.out.println("Duyet trung tu");
		T.duyettrungtu();
	}
}
