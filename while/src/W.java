class W  
{
	public static void main(String[] args) 
	{
		int i=0;
		do
		{
			System.out.println("loop 1 begin: "+ i);
			int j=0;
			do
			{
				System.out.println("loop 2 begin: " +j);
				j+=2;
				if(j==2)
				{
					break;
				}
				System.out.println("loop 2 end  : "+ j);
			}
			while (j<3);
			i++;
			System.out.println("loop 1 end  : "+ i);
		}
		while (i<3);
		System.out.println("main end ");
	}
}
