class A1 
{
	A1()
	{
		System.out.println("A()");
	}
	A1(int i)
	{
		System.out.println(" A(int)");
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		A1 a1 = new A1();
		System.out.println("-------");
		A1 a2 = new A1(10);
		System.out.println("-------");
	}
}
