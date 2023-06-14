class B 
{
	static int p=10;
	public static void main(String[] args) 
	{
		System.out.println("a: "+p);
		System.out.println("b: "+B.p);
		B obj = new B();
		System.out.println("c: "+obj.p);
	}
}


/*
--> by using any reference of any object we can able  modify the static member
--> only original static member will be modifying bcoz static member loaded only once

*/