class XYZ  
{
	public static void main(String[] args) 
	{
		int a=7,b=3,c=2,d=6,e=0;
		int min=((a<b)?(b<c)?(c<d)?(d<e)?a?b?c?d:e);
		System.out.println(min);
	}
}
