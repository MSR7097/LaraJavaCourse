class S 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=0;
		do
		{
			
			System.out.println("body: "+i);
			i++;
			
		}
		while ((i++ == 2) || (i++ == 4));
		System.out.println("main end");
	}
}
