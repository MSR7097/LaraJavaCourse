class H 
{
	void test()
	{
	}
	public static void main(String[] args) 
	{
		H h=new H();
		h.test();
		System.out.println("done");
	}
}

// non-static menthos test() loading to memory whenever the H class object is creating
// by using reference variable h we can acces a test method which is static 