class Z1 
{
	static void test()
	{
		System.out.println("from Z1.test");
	}

}
class Z2
{
	static void test()
	{
		System.out.println("from Z2.test");
	}

}
class Z3
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Z1.test();
		System.out.println("-");
		Z2.test();
		System.out.println("----------");
		System.out.println("main end");
	}
}
