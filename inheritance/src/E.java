class E
{
	static int i;
}

class F extends E 
{
	static int j;
	public static void main(String[] args) 
	{
		System.out.println(F.i);
		System.out.println(F.j);
	}
}

//	static and non-static both are inherited to sub-class from super-class
//	by using sub-class reference only we have to access the super class static members
//	by creating the object to sub-class also we can access the static of super-class