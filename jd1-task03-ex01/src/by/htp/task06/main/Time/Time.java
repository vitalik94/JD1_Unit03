package by.htp.task06.main.Time;

/*
 * 6.Составьте описание класса для представления времени. Предусмотрите возможности установки 
 * времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости 
 * вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0. 
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time() {

	}

	public Time(int hour, int minute, int second) {

		this.hour = hour;
		this.minute = minute;
		this.second = second;

	}

	public void setHour(int hour) {

		this.hour = hour;

	}

	public void setMinute(int minute) {

		this.minute = minute;

	}

	public void setSecond(int second) {

		this.second = second;

	}

	public int getHour() {

		return hour;

	}

	public int getMinute() {

		return minute;

	}

	public int getSecond() {

		return second;

	}

}
