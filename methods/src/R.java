class R 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10,false,30);
		System.out.println("Hello World!");
	}
	public static void test(int i,boolean b,int k)
	{
		System.out.println("from test: " + i);
		System.out.println("from test: " + b);
		System.out.println("from test: " + k);
	}

}
