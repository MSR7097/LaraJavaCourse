class A 
{
	int i;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class B extends A
{
	void test2()
	{
	System.out.println("B-test");
	System.out.println(i);
	test1();
	}

	public static void main(String[] args) 
	{
		B b=new B();
		b.test2();
	}
}
