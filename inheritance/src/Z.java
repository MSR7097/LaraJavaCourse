
class A
{
	static int i = test1();
	int j = test3();

	static int k = test4();
	

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
		A a1 = new A();
		return 30;
	}
	
	A()
	{
		this(10, 20);
		System.out.println("A()");
	}
	A(int i, int j)
	{
		
		System.out.println("A(int, int)");
	}
	static
	{
		System.out.println("A-SIB");
	}

}

class B extends A
{
	static 
	{
		System.out.println("B-SIB");
	}
}

class C extends B
{
	static 
	{
		System.out.println("C-SIB");
	}
}

class Z extends C 
{
	static
	{
		System.out.println("Z-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println(Z.i);
		System.out.println("main");
	}
}
