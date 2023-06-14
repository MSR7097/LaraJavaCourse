class J 
{
	void test1()	//non-static 
	{
		System.out.println("from test");
	}

	static void test2()
	{
		J obj = new J();
		obj.test1();
		System.out.println("from test");
	}
}
