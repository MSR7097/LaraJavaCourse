class W
{
	public static void main(String[] args) 
	{
		loop1:    //labelling 
		for(int i=0; i<2; i++)
		{
			System.out.println("i loop 1 begins: "+i);
			for(int j=0; j<5 ;j++)
			{
				System.out.println("j loop 2: "+j);
				if (j > 2)
				{
					break loop1;
					
				}
			System.out.println("j loop 2 ends: "+j);
			
		}
		System.out.println("i loop 1 end: "+i);
		
	}
	System.out.println("main end");
}
}
