class Z3 
{
	public static void main(String[] args) 
	{
		int r=0;
		int s=0;

		for (int i=2002;i!=0 ; )
		{
			r=i%10;
			s=(s*10)+r;
			i=i/10;
		}
		System.out.println(s);
	}
}
