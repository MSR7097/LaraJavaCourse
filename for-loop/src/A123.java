class A123 
{
	public static void main(String[] args) 
	{
		loop1:
		for (int i=1;i<=2;i++ )
		{
			System.out.println("outer loop begins "+i);
			for (int j=105;j>101;j-- )
			{
				System.out.println("inner loop begins  "+j);
				if(j<=102)
				{
					continue loop1;
				}
				System.out.println("inner loop ends  "+j);

			}
			System.out.println("outer loop ends  "+i);
		}
		System.out.println("main ends");
	}
}
