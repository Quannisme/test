package P8207;
import java.util.Scanner;
import java.util.Random;
public class MyArrList {
	int []a;
	int n;
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	void nhap() {
		System.out.println("Nhap size cua mang: ");
		this.n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt()%1000;
		}
	}
	
	void in() {
		System.out.println("Noi dung mang: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
	}
	
	void chenx(int x, int k) {
		n = a.length;
		if( k<0 && k>n)
			System.out.println("ERROR!");
		else {
			int []b = new int[n+1];
			for(int i=0; i<k;i++)
				b[i]= a[i];
			for(int i=n; i>k; i--)
				b[i]= a[i-1];
			b[k]= x;
			a=b;
		}
	}
	
	void xoa(int k) {
		n=a.length;
		if(k<0 || k>(n-1))
			System.out.println("ERROR!");
		else {
			int []b = new int[n-1];
			for(int i=0; i<k; i++) 
				b[i] = a[i];
			for(int i=k; i<n-1;i++)
				b[i]= a[i+1];
			a=b;
		}
	}
	
	void findmax() {
		int max = a[0];
		for (int i = 1; i < a.length-1; i++) {
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Max: "+max);
	}
	
	void daomang() {
		int i=0;
		int j=a.length-1;
		while (i<j) {
			int t=a[i];
			a[i++]= a[j];
			a[j--]= t;
		}
	}
	
	void xoaam() {
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0 || a[i]==0)
				count++;
		}
//		System.out.println("count: "+count);
		int []b = new int[count];
		int j=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0 || a[i]==0) {
				b[j] = a[i];
				j++;
			}
		}
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(" "+b[i]);
//		}
		a=b;
	}
	
	void tichlonnhat() {
		int max = a[0]*a[1];
		int v1=0;
		int v2=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]*a[j]>max)
				{
					v1 =i;
					v2 =j;
				}
			}
		}
		System.out.println("Tich cua "+a[v1]+" va "+a[v2]+" la lon nhat.");
	}
	
	void cap1() {
		int max1 = a[0];
		int max2 = a[1];
		int min1 = a[2];
		int min2 = a[3];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max1) {
				max1 = a[i];
			}
			if(a[i]>max2 && a[i]<max1) {
				max2 = a[i];
			}
			if(a[i]<min1) {
				min1 = a[i];
			}
			if(a[i]<min2 && a[i]>min1) {
				min2 = a[i];
			}
		}
		int max = max1 * max2;
		int min = min1 * min2;
		if(max > min)
			System.out.println("Tich cua "+max1+" va "+max2+" la lon nhat.");
		else
			System.out.println("Tich cua "+min1+" va "+min2+" la lon nhat.");
//		System.out.println("max1: "+max1+" max2: "+max2+" min1: "+min1+" min2: "+min2);
	}
	public static void main(String[] args) {
		MyArrList p = new MyArrList();
		p.nhap(); p.in();
//		p.chenx(17, 5);
//		p.in();
//		p.xoa(5);
//		p.in();
//		p.findmax();
//		p.daomang();
//		System.out.println("Mang sau khi dao.");
//		p.in();
//		p.xoaam();
//		p.in();
//		p.tichlonnhat();
		p.cap1();
		System.out.println("\n XONG");
	}
}
