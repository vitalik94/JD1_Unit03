package by.htp.task10.main.Airline;

/*
 * Создать класс Airline, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами 
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль. 
 * 
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Airline {

	private String destination;
	private int flightNumber;
	private String aircraftType;
	private DepartureTime time;
	private String daysOfTheWeek;

	public Airline(String destination, int flightNumber, String aircraftType, DepartureTime time, String daysOfTheWeek) {

		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.time = time;
		this.daysOfTheWeek = daysOfTheWeek;

	}

	public void setDestination(String destination) {

		this.destination = destination;

	}

	public void setFlightNumber(int flightNumber) {

		this.flightNumber = flightNumber;

	}

	public void setAircraftType(String aircraftType) {

		this.aircraftType = aircraftType;

	}

	public void setTime(DepartureTime time) {

		this.time = time;

	}

	public void setDaysOfTheWeek(String daysOfTheWeek) {

		this.daysOfTheWeek = daysOfTheWeek;

	}

	public String getDestination() {

		return destination;

	}

	public int getFlightNumber() {

		return flightNumber;

	}

	public String getAircraftType() {

		return aircraftType;

	}

	public DepartureTime getTime() {

		return time;

	}

	public String getDaysOfTheWeek() {

		return daysOfTheWeek;

	}

	@Override
	public String toString() {

		return "destination" + destination + ",flightNumber" + flightNumber + ", aircraftType" + aircraftType
				+ ", departureTime" + time + ", daysOfTheWeek" + daysOfTheWeek;

	}

}
