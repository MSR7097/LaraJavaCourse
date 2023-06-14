class G13 
{
	public static void main(String[] args) 
	{
		int i=8;
		{
			{
				//int i=9;
				System.out.println("onner normal block!  "+ i);
			}
			System.out.println("outer normal block!  "+ i);
		}
		System.out.println("main end!  "+ i);
	}
}
