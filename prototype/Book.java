public class Book {
	private int bookId;
	private String bookName;


	public Book() {}

	public Book(int id, String name)
	{
		setId(id);
		setName(name);
	}

	public void setId(int id) { this. bookId = id; }
	public void setName(String name) { this.bookName = name; }

	public int getId() { return this. bookId; }
	public String getName() { return this.bookName; }

	@Override
	public String toString() {
	   return "Bookname: " + bookName +", id: " + bookId;
	}

}