class E 
{
	static int count;
	E()
	{
		count++;
	}
	E(int i)
	{
		count++;
	}
	E(int i, int j)
	{
		count++;
	}
	public static void main(String[] args) 
	{
		E e1=new E();
		E e2=new E(2);
		E e3=new E(2,3);
		E e4=new E(4);
		E e5=new E();
		System.out.println(count);
		
	}
}
