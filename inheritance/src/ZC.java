class Z4
{
	static int i = test1();
	int j = test3();

	static int k = test4();
	int l = test5();

	static int test1()
	{
		return 10 + test4();
	}

	static int test4()
	{
		return 20;
	}

	int test3()
	{
		Z4 b1 = new Z4();
		return 30;
	}

	int test5()
	{
		//B b1 = new B();
		return 40;
	}
	Z4()
	{
		this(10, 20);
		System.out.println("Z4()");
	}
	Z4(int i, int j)
	{
		Z4 Z41 = new Z4(10, 20, 30);
		System.out.println("Z4(int, int)");
	}
	Z4(int i, int j, int k)
	{
		//B b1 = new B();
		System.out.println("Z4(int, int, int)");
	}

	{
		//C c1 = new C();
		System.out.println("C-IIB1");
	}

	{
		//Z z1 = new Z();
		System.out.println("Z-IIB2");
	}

	static
	{
		Z4 b1 = new Z4();
		System.out.println("Z4-SIB1");
	}
	static
	{
		//B b1 = new B();
		System.out.println("Z4-SIB2");
	}
	static
	{
		//B b1 = new B();
		System.out.println("Z4-SIB3");
	}
	static
	{
		//B b1 = new B();
		System.out.println("Z4-SIB4");
	}
	public static void main(String[] args)
	{
		System.out.println("Done");
	}
}