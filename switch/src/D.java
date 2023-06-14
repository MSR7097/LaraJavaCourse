class D 
{
	public static void main(String[] args) 
	{
		int i=15;
		switch(i)
		{
			case 2:
				System.out.println("from case 2");
			break;
			case 3:
				System.out.println("from case 3");
			break;
			case 5:
				System.out.println("from case 5");
			break;
		}
		System.out.println("from main end"); 
	}
}



/* output is ---main end--- bcoz there is no matching case i.e i=15, but cases are 2,3,5*/
