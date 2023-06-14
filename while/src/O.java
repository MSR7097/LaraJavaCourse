class O 
{
	public static void main(String[] args) 
	{
		int i=0;
		
		loop1:
		while (i<2)
		{
			
			System.out.println("while 1 begin  "+i);
			int j=0;
			loop2:
			while(j<5)
			{
				
				j++;
			System.out.println("while 2 begin  "+j);
			if(j>1)
			{
				break loop1;
			}
			System.out.println("while 2 end  "+j);
			}
			System.out.println("while 1 end   "+i);
			i++;
			
			
		}
		
	}
}
