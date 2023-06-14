class U 
{
	public static void main(String[] args) 
	{
		System.out.println();
		int i=0;
		do
		{
			
			System.out.println("do begin: "+i);
			i++;
			if (i > 3)
			{
				break;
			}
			System.out.println("end: " +i);
		}
		while (i < 10);
		
	}
}
