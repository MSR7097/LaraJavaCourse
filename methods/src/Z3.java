class Z3 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		test1(i++,++i);
		System.out.println("main end :"+i);
	}
	public static void test1(int i,int j)
	{
		System.out.println("from test 1 :"+i+","+j);
		i=30;
		test2(i);
	}
	public static void test2(int i)
	{
		System.out.println("from test 2 :"+i);
		i=40;
	}
}
