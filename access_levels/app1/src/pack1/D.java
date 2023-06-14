package pack1;
class D
{
	private void test()
	{
		System.out.println("from test");
	}
} 
class E
{
	public static void main(String[] args) 
	{
		D d1=new D();
		d1.test();
		System.out.println("Hello World!");
	}
}

//in one java file any number of class will be developed.
// for all the classes .class