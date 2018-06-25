import java.util.List;
import java.util.ArrayList;

public class BookShop  implements Cloneable {
	private List<Book> books = new ArrayList();

	private String shopName;

	public BookShop() {}

	public BookShop(String name) { setName(name); }

	public void setName(String name) { this.shopName = name; }

	public String getName() { return this.shopName; }

	public void setBooks(List<Book> other) { this.books = other; }

	public List<Book> getBooks() { return this.books; }


    // high cost due to database querying
	public void loadData() {
		for (int i=0; i<10; i++) {
			books.add(new Book(i+1, "Book "+(i+1)));
		}
	}


	// @Override
	// protected Object clone() throws CloneNotSupportedException {
	// 	return super.clone();
	// }


	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop shop = new BookShop();

		for(Book b : this.getBooks())
			shop.getBooks().add(b);

		return shop;
	}

	public void  console() {
		System.out.println(shopName);
		for (int i=0 ;i<books.size(); i++)
			System.out.println(books.get(i).toString());
	}	
}