class A 
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		this();
		System.out.println("A(int)");
	}
}
class B extends A
{
	B()
	{
		super(10);
		System.out.println("B()");
	}
	B(int i)
	{
		this();
		System.out.println("B(int)");
	}
}
class C extends B
{
	C()
	{
		this(90);
		System.out.println("C()");
	}
	C(int i)
	{
		super(i);
		System.out.println("C(int)");
	}

}

class S extends C
{
	S()
	{
		this(10);
		System.out.println("S()");
	}
	S(int i)
	{
		super(200);
		System.out.println("S(int)");
	}
	public static void main(String[] args) 
	{
		A a=new A();
		System.out.println("----------");
		B b=new B();
		System.out.println("----------");
		C c=new C();
		System.out.println("----------");
		S s=new S();
		System.out.println("----------");
		A a1=new A(2);
		System.out.println("----------");
		B b1=new B(3);
		System.out.println("----------");
		C c1=new C(1);
		System.out.println("----------");
		S s1=new S(1985);
		System.out.println("----------");
	}
}
