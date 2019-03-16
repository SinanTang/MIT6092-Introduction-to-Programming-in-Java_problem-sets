
public class Book {
	
	String title;
	boolean borrowed;
	
	public Book(String bookTitle) {
		this.title = bookTitle;
		this.borrowed = false;
	}
	
	public void borrowed() {
		this.borrowed = true;
	}
	
	public void returned() {
		this.borrowed = false;
	}
	
	public boolean isBorrowed() {
		return this.borrowed;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public static void main(String[] args) {
		
		Book code = new Book("The Da Vinci Code");
		System.out.println("first book is "+code.getTitle());
		Book skin = new Book("Skin in the Game");

		code.borrowed();
		System.out.println("Borrowed? "+code.isBorrowed());
		System.out.println("Borrowed? "+skin.isBorrowed());
		System.out.println("second book is "+skin.getTitle());
	}

}
