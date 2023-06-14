class K4         
{
	static int i=9;
	
	static  
	{
		K4 k4=new K4();
		System.out.println("static :"+k4.i);
	}
	
	 
	
	
}


/* each and every static member(static variable and static methods) will be shared by
	all the objects of that class.
