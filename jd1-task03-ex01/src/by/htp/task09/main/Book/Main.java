package by.htp.task09.main.Book;

import java.util.List;

import by.htp.task08.main.Customer.Customer;

public class Main {

	public static void main(String[] args) {

		ChartBook cb = new ChartBook(5);
		
		BookLogic bl = new BookLogic();
		
		cb.add(new Book(1,"компьютер","дроздов н.с.","луч",1925,64,93,"твердый"));
		cb.add(new Book(2,"двигатель","шпротов у.щ.","цвет",1959,14,43,"мягкий"));
		cb.add(new Book(3,"мебель","котов п.г.","право",1972,95,52,"твердый"));
		cb.add(new Book(4,"корабль","носов т.л.","луч",1949,37,94,"мягкий"));
		cb.add(new Book(5,"история","пускин ю.м.","автор",1912,72,74,"твердый"));
		
		System.out.println("Список книг: ");
		List<Book> inbo = bl.infoBook(cb);
		print(inbo);
		
		System.out.println("Список книг, заданного автора: ");
		List<Book> aubo = bl.authorBook(cb,"шпротов у.щ.");
		print(aubo);
		
		System.out.println("Список книг, выпущенных заданным издательством: ");
		List<Book> phbo = bl.publishingHouseBook(cb,"луч");
		print(phbo);
		
		System.out.println("Список книг, выпущенных после заданного года: ");
		List<Book> ypbo = bl.yearPublishingBook(cb, 1930);
		print(ypbo);

	}
	
	public static void print(List<Book> inbo) {
		
		for(Book b : inbo) {
			
			System.out.println("ID: " + b.getID());
			System.out.println("Название: " + b.getName());
			System.out.println("Автор: " + b.getAuthor());
			System.out.println("Издательство: " + b.getPublishingHouse());
			System.out.println("Год издания: " + b.getYearPublishing());
			System.out.println("Количество страниц: " + b.getNumberOfPages());
			System.out.println("Цена: " + b.getPrice());
			System.out.println("Тип переплета: " + b.getBindingType());
			System.out.println();
			
		}
		
	}

}
