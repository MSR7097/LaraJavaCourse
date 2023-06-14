class Y 
{
	static Y y1=new Y();  /* like this also possible to create object but if static is there it will execute
							  if static is not there also no error but it wont execute only compiled*/
	Y()
	{
		System.out.println("Y()");
	}
	static
	{
		Y y1=new Y();
		System.out.println("SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("---------");
		Y y2=new Y();
		System.out.println("---------");
	}
}

/*
output:

Y()
Y()
SIB
----------
Y()
----------
*/
