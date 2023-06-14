class A 
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		
		System.out.println("A(int)");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B()");
	}
	B(int i)
	{
		
		System.out.println("B(int)");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C()");
	}
	C(int i)
	{
		
		System.out.println("C(int)");
	}

	
}
class Q extends C
{
	Q()
	{
		System.out.println("Q()");
	}
	Q(int i)
	{
		super();
		System.out.println("Q(int)");
	}
	public static void main(String[] args) 
	{
		A a=new A();
		System.out.println("----------");
		B b=new B();
		System.out.println("----------");
		C c=new C();
		System.out.println("----------");
		Q q=new Q();
		System.out.println("----------");
		A a1=new A(2);
		System.out.println("----------");
		B b1=new B(3);
		System.out.println("----------");
		C c1=new C(1);
		System.out.println("----------");
		Q q1=new Q(1985);
		System.out.println("----------");
	}
}
