class MobilePhone {
    private String brand;
    private String model;
    private String color;

    // Getters and setters for brand, model, and color
    // ...
	public String getBrand()
	{
		return brand;
	}
	public String getModel()
	{
		return model;
	}
	public String getColor()
	{
		return color;
	}

	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setModel(String model)
	{
		this.model=model;

	}

	public void setColor(String color)
	{
		this.color=color;
	}

}

class Phone
{


    public static void main(String[] args)
	{
        MobilePhone phone = new MobilePhone();
        phone.setBrand("Samsung");
        phone.setModel("Galaxy S21");
        phone.setColor("Black");
        String brand = phone.getBrand();
        String model = phone.getModel();
        String color = phone.getColor();
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}