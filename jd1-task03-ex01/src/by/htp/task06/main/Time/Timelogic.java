package by.htp.task06.main.Time;

public class Timelogic {

	public void instalHour(Time t) {

		int h = t.getHour();

		if (h >= 0 & h < 24) {

			t.getHour();

		} else {

			t.setHour(0);

		}

	}

	public void instalMinute(Time t) {

		int m = t.getMinute();

		if (m >= 0 & m < 60) {

			t.getMinute();

		} else {

			t.setMinute(0);

		}

	}

	public void instalSecond(Time t) {

		int s = t.getSecond();

		if (s >= 0 & s < 60) {

			t.getSecond();

		} else {

			t.setSecond(0);

		}

	}

	public void changTime(Time t, int s, int m, int h) {

		int i = 0;

		s = t.getSecond() + s;

		if (s >= 60) {

			while (s >= 60) {

				s = s - 60;

				i++;

			}

		}

		t.setSecond(s);

		m = t.getMinute() + m + i;

		i = 0;

		if (m >= 60) {

			while (m >= 60) {

				m = m - 60;

				i++;

			}

		}

		t.setMinute(m);

		h = t.getHour() + h + i;

		if (h >= 24) {

			while (h >= 24) {

				h = h - 24;

			}

		}

		t.setHour(h);

	}

}
