
package by.htp.task04.main;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Trainlogic tl = new Trainlogic();

		Traingroup tg = new Traingroup(5);

		Trainsort tr;

		Scantrain st = new Scantrain();

		tg.add(new Train(2, "Витебск", "10:25"));
		tg.add(new Train(5, "Могилев", "21:43"));
		tg.add(new Train(4, "Брест", "16:31"));
		tg.add(new Train(3, "Гомель", "3:19"));
		tg.add(new Train(1, "Гродно", "7:05"));

		List<Train> info;
		info = tl.information(tg);

		Collections.sort(info, new Trainsort());

		printInformation(info);

		int b = st.scanTrain();

		printTrain(info, b);

	}

	public static void printInformation(List<Train> info) {

		for (Train tr : info) {

			System.out.println(tr.getTrainNumbar() + ", " + tr.getNameStation() + ", " + tr.getStartTime());

		}

		System.out.println();

	}

	public static void printTrain(List<Train> info, int b) {

		for (Train tr : info) {

			if (b == tr.getTrainNumbar()) {

				System.out.println(tr.getTrainNumbar() + ", " + tr.getNameStation() + ", " + tr.getStartTime());

			}

		}

		System.out.println();

	}

}
