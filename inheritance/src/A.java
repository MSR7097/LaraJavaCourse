class A
{
	int i;
} 
class B extends A
{
	int j;
	public static void main(String[] args) 
	{
		B b1=new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}


/*
	the code we provided demonstrates java inheritance.class 'B' inherits class 'A' which
	means that 'B' inherits the members and behaviours of 'A' including the i variable.
