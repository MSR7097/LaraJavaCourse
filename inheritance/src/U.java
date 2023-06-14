class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}

class U extends A 
{
	U(int i)
	{
		super(i);
		System.out.println("T(int)");
	}
	public static void main(String[] args) 
	{
		U t=new U(90);
		System.out.println("done!");
	}
}
