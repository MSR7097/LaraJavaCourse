class U 
{
	U()
	{
		this(10);
		System.out.println("U()");
	}
	U(int i)
	{
		this();
		System.out.println("U(int)");
	}
	public static void main(String[] args) 
	{
		U obj1=new U();
		System.out.println("-----------");
		U obj2=new U(3);
		System.out.println("-----------");
	}
}
