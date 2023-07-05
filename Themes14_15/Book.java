package review.kadai15_re;

public class Book {
	private int seq;
	private String title;
	private int price;
	private String author;

	public void setSeq(int seq) {
		this.seq =seq;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPlice() {
		return price;
	}

	public void setPlice(int plice) {
		this.price = plice;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Book) {
			Book b = (Book) o;
			if (this.title.equals(b.title) && (this.author.equals(b.author))) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return "書籍名:"+this.title+"/価格:"+this.price+"/著者名:"+this.author+"を追加します。";
	}
}
