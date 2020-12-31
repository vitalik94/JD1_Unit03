package by.htp.task08.main.Customer;

/*
 * 8. Создать класс Customer, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String address;
	private int creditCard;
	private int bankAccount;

	public Customer(int id, String surname, String name, String address, int creditCard, int bankAccount) {

		this.id = id;
		this.surname = surname;
		this.name = name;
		this.address = address;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;

	}

	public void setID(int id) {

		this.id = id;

	}

	public void setSurname(String surname) {

		this.surname = surname;

	}

	public void setName(String name) {

		this.name = name;

	}

	public void setAddress(String address) {

		this.address = address;

	}

	public void setCreditCard(int creditCard) {

		this.creditCard = creditCard;

	}

	public void setBankAccount(int bankAccount) {

		this.bankAccount = bankAccount;

	}

	public int getID() {

		return id;

	}

	public String getSurname() {

		return surname;

	}

	public String getName() {

		return name;

	}

	public String getAddress() {

		return address;

	}

	public int getCreditCard() {

		return creditCard;

	}

	public int getBankAccount() {

		return bankAccount;

	}

	@Override
	public String toString() {

		return "ID" + id + ", surname" + surname + ",name" + name + ", address" + address + ",creditCard" + creditCard
				+ ",bankAccount" + bankAccount;

	}

}
