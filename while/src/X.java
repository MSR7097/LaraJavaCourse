class X  
{
	public static void main(String[] args) 
	{
		int i=0;
		abc:
		do
		{
			System.out.println("loop 1 begin: "+ i);
			int j=0;
			i++;
			def:
			do
			{
				System.out.println("loop 2 begin: " +j);
				j++;
				int k=1;
				
				do
				{
					
					System.out.println("loop 3 begin : "+k);
					k++;
					if(k>2)
					{
						continue def;
					}
					System.out.println("loop 3 end: "+k);
				}
				while (k<3);
				System.out.println("loop 2 end  : "+ j);
			}
			while (j<3);
			
			System.out.println("loop 1 end  : "+ i);
		}
		while (i<2);
		System.out.println("main end ");
	}
}
