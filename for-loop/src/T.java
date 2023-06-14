class T

{
	public static void main(String[] args) 
	{
		
		for(int i=1; i<=1; i++)
		{
			System.out.println("loop 1 begins");
			for(int j=0; j<5 ;j++)
			{
				System.out.println("loop 2 begins");
				if (j > 2)
				{
					continue;
					  //---> unreachable statement when we have break or continue ;
				
				}
			System.out.println("loop 2 ends");

			System.out.println("madhu");
			
		}
		System.out.println("loop 1 end ");
		
	}
	System.out.println("main end");
}
}
