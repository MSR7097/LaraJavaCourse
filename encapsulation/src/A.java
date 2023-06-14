class A
{
	private String name;
	private int rollNumber;
	private int age;

	public String getName()
	{
		return name;  // (or) this.name both are same.
	}
	public int getRollNumber()
	{
		return rollNumber; // or this.rollNumber.
	}
	public int getAge()
	{
		return age; // or this.age;
	}
	// write-only ---> setters methods
	public void setName(String name)
	{
		this.name=name;
	}
	public void setRollNumber(int rollNumber)
	{
		this.rollNumber=rollNumber;
	}
	public void setAge(int age)
	{
		this.age=age;
	}

}


class DriverClass
{
	public static void main(String[] args)
	{
		A a1=new A();
		System.out.println(a1.getName());
		System.out.println(a1.getRollNumber());
		System.out.println(a1.getAge());
		System.out.println("--------------");
		a1.setName("Madhu");
		a1.setRollNumber(142);
		a1.setAge(23);
		System.out.println(a1.getName());
		System.out.println(a1.getRollNumber());
		System.out.println(a1.getAge());
	}
}






/* static or non-static variables are data members(data)
   static methods or non-static methods are member functions(code)
*/