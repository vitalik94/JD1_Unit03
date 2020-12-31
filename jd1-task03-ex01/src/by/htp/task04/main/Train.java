package by.htp.task04.main;

/*4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, 
 * время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте возможность 
 * сортировки элементов массива по номерам поездов. Добавьте возможность вывода 
 * информации о поезде, номер которого введен пользователем. Добавьте возможность сортировки 
 * массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть 
 * упорядочены по времени отправления.
 */

public class Train {

	private int trainnumbar;
	private String namestation;
	private String starttime;

	public Train() {

	}

	public Train(int trainnumbar, String namestation, String starttime) {

		this.trainnumbar = trainnumbar;
		this.namestation = namestation;
		this.starttime = starttime;

	}

	public void setTrainNumbar(int trainnumbar) {

		this.trainnumbar = trainnumbar;

	}

	public void setNameStation(String namestation) {

		this.namestation = namestation;

	}

	public void setStartTime(String starttime) {

		this.starttime = starttime;

	}

	public int getTrainNumbar() {

		return trainnumbar;

	}

	public String getNameStation() {

		return namestation;

	}

	public String getStartTime() {

		return starttime;

	}

}
