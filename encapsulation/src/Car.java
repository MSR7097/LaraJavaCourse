class Car 
{
	private String make;
	private String model;
	private int year;
	
	public String getmake()
	{
		return make;
	}
	public String getmodel()
	{
		return model;
	}
	public int getyear()
	{
		return year;
	}
	public void setmake(String make)
	{
		this.make=make;
	}
	public void setmodel(String model)
	{
		this.model=model;
	}
	public void setyear(int year)
	{
		this.year=year;
	}
}

class CarDriver
{
	public static void main(String[] args)
	{
		Car c=new Car();
		c.setmake("Mahendra");
		c.setmodel("Bolero");
		c.setyear(2019);
		String make=c.getmake();
		String model=c.getmodel();
		int year =c.getyear();
		System.out.println(make);
		System.out.println(model);
		System.out.println(year);
	}
	
	
	
}
