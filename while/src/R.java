class R 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=10;
		do
		{
			i++;
			System.out.println("body: "+i);
			if(i==13)
			{
				break;
			}
		}
		while (i>10);
		System.out.println("main end");
	}
}
