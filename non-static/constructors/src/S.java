class S 
{
	
	S()
	{
		System.out.println("S()");
	}
	S(int i)
	{
		S();
		System.out.println("S(int)");
	}
	public static void main(String[] args) 
	{
		S s1=new S();
		System.out.println("------------");
	
		S s2=new S(2);
		System.out.println("------------");
	}
}

/*
error at line 10 that S() is not found bcoz compiler consider S() as method
and method is not there  
*/