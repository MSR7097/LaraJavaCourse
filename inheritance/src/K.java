class K 
{
	K()
	{

		super();
		System.out.println("K()");
	}
}

class L extends K
{
	L()
	{
		super();/* if super or this cannot present compiler automatically kept super()
					in every constructor								*/
		System.out.println("L()");
	}

	public static void main(String[] args) 
	{
		L l=new L();
	}
}
