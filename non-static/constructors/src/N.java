class N 
{
	N()
	{
		
		System.out.println("from N()");
	}
	N(int i)
	{
		//this(9,8);
		System.out.println("N(int)");
	}
	N(int i,double b,String m)
	{
		this();
		System.out.println("N(int,boolean,string)");
	}
	N(int i,double b,int j)
	{
		//this();
		System.out.println("N(int,boolean)");
	}
	public static void main(String[] args) 
	{
		N n1=new N();
		System.out.println("----------");
		N n2=new N(10,20.0,"MADHU");
		System.out.println("----------");
	}
}
