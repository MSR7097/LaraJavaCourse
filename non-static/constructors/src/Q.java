class Q 
{
	Q()
	{
		this(10);
		System.out.println("Q()");
	}
	Q(int i)
	{
		this(1,2);
		System.out.println("Q(int)");
	}
	Q(int i,int j)
	{
		System.out.println("Q(int ,int)");
	}
	public static void main(String[] args) 
	{
		Q q1=new Q();
		System.out.println("-------------");
		Q q2=new Q(20,2);
		System.out.println("-------------");
		Q q3=new Q(20);
		System.out.println("-------------");
	}
}