package buoi17;

public class TNode {
		int data;
		TNode left, right;
		TNode(int x){data=x;left=right=null;}
		TNode(int x , TNode ll,TNode rr)
		{
			data=x;
			left=ll;
			right=rr;
		}
	}

