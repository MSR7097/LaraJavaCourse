package pack1;
class S
{
	private S()
	{
		System.out.println("Q()");
	}
	S(int i)
	{
		
	}
}
class T extends Q 
{
	T()
	{
		super(9);
	}
}

//error bcoz in 