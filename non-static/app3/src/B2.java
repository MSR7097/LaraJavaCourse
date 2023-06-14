class Student 
{
	int roll_number;
	String name;
	String college_name;
	String subject;
	Student(int roll_number,String name)
	{
		this.roll_number=roll_number;
		this.name=name;
	}

	{
		this.college_name="LARA";
	}
	{
		this.subject="Java Full-stack";
	}
	public static void main(String[] args) 
	{
		Student s1=new Student(101,"MADHU    ");
		
		Student s2=new Student(102,"SHYAM    ");
		
		Student s3=new Student(103,"SIVA     ");
		
		Student s4=new Student(104,"SRIKANTH");
		
		System.out.println(s1.roll_number+" , "+s1.name+" , "+s1.college_name+" , "+s1.subject);
		System.out.println(s2.roll_number+" , "+s2.name+" , "+s2.college_name+" , "+s2.subject);
		System.out.println(s3.roll_number+" , "+s3.name+" , "+s3.college_name+" , "+s3.subject);
		System.out.println(s4.roll_number+" , "+s4.name+" , "+s4.college_name+"  , "+s4.subject);
	}
}
