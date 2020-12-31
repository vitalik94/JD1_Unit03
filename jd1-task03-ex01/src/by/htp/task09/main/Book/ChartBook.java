package by.htp.task09.main.Book;

public class ChartBook {
	
	private Book[] bo;
	private int Groupbook;
	
	
	public ChartBook(int num){
		
		bo = new Book[num];
		Groupbook = 0;
	}
	
	public void add (Book b) {
		
		bo[Groupbook] = b;
		Groupbook++;

	}
	
	public void setBook(Book[] bo) {
		
		this.bo = bo;
	}
	
	public Book[] getBook() {
		
		return bo;
		
	}

}
