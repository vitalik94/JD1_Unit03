package by.htp.task08.main.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {

	public List<Customer> infoCustomer(ChartCustomer chcu) {

		List<Customer> incu = new ArrayList<Customer>();

		Customer[] сustom = chcu.getCustomer();

		for (Customer cu : сustom) {

			incu.add(cu);

		}

		return incu;

	}

	public static List<Customer> sortCustome(ChartCustomer chcu) {

		Customer[] сustom = chcu.getCustomer();

		List<Customer> incu = new ArrayList<Customer>();

		for (int i = 0; i < сustom.length - 1; i++) {

			Customer maxCustomer = сustom[i];

			int maxi = i;

			for (int j = i + 1; j < сustom.length; j++) {

				if (custom[j].getName().compareTo(maxCustomer.getName()) < 0) {

					maxCustomer = custom[j];

					maxi = j;

				}

			}

			if (i != maxi) {

				Customer temp = сustom[i];

				сustom[i] = сustom[maxi];

				сustom[maxi] = temp;
			}

		}

		for (Customer cu : сustom) {

			incu.add(cu);

		}

		return incu;

	}

	public static List<Customer> choiceCustome(ChartCustomer chcu, int min, int max) {

		Customer[] сustom = chcu.getCustomer();

		List<Customer> incu = new ArrayList<Customer>();

		for (int i = 0; i < сustom.length; i++) {

			if ((сustom[i].getCreditCard() >= min) && (сustom[i].getCreditCard() >= min)) {

				incu.add(сustom[i]);

			}

		}

		return incu;

	}

}
