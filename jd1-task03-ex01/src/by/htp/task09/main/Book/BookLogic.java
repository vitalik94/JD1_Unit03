package by.htp.task09.main.Book;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {
	
	public List<Book> infoBook(ChartBook chbo) {

		List<Book> inbo = new ArrayList<Book>();

		Book[] bo = chbo.getBook();

		for (Book b : bo) {

			inbo.add(b);

		}

		return inbo;

	}

	public static List<Book> authorBook(ChartBook chbo, String a) {

		List<Book> inbo = new ArrayList<Book>();
		
		for (Book b : chbo.getBook()) {

			if (b.getAuthor().compareTo(a) == 0) {

				inbo.add(b);

			}

		}
		
		return inbo;

	}

	public static List<Book> publishingHouseBook(ChartBook chbo, String p) {

		List<Book> inbo = new ArrayList<Book>();
		
		for (Book b : chbo.getBook()) {

			if (b.getPublishingHouse().compareTo(p) == 0) {

				inbo.add(b);

			}

		}

		return inbo;

	}
	
	public static List<Book> yearPublishingBook(ChartBook chbo, int year) {

		List<Book> inbo = new ArrayList<Book>();

		for (Book b : chbo.getBook()) {

			if (b.getYearPublishing() >= year) {

				inbo.add(b);

			}

		}

		return inbo;

	}

}
