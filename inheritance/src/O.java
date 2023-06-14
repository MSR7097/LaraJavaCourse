class M 
{
	M()
	{
		System.out.println("M()");
	}
}
class N extends M
{
	N()
	{
		System.out.println("N()");
	}
}
class O extends N
{

	public static void main(String[] args) 
	{
		M m=new M();
		System.out.println("----------");
		N n=new N();
		System.out.println("----------");
		O o=new O();
		System.out.println("----------");
	}
}
