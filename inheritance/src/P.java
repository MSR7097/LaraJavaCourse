
//	constructor chaining
//-------------------------
//	means one constructor is calling another constructor
/* in this program P() is calling C() in that C() is calling B() that B() is calling
	A() internally bcoz we are not writing this() or super() by default compiler
	only writes super() if this() or super() are not there  */

class A 
{
	A()
	{
		System.out.println("A()");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B()");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C()");
	}

	
}
class P extends C
{
	P()
	{
		System.out.println("P()");
	}
	public static void main(String[] args) 
	{
		A a=new A();
		System.out.println("----------");
		B b=new B();
		System.out.println("----------");
		C c=new C();
		System.out.println("----------");
		P p=new P();
		System.out.println("----------");
	}
}
