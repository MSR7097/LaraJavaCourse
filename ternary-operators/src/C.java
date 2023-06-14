class C 
{
	public static void main(String[] args) 
	{
		int j=1;
		int i;
		i=(j++ == 1 && j++ == 2) ? 10 : 20;
		System.out.println(i);
		System.out.println(j);
	}
}
