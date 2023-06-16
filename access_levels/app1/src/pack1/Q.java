package pack1;
class Q
{
	private Q()
	{
		System.out.println("Q()");
	}
}
class R extends Q 
{
	R r1=new R();
}

//error bcoz in 