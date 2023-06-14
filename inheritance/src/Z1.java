
class A
{
	static int i=test1();
	int j=test2();

	static int k=test4();
	int l=test5();

	static int test1()
	{
		return 10 + test2();
	}

	static int test4()
	{
		return 20;

	}

//------------------------------------
	int test3()
	{
		A a1=new A();
		return 30;
	}
	int test5()
	{
		B b1=new B();
		return 40;
	}

	
	
	
	
	A()
	{
		this(2,3);
		System.out.println("A()");
	}
	A(int i,int j)
	{
		A a1=new A(10,20,30);	
		System.out.println("A(int int)");
		
	}
	A(int i,int j,int k)
	{
		B b1=new B()
		System.out.println("A(int int int)");
		
	}


	{
		
		System.out.println("A-IIB1");
	}
	static
	{
		A a1=new A();
		System.out.println("A-SIB-1");
	}
	static
	{
		B b1=new B();
		System.out.println("A-SIB-2");
	}

}

class B extends A
{
	static 
	{
		System.out.println("B-SIB");
	}
	static 
	{
		System.out.println("B-SIB-2");
	}
}

class C extends B
{
	static 
	{
		System.out.println("C-SIB");
	}
	static 
	{
		System.out.println("C-SIB-2");
	}
}

class Z extends C 
{
	static
	{
		System.out.println("Z-SIB");
	}
	static
	{
		System.out.println("Z-SIB-2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}
