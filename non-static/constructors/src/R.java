class R 
{
	R()
	{
		System.out.println("R()");
	}
	R(int i)
	{
		System.out.println("R(int)");
		this();
	}
	public static void main(String[] args) 
	{
		R r1=new R();
		System.out.println("Hello World!");
		R r2=new R(2);
		System.out.println("Hello World!");
	}
}

/*
error at line 9 - this calling statement must be the first calling
statement
*/
