package buoi16;

import java.util.Scanner;

public class MyBinaryTree {
	TNode root;
	void taocayT(){
		TNode A=new TNode(3,new TNode(1),new TNode(9));
		TNode B=new TNode(6,null,new TNode(2));
		root=new TNode(8,A,B);
	}
	void duyetl(TNode T){
		if(T!=null)
		{
			System.out.println(" "+T.data);
			duyetl(T.left);
			duyetl(T.right);
		}
	}
	void duyet2(TNode T)
	{
		if(T!=null)
		{
			duyet2(T.left);
			System.out.println(" "+T.data);
			duyet2(T.right);
		}
	}
	void duyet3(TNode T)
	{
		if(T!=null)
		{
			duyet3(T.left);
			duyet3(T.right);
			System.out.println(" "+T.data);
		}
	}
	void duyettrungtu()
	{
		duyet2(root);
	}
	void duyetthautu()
	{
		duyet3(root);
	}
	int sonot(TNode T)
	{
		if(T==null)return 0;
		else return 1+sonot(T.left)+sonot(T.right);
	}
//	int sola(TNode T)
//	{
//		
//	}
//	int sola() {return sola(root);}
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
	int sn() {return sonot(root);}
	void duyettientu(){duyetl(root);}
	int tongn(TNode T)
	{
		if(T==null|| T.right==null ||T.left==null) {
			return 0;
		}else
		{
			return T.data+tongn(T.left)+tongn(T.right);
		}
	}
	int tongn()
	{
		return tongn(root);
	}
	int tongle(TNode T)
	{
		if(T==null)
		{
			return 0;
		}else
		{
			if(T.data%2!=0)
			{
				return T.data+tongle(T.left)+tongle(T.right);
			}else
			{
				return tongle(T.left)+tongle(T.right);
			}
		}
	}
//	int demSoNotCoMotCon(TNode T)
//	{
//		if(T==null||T.left==null||T.right==null)
//		{
//			return 0;
//		}else
//		{
//			if(T)
//		}
//	}
	// chieu cao cua cay 
	int cao(TNode T) {
		if(T==null)
			return 0;
		else return 1+Math.max(cao(T.left), cao(T.right));
	}
	int cao() {return cao(root);}
	boolean cb(TNode T)
	{
		if(T==null)return true;
		else
			if(Math.abs(cao(T.left)-cao(T.right))>1) return false;
			else return cb(T.left)&&cb(T.right);
	}
	boolean canbang()
	{
		return cb(root);
	}
	//tim gia tri x trong cay 
	boolean timX(TNode T, int x)
	{
		if(T==null)
		{
			return false;
		}else
		{
			if(T.data==x)return true;
			else {
				if(timX(T.left,x)==false)return timX(T.right,x);
				else return true;
			}
		}
	}
	boolean timx(int x)
	{
		return timX(root , x);
	}
	TNode insertBST(int x,TNode T)
	{
		if(T==null)T=new TNode(x);
		else if(x==T.data)System.out.println("da co"+x+"trong cay \n");
		else if(x<T.data)T.left=insertBST(x,T.left);
		return T;
	}
	void insertBST(int x) {root=insertBST(x,root);}
	
	public static void main(String [] args)
	{
		MyBinaryTree T=new MyBinaryTree();
//		T.taocayT();
		T.nhapcaydd();
		System.out.println("duyet tien tu");
		T.duyettientu();
		System.out.println("duyet trung tu ");
		T.duyettrungtu();
		System.out.println("duyet hau tu ");
		T.duyetthautu(); 
		
	}
}