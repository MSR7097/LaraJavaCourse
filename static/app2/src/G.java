class G 
{
	static int i=test1();
	static int j=test2();

	
	static
	{
		System.out.println("SIB 1  "+i+" , "+j);
	}

	
	static
	{
		System.out.println("SIB  2");
	}

	static int test1()
	{
		System.out.println("from test1  "+i +" ,"+j);
		return 10;
	}
	static int test2()
	{
		System.out.println("from test2 "+i+" , "+j);
		return 20;
	}
	

	public static void main(String[] args) 
	{
		System.out.println("main  "+i+" , "+j);
	}
	
}
