class N 
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=0;
		
		while (i<2)
		{
			
			System.out.println("while 1 begin  "+i);
			
			while(j<5)
			{
				j++;
			System.out.println("while 2 begin  "+j);
			if(j>1)
			{
				continue;
			}
			System.out.println("while 2 end  "+j);
			}
			System.out.println("while 1 end   "+i);
			i++;
			
			
		}
		
	}
}
