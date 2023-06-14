package pack1;
class A 
{
	private int i;
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println(a1.i);
	}
}


/* 
	there are 4 access specifiers which are
	1.private
	2.default
	3.protected
	4.public 

	access specifiers == access access modifiers
	
	--> the access specifiers in java are maintaing the accessibility or scope ofa
		field,method,constructor,class or Interface.
	-->	By using these we can have control over the data, which one should be shared and
		which one should not be shared over the package.
	--> default ==> package level access modifier or friendly
		
		private
		---------
	--> the private members can be accessed within the class
		or the scope of private members is within the declared class level only even though both the classes is in same package also.
	-->	incase of inheritance also not possible
	--> private members cannot be accessed outside of class.
	--> private is the narrower where as public is wider 

*/