class Tickets 
{
	private int totalseats;
	private int filled;
	private int available;
	private String nums_of_availableseats;
	private int seatnum;
	private String name;
	private int age;
	
	public int getTotalseats()
	{
		return totalseats;
	}
	public int getFilled()
	{
		return filled;
	}
	public int getAvailable()
	{
		return available;
	}
	public String getNums_of_availableseats()
	{
		return nums_of_availableseats;
	}
	
	public int getSeatnum()
	{
		return seatnum;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}

	public void setTotalseats(int seats)
	{
		this.totalseats=seats;
	}
	public void setFilled(int filled)
	{
		this.filled=filled;
	}

	public void setAvailable(int avl)
	{
		this.available=avl;
	}
	public void setNums_of_availableseats(int x,int i,int j,int k)
	{
		this.nums_of_availableseats=null;
	}
	
	public void setSeatnum(int sn)
	{
		this.seatnum=sn;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}

	
}

/*

	private int totalseats;
	private int filled;
	private int available;
	private int seatnum;
	private String name;
	private int age;
	*/

class Bus
{
	public static void main(String[] args)
	{
		
		Tickets t=new Tickets();
		t.setTotalseats(36);
		t.setFilled(32);
		t.setAvailable(4);
		t.setNums_of_availableseats(2,4,5,9);
		t.setSeatnum(5);
		t.setName("MADHU");
		t.setAge(23);
		System.out.println("Totalseats: "+t.getTotalseats());
		System.out.println("Filled: "+t.getFilled());
		System.out.println("Available: "+t.getAvailable());
		System.out.println("seats Available: "+"2 , 5 , 4 , 9");
		
		System.out.println("Select seat num: "+t.getSeatnum());
		System.out.println("Enter name: "+t.getName());
		System.out.println("Enter age: "+t.getAge());
	}
}
