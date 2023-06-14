import java.util.Scanner;
class J 
{
	public static void main(String[] args) 
	{
		
		System.out.println("enter details of student:");
		Scanner sc = new Scanner(System.in);
		System.out.print("Rollnumber:");
		int roll_num=sc.nextInt();
		sc.nextLine();
		System.out.print("Name:");
		String name=sc.nextLine();
		//sc.nextLine();
		
		System.out.print("age:");
		int age=sc.nextInt();
		//sc.nextLine();
		System.out.print("course:");
		String course=sc.next();
		System.out.print("skills:");
		String skills=sc.next();
		System.out.print("fee structure:");
		double fee=sc.nextDouble();
		System.out.print("job offer:");
		String joboffer=sc.next();
		System.out.println("-------------------");
		
		System.out.println("rollnumber:"+roll_num+ "\n Name: "+ name +"\n age: "+age+"\n course: "+course+
			"\n skills: "+skills+"\n fee: "+fee+"\n job offer: "+joboffer);
		
	}
}

