class Product {
    private String name;
    

    // Getters and setters for name, price, and quantity
    // ...
	public String getName()
	{
		return name;
	}
	

	public void setName(String name)
	{
		this.name=name;
	}
	
}

class Products
{



    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Phone");
       
        String name = product.getName();
       
        System.out.println("Name: " + name);
      
    }
}