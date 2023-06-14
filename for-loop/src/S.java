class S 
{
	public static void main(String[] args) 
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println("i loop 1 begins  "+i);
			for(int j=0;j<=2;j++)
			{
				System.out.println("j loop 2  "+j);
				if (j>2)
				{
					continue;
					  //---> unreachable statement when we have break or continue ;
				
				}
			System.out.println("jloop 2 ends  "+j);
			
		}
		System.out.println("i loop 1 end  "+i);
		
	}
	System.out.println("main end");
}
}
