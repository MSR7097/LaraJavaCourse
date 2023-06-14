class K 
{
	public static void main(String[] args) 
	{
		boolean flag = false;
		if (flag = true)    // here flag is reinitialized
		{
			System.out.println("from if");
		}
		System.out.println("end");
		System.out.println(flag);	}
}
