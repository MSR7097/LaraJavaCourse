class T 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int x=30;
		test(x);
		System.out.println("Hello main end");
	}
	public static void test(int i)
	{
		System.out.println("from test   "+i);
	}
}
