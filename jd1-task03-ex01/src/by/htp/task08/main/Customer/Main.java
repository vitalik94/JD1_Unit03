package by.htp.task08.main.Customer;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		ChartCustomer chcu = new ChartCustomer(5);

		CustomerLogic culo = new CustomerLogic();

		chcu.add(new Customer(1, "Котов", "Сергей Игоревич", "Сурганова 2,4", 123454, 22452));
		chcu.add(new Customer(2, "Мышь", "Иванов Дмитриевич", "Ленина 5,9", 258654, 47754));
		chcu.add(new Customer(3, "Иванов", "Иван Олегович", "Первомайская 8,3", 148964, 15963));
		chcu.add(new Customer(4, "Дроздов", "Юрий Иванович", "Лазаренко 4,6", 146743, 75245));
		chcu.add(new Customer(5, "Псов", "Владислав Леонидович", "Орловского 1,7", 124576, 23563));

		System.out.println("Список покупателей: ");
		List<Customer> grcustom = culo.infoCustomer(chcu);
		print(grcustom);

		System.out.println("Список покупателей в алфавитном порядке: ");
		List<Customer> socustom = culo.sortCustome(chcu);
		print(socustom);

		System.out.println("Список покупателей у которых № кк находится в заданном интервале: ");
		List<Customer> chcustom = culo.choiceCustome(chcu, 125000, 150000);
		print(chcustom);

	}

	public static void print(List<Customer> grcustom) {

		for (Customer cu : grcustom) {

			System.out.println("ID: " + cu.getID());
			System.out.println("ФИО: " + cu.getSurname() + cu.getName());
			System.out.println("Адресс: " + cu.getAddress());
			System.out.println("№ кк: " + cu.getCreditCard());
			System.out.println("№бс: " + cu.getBankAccount());
			System.out.println();

		}

	}

}
