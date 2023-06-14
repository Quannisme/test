package buoi15_27_5_2023;
public class Node {
	
	int data;
	Node next;
	Node(){}
	Node(int x)
	{
		data=x;
		next=null;
	}
	Node(int x , Node t)
	{
		data=x;
		next=t;
	}
	@Override
	public String toString() {
		return data+"-->";

}
}