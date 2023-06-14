class A 
{
	public static void main(String[] args) 
	{
		int i=5;
		switch(i)	// switch(any value) is also possible
		{
			case 2:
				System.out.println("from case 2");
			case 5:
				System.out.println("from case 5");
			break;
			case 3:
				System.out.println("from case 3");
			case 6:
				System.out.println("from case 2");
			case 7:
				System.out.println("from case 5");
			case 9:
				System.out.println("from case 3");
		}
	}
}

/* if --break-- was not there after the true condition then the next
	conditions also will print */