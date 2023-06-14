import java.util.Scanner;
class H 
{
	public static void main(String[] args) 
	{
		
		System.out.println("enter three int values:");
		Scanner sc1 = new Scanner(System.in);
		
		int v1 = sc1.nextInt();
		int v2 = sc1.nextInt();
		int v3 = sc1.nextInt();

		System.out.println("------------");
		System.out.println(v1+v2+v3+" is sum of three int values");
	}
}

