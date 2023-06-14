package buoi12;

public class Josephus {
	void Josephus(int n, int k )
	{
		MyQueue Q=new MyQueue();
		for(int i=1;i<=n;i++)
		{
			Q.AddQ(i);
		}
		int d=0,vt=1;
		while(d<n-1)
		{
			int x=Q.RemoveQ();
			if(vt<k)
			{
				vt++;
				Q.AddQ(x);
			}else
			{
				d++;
				vt=1;
			}
		}
		System.out.println("\n Vua la :"+Q.RemoveQ());
	}
	public static void main(String[] args) {
		Josephus p=new  Josephus();
		p.Josephus(17,1);
	}
}
