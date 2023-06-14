class C
{
	void test1()
	{
		System.out.println("from test1");
	}
}

class D extends C
{
	void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[] args) 
	{
		D d=new D();
		d.test1();
		d.test2();
		System.out.println("done!");
	}
}
