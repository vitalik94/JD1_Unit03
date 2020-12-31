package by.htp.task06.main.Time;

public class Main {

	public static void main(String[] args) {

		Time ti = new Time(1, 2, 3);

		Timelogic tl = new Timelogic();

		tl.instalHour(ti);
		tl.instalMinute(ti);
		tl.instalSecond(ti);

		System.out.println(ti.getHour() + ":" + ti.getMinute() + ":" + ti.getSecond());

		tl.changTime(ti, 1, 1, 1);

		System.out.println(ti.getHour() + ":" + ti.getMinute() + ":" + ti.getSecond());

	}

}
