class Employee {
    private String name;
    private double salary;

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public void setSalary(double salary)
	{
		this.salary=salary;
	}
}

class Salary
{


    // Getters and setters for name and salary
    // ...

    public static void main(String[] args)
	{
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setSalary(50000.0);
        String name = employee.getName();
        double salary = employee.getSalary();
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}