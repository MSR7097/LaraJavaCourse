class Z7 
{
	public static void main(String[] args) 
	{
		int i=Integer.parseInt(args[0]);
		System.out.println("main begin"+i);
		test(Integer.parseInt(args[1]));
		System.out.println("main end:"+i);
	}
	public static void test(int i)
	{
		System.out.println("from test begin:"+i);
		i=30;
		System.out.println("from test end:"+i);
	}
}
