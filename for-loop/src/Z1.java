class Z1 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		int i;
		for (i=0;i<=0;i++)
		{
			System.out.println("i for loop begins"+i);
			for(int j=10;j>4;j--)
			{
				System.out.println("j for loop begins"+j);
				if(j<7)
			{
				continue;
			}
			System.out.println("j loop ends"+j);
			}
			System.out.println("i for loop "+i);
		}
		System.out.println("main end");
	}
}
