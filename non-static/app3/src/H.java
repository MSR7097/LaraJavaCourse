class H 
{
	
	H(int i)
	{
		
		System.out.println("H(int)");
	}

	{
		System.out.println("H- IIB1");
	}

	H()
	{
		this(9);
		System.out.println("H()");
	}

	{
		System.out.println("H- IIB2");
	}
	public static void main(String[] args) 
	{
		H h1=new H();
		System.out.println("------");
		H h2=new H(50);
		System.out.println("------");
	}
	
}
