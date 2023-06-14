
class A
{
	A()
	{
		//super()
		//IIB
		System.out.println("A()");
	}
	A(int i)
	{
		//super()
		//IIB
		System.out.println("A(int)");
	}
	{
		System.out.println("A-IIB");
	}

}

class B extends A
{
	B()
	{
		//super()
		//IIB
		System.out.println("B()");
	}
	B(int i)
	{
		this();	
		System.out.println("B(int)");
	}
	{
		System.out.println("B-IIB_1");
	}

	{
		System.out.println("B-IIB_2");
	}


}

class C extends B
{
	C()
	{
		super(8);
		System.out.println("C()");
	}
	{
		
		System.out.println("C-IIB");
	}
	C(int i)
	{
		this();
		System.out.println("C(int)");
	}
}

class Y 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println("-----------------");
		
		B b1=new B();
		System.out.println("-----------------");
		A a2=new A(20);
		System.out.println("-----------------");
		
		B b2=new B(40);
		System.out.println("-----------------");
		C c1=new C();
		System.out.println("-----------------");
		
		C c2=new C(3);
		System.out.println("-----------------");
		
	}
}
