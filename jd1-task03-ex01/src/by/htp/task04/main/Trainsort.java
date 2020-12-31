package by.htp.task04.main;

import java.util.Comparator;

public class Trainsort implements Comparator<Train> {

	@Override
	public int compare(Train t1, Train t2) {

		int a = t1.getTrainNumbar() - t2.getTrainNumbar();

		if (a == 0) {

			a = t1.getNameStation().compareTo(t2.getNameStation());

			if (a == 0) {

				a = t1.getStartTime().compareTo(t2.getStartTime());

			}

		}

		return a;

	}

}
