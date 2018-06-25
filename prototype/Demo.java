public class Demo {
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bshoop1, bshoop2;

		bshoop1 = new BookShop("kinggarden");
		bshoop1.loadData();

		//bshoop1 = new BookShop("skiesthy");

		//bshoop1.loadData(); // take a long time
		System.out.println("BOOKSHOP 1");
		bshoop1.console();

		bshoop2 = (BookShop)bshoop1.clone();
		bshoop2.setName("skiethy");	

		bshoop1.getBooks().remove(2);

		System.out.println("BOOKSHOP 2");
		bshoop2.console();
		System.out.println("BOOKSHOP 1 AFTER REMOVE BOOK 3");
		bshoop1.console();
	}
}