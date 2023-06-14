class Z12
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		int j=test(++i);
		System.out.println("main end:  "+i +" , "+j);
	}
	public static int test(int i)
	{
		System.out.println("from test begin :"+ i);
		System.out.println("from test :"+ i++);
		System.out.println("from test :"+ ++i);
		System.out.println("from test end :"+ ++i + i);
		return i++;
		
	}

}
