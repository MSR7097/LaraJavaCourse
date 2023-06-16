package pack1;

class O 
{
	private O()
	{
		System.out.println("N()");
	}
}
class P
{
	public static void main(String[] args) 
	{
		O o1=new O();
		System.out.println("Hello World!");
	}
}


// access modifiers are also applied to constructors
// error bcoz private declared constructor is using outside of the declared calss