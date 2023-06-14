class A 
{
	int i;
	void test1()
	{
		System.out.println("A_test1");
	}
}
class E
{
	A obj=new A();
	void test2()
	{
		System.out.println("E-test2");
		System.out.println(obj.i);
		obj.test1();
	}

	public static void main(String[] args)          
	{
		E e1=new E();
		e1 .test2();
	}
}


// we cannot able to call anyhing under null reference.if we call we get --NullPointerException--
// here --A obj-- is just creating the object it is not pointing to anyobject 