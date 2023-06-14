
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

class X 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println("-----------------");
		A a2=new A();
		System.out.println("-----------------");
		B b1=new B();
		System.out.println("-----------------");
		B b2=new B();
		System.out.println("-----------------");
		
	}
}
