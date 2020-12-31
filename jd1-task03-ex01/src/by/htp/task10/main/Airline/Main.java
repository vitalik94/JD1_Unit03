package by.htp.task10.main.Airline;

import java.util.List;

import by.htp.task09.main.Book.Book;

public class Main {
	
	public static void main(String[] args) {
		
		ChartAirline ca = new ChartAirline(10);
		
		AirlineLogic al = new AirlineLogic();
		
		ca.add(new Airline("Лондон",110,"Боинг 727",(new DepartureTime(12,34)),"Вторник"));
		ca.add(new Airline("Берлин",168,"Аэробус А310",(new DepartureTime(19,27)),"Пятница"));
		ca.add(new Airline("Париж",123,"Аэробус А320",(new DepartureTime(1,35)),"Среда"));
		ca.add(new Airline("Рим",193,"Боинг 727",(new DepartureTime(22,47)),"Четверг"));
		ca.add(new Airline("Лондон",124,"Боинг 737",(new DepartureTime(16,57)),"Воскресенье"));
		ca.add(new Airline("Прага",186,"Аэробус А330",(new DepartureTime(4,15)),"Вторник"));
		ca.add(new Airline("Лондон",102,"Аэробус А340",(new DepartureTime(11,24)),"Четверг"));
		ca.add(new Airline("Лисабон",152,"Аэробус А350",(new DepartureTime(14,05)),"Понедельник"));
		ca.add(new Airline("Нью-Йорк",147,"Боинг 747",(new DepartureTime(20,27)),"Вторник"));
		ca.add(new Airline("Лондон",131,"Боинг 757",(new DepartureTime(9,52)),"Суббота"));
		
		System.out.println("Список рейсов: ");
		List<Airline> inai = al.infoAirline(ca);
		print(inai);
		
		System.out.println("Список рейсов для заданного пункта назначения: ");
		List<Airline> destai = al.destinationAirline(ca, "Лондон");
		print(destai);
		
		System.out.println("список рейсов для заданного дня недели: ");
		List<Airline> dotwai = al.daysOfTheWeekAirline(ca, "Вторник");
		print(dotwai);
		
		System.out.println("список рейсов для заданного дня недели, время вылета для которых больше заданного: ");
		List<Airline> detiai = al.departureTimeAirline(ca, "Вторник", new DepartureTime(12,00));
		print(detiai);
		
	}
	
	public static void print(List<Airline> inai) {
		
		for(Airline a : inai) {
			
			System.out.println("Пункт назначения: " + a.getDestination());
			System.out.println("Номер рейса: " + a.getFlightNumber());
			System.out.println("Тип самолета: " + a.getAircraftType());
			System.out.println("Время вылета: " + a.getTime());
			System.out.println("Дни недели: " + a.getDaysOfTheWeek());
			System.out.println();

		}
		
	}

}
