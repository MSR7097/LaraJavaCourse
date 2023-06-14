class A5 
{
	static int i;
	static 
	{
		System.out.println("sib from A");
	}
	static 
	{
		System.out.println("sib2 from A");
	}
}
class P6
{
	static 
	{
		System.out.println("sib from p6");
	}


	public static void main(String[] args) 
	{
		System.out.println("main"+A.i);
	}
}
