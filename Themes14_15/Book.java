package review.kadai15;

public class Book {
	 private int price;
	 private String name;
	 private String author;
	 
	 public Book(String name,int price,String author) {
	 	this.name=name;
	 	this.price=price;
	 	this.author=author;
	 }
	 public Book() {
		 	this.name="未登録";
		 	this.price=0;
		 	this.author="未登録";
		 }
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	 
}
