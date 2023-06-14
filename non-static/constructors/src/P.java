class P 
{
	P()
	{
		this(10,20);
		System.out.println("p()");
	}
	P(int i,int j)
	{
		System.out.println("P(INT)");
	}
	public static void main(String[] args) 
	{
		P p1=new P();
		System.out.println("-------------");
		P P2=new P(20,2);
		System.out.println("-------------");
	}
}









