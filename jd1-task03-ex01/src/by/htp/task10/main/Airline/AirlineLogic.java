package by.htp.task10.main.Airline;

import java.util.ArrayList;
import java.util.List;

public class AirlineLogic {
	
	public List<Airline> infoAirline(ChartAirline chai) {

		List<Airline> inai = new ArrayList<Airline>();

		Airline[] ai = chai.getAirline();

		for (Airline a : ai) {

			inai.add(a);

		}

		return inai;

	}

	public static List<Airline> destinationAirline(ChartAirline chai, String d) {

		List<Airline> inai = new ArrayList<Airline>();
		
		for (Airline a : chai.getAirline()) {

			if (a.getDestination().compareTo(d) == 0) {

				inai.add(a);

			}

		}
		
		return inai;

	}

	public static List<Airline> daysOfTheWeekAirline(ChartAirline chai, String w) {

		List<Airline> inai = new ArrayList<Airline>();
		
		for (Airline a : chai.getAirline()) {

			if (a.getDaysOfTheWeek().compareTo(w) == 0) {

				inai.add(a);

			}

		}

		return inai;

	}
	
	public static List<Airline> departureTimeAirline(ChartAirline chai, String w, DepartureTime t) {

		List<Airline> inai = new ArrayList<Airline>();

		for (Airline a : chai.getAirline()) {

			if (a.getDaysOfTheWeek().compareTo(w) == 0) {
				
				if (a.getTime().getHour() >= t.getHour() & a.getTime().getMin() >= t.getMin()) {

				  inai.add(a);
				
				}

			}

		}

		return inai;

	}

}
