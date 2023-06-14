package pack1;
class H
{
	private int i;
	public void set(int i)
	{
		//this.i=i;
		//this.i=this.i;
		i=this.i;
		//this keyword represents current object
		// if global and local variable having same name local variable having first preference
		// then we use this keyword to access global variable in local scope
	}
	public int get()
	{
		return i;
	}
}


class I 
{
	public static void main(String[] args) 
	{
		H h1=new H();
		System.out.println(h1.get());
		h1.set(90);
		System.out.println(h1.get());
	}
}
