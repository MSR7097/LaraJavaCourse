class Z4 
{
	static int i;
	static void test()
	{
		System.out.println("from Z1.test");
	}
	static
	{
		System.out.println("from Z1.sib");
	}

}
class Z5
{
	static int j;
	static void test()
	{
		System.out.println("from Z2.test");
	}
	static 
	{
		System.out.println("from Z2.sib");
	}

}
class Z6
{
	static 
	{
		System.out.println("from main sib");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Z4.test();
		System.out.println("-");
		Z5.test();
		System.out.println("----------");
		System.out.println(Z4.i);
		System.out.println("----------");
		System.out.println(Z5.j);
		System.out.println("----------");
		Z4.test();
		System.out.println("----------");
		Z5.test();
		System.out.println("main end");
	}
}
