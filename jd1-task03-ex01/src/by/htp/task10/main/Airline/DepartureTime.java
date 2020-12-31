package by.htp.task10.main.Airline;

public class DepartureTime {

	private int hour;
	private int min;

	public DepartureTime(int hour, int min){
			
			this.hour = hour;
			this.min = min;
			
		}
	
	public void setHour(int hour) {

		this.hour = hour;

	}
	
	public void setMin(int min) {

		this.min = min;

	}
	
	public int getHour() {

		return hour;

	}
	
	public int getMin() {

		return min;

	}
	
	@Override
	public String toString() {

		return hour + ":" + min;

	}

}