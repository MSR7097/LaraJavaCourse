class Z2 
{
	public static void main(String[] args) 
	{
		int i,j;
		for (i=0,j=1 ; i<=10;)
		{
			int sum=i+j;
			System.out.println(sum);
			i=j;
			j=sum;
			


		}
		System.out.println("these are fibonacci numbers");
	}
}
