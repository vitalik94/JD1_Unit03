package by.htp.task09.main.Book;

/*
 * Создать класс Book, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и методtoString(). Создать второй класс, 
 * агрегирующий массив типа Book, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, 
 * тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года;
 */

public class Book {
	
	private int id;
	private String name;
	private String author;
	private String publishingHouse;
	private int yearPublishing;
	private int numberOfPages;
	private int price;
	private String bindingType;
	
	public Book(int id, String name, String author, String publishingHouse, int yearPublishing, int numberOfPages, int price, String bindingType) {

		this.id = id;
		this.name = name;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.yearPublishing = yearPublishing;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.bindingType = bindingType;

	}
	
	public void setID(int id) {

		this.id = id;

	}

	public void setName(String name) {

		this.name = name;

	}
	
	public void setAuthor(String author) {

		this.author = author;

	}
	
	public void setPublishingHouse(String publishingHouse) {

		this.publishingHouse = publishingHouse;

	}

	public void setYearPublishing(int yearPublishing) {

		this.yearPublishing = yearPublishing;

	}

	public void setNumberOfPages(int numberOfPages) {

		this.numberOfPages = numberOfPages;

	}

	public void setBindingType(String bindingType) {

		this.bindingType = bindingType;

	}
	
	public void setPrice(int price) {

		this.price = price;

	}

	public int getID() {

		return id;

	}
	
	public String getName() {

		return name;

	}

	public String getAuthor() {

		return author;

	}

	public String getPublishingHouse() {

		return publishingHouse;

	}

	public int getYearPublishing() {

		return yearPublishing;

	}

	public int getNumberOfPages() {

		return numberOfPages;

	}
	
	public int getPrice() {

		return price;

	}
	
	public String getBindingType() {

		return bindingType;

	}

	@Override
	public String toString() {

		return "ID" + id + ",name" + name + ", author" + author + ", publishingHouse" + publishingHouse
				+ ", yearPublishing" + yearPublishing + ", numberOfPages" + numberOfPages + ", price" + price + ", bindingType" + bindingType;

	}

}
