package Assignment2;

public class Book {
	private int bookId;
	private String name;
	private String author;
	private String publisher;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String name, String author, String publisher) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", author=" + author + ", publisher=" + publisher + "]";
	}
	
	
	
	
}
