class M2 
{
	
	{
		System.out.println(i);		// IFR is not only in satic but incase of non-static also happens
	}								// IFR -- Illegal Forward Reference
	int i;
	public static void main(String[] args) 
	{
		M2 m=new M2();
	}
}
