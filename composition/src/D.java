class A 
{
	int i;
	void test1()
	{
		System.out.println("A_test1");
	}
}
class D
{
	A obj;
	void test2()
	{
		System.out.println("c-test2");
		System.out.println(obj.i);
		obj.test1();
	}

	public static void main(String[] args) 
	{
		D d=new D();
		System.out.println(d.obj);
		d.test2();
	}
}


// we cannot able to call anyhing under null reference.if we call we get --NullPointerException--
// here --A obj-- is just creating the object it is not pointing to anyobject 