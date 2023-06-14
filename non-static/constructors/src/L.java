class L 
{
	L(int i,int j)
	{
		System.out.println("K(int)");
	}
	L(int i,double j)
	{
		System.out.println("K(boolean)");
	}
	public static void main(String[] args) 
	{
		L obj=new L(90,80);
		System.out.println("------------");
		L l=new L(10,2.0);
		System.out.println("------------");
		
	}
}
