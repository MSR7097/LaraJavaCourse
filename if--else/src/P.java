class P 
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=1;
		if (i<=10)
		{
			int sum =i+j;
			System.out.println(sum);
			i=j;
			j=sum;
		}
		System.out.println("fibonnaci series");
	}
}
