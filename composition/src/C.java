class A 
{
	int i;
	void test1()
	{
		System.out.println("A_test1");
	}
}
class C
{
	A obj;
	void test2()
	{
		System.out.println("C_test2");
		//System.out.println(i);
		//test1();
	}

	public static void main(String[] args) 
	{
		C c = new C();
		c.test2();
		System.out.println(c.obj);
	}
}
