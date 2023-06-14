class Z15 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1(10,20,40);
		test2("K","L",9);
	}
	public static void test1(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
	public static int test2(String m,String n,int l)
	{
		System.out.println(m+":"+n+":"+l);
		return 0;
	}

}
