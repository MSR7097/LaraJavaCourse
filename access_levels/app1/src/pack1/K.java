package pack1;
class J
{
	private int x;
	int y;
}
class K  
{
	public static void main(String[] args) 
	{
		J k1=new J();
		System.out.println(k1.x);
		System.out.println(k1.y);
	}
}


/* ---> x is private 
   ---> private members cannot be inherited to the sub class
   ---> private members can access in that class itself only not outside the class
   ---> y is default/friendly/package level
   ---> it can be accessed or inherited from super class to sub class within the same package
   same class ok
   sub-class --> same package access
   non sub-class  in same package access
   outside the package cannot access


   */