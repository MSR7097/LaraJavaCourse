class G 
{
	{
		System.out.println("G- IIB1");
	}
	G(int i)
	{
		
		System.out.println("G(int)");
	}
	G()
	{
		this(9);
		System.out.println("G()");
	}
	public static void main(String[] args) 
	{
		G g1=new G();
		System.out.println("------");
		G g2=new G(50);
		System.out.println("------");
	}
	
}
