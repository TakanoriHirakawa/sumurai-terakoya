package review.kadai15_re;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
	List<Book> bookShelf = new ArrayList<Book>();

	public void list() {
		System.out.println("現在所持している本一覧================");
		for (int i = 0; i < bookShelf.size(); i++) {
			System.out.println(bookShelf.get(i).toString());
		}
		System.out.println("\n===============================");
	}

	public void addList(Book book) {
		bookShelf.add(book);
	}

	public boolean checkList(Book book) {
		for (int i = 0; i < bookShelf.size(); i++) {
			if (book.equals(bookShelf.get(i)) == true) {
				return true;
			}
		}
		return false;
	}

}
