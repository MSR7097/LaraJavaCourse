class O 
{
	public static void main(String[] args) 
	{
		String i="abc";
		switch(i="bca")
		{
			case "bca":
				System.out.println("from case \"bca\" ");
			break;
			case "abc":
				System.out.println("from case \"abc\" ");
			break;
			case "cab":
				System.out.println("from case \"cab\" ");
			break;
		}
	}
}
