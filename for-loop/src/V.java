class V
{
	public static void main(String[] args) 
	{
		loop1:    //labelling 
		for(int i=0; i<3; i++)
		{
			System.out.println("loop 1 begins");
			for(int j=0; j<=3 ;j++)
			{
				System.out.println("loop 2");
				if (j > 2)
				{
					continue loop1;
					
				}
			System.out.println("loop 2 ends");
			
		}
		System.out.println("loop 1 end ");
		
	}
	System.out.println("main end");
}
}
