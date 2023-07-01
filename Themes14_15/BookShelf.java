package review.kadai15;

import java.util.Scanner;

public class BookShelf {
	Book book[];

	public BookShelf() {
		this.book = new Book[5];
		for (int i = 0; i < book.length; i++) {
			this.book[i] = new Book();
		}
	}

	public void list() {
		System.out.println("現在所持している本一覧================");
		for (int i = 0; i < this.book.length; i++) {
			if (this.book[i].getName() == "未登録") {
				continue;
			}
			System.out.println("書籍名：" + this.book[i].getName() + "/" + this.book[i].getPrice() + "円/著者名："
					+ this.book[i].getAuthor());
		}
		System.out.println("===============================");
	}

	public boolean setBook(int i) {
		System.out.println("新しい書籍を追加します。");
		System.out.print("書籍名を入力してください。>");
		String name = new Scanner(System.in).nextLine();
		System.out.print("価格を入力してください。>");
		int price = new Scanner(System.in).nextInt();
		System.out.print("著者名を入力してください。>");
		String author = new Scanner(System.in).nextLine();
		System.out.println("\n書籍名：" + name + "/価格：" + price + "/著者名：" + author + "を追加します。");
		//登録内容のチェック
		for (int j = 0; j < this.book.length; j++) {
			if (this.book[j].getName().equals(name) && this.book[j].getAuthor().equals(author)) {
				System.out.println("同じ書籍があるので追加されませんでした。");
				return false;
			}
		}
		System.out.println("登録に成功しました。");
		this.book[i].setName(name);
		this.book[i].setPrice(price);
		this.book[i].setAuthor(author);
		this.list();
		return true;
	}
}
