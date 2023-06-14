class Z_1 
{
	static void test()
	{
		System.out.println("from Z1.test");
	}
	static
	{
		System.out.println("from Z1.sib");
	}

}
class Z_2
{
	static void test()
	{
		System.out.println("from Z2.test");
	}
	static 
	{
		System.out.println("from Z2.sib");
	}

}
class Z_3
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Z_1.test();
		System.out.println("-");
		Z_2.test();
		System.out.println("----------");
		System.out.println("main end");
	}
}
