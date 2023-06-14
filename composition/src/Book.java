class Publisher 
{
	String name;
	String publisherID;
	String city;
	Publisher(String name,String publisherID,String city)
	{
		this.name=name;
		this.publisherID=publisherID;
		this.city=city;
	}
}
class Author
{
	String authorName;
	int age;
	String place;

	Author(String name,int age,String place)
	{
		this.authorName=name;
		this.age=age;
		this.place=place;
	}

}

// Book class has-a  
// Book class has-a 
class Book
{
	String name;
	int price;
	//Author details:
	Author a;
	Publisher p;
	Book(String n,int p,Author author,Publisher publisher)
	{
		this.name=n;
		this.price=p;
		this.a=author;
		this.p=publisher;


	}


	public static void main(String[] args) 
	{
		Author a=new Author("John",42,"USA");
		Publisher p=new Publisher("Sun Publications","JDSR-III4","LA");
		Book b=new Book("Java",600,a,p);
		System.out.println("Book Name"+b.name);
		System.out.println("Book price"+b.price);
		System.out.println("---------Author Details----------");
		System.out.println("Author Name"+b.a.authorName);
		System.out.println("Author Age"+b.a.age);
		System.out.println("Author place"+b.a.place);
		System.out.println("--------Publisher Details---------");
		System.out.println("Publisher Name"+b.p.name);
		System.out.println("Publisher ID"+b.p.publisherID);
		System.out.println("Publisher city"+b.p.city);
		
	}
}
