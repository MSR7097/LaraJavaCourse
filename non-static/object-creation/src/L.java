class L 
{
	void test1()
	{
		System.out.println("from test");
	}
	static
	{
		L obj = new L();
		obj.test1();
	}
}
