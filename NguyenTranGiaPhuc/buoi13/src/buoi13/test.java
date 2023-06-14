package buoi13;

public class test {
	static void np(int n) {
		if(n>0)
		{
			np(n/2);
			System.out.print(n%2);
		}
	}
	static void hn(int n, String A , String B , String C) {
		if(n==1)
			System.out.println("Chuyen 1 dia tu"+A+"sang"+C);
		else
		{
			hn(n-1,A,C,B);
			hn(1,A,B,C);
			hn(n-1,B,A,C);
		}
	}
	public static void main(String []argv)
	{
		System.out.println("\n bieu dien nhi phan cua 103 la:");
		np(103);
		System.out.println("\n Bai toan thap HN voi n=5:");
		hn(5,"A","B","C");
		
	}
}
