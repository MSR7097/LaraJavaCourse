class O 
{
	int i;
	public static void main(String[] args) 
	{
		O o1=new O();
		O o2=o1;
		O o3=o2;
		O o4=new O();
		System.out.println(o4.i);
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o3.i);
		o1.i=10;
		System.out.println(o2.i);
		System.out.println(o1.i);
		o2.i=20;
		System.out.println(o1.i);
		System.out.println(o3.i);
		System.out.println("-------------");
		System.out.println(o4.i);
	}
}

// one object can have any numbers of references
