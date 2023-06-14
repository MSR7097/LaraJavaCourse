class Book {
    private String title;
    private String author;
    private int yearPublished;

	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}

	public int getYearPublished()
	{
		return yearPublished;
	}

	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}

	public void setYearPublished(int x)
	{
		this.yearPublished=x;
	}

}

class Author
{


    // Getters and setters for title, author, and yearPublished
    // ...

    public static void main(String[] args)
	{
        Book book = new Book();
        book.setTitle("Java Programming");
        book.setAuthor("John Smith");
        book.setYearPublished(2022);
        String title = book.getTitle();
        String author = book.getAuthor();
        int yearPublished = book.getYearPublished();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }
}