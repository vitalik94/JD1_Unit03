package by.htp.task04.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trainlogic {

	public List<Train> information(Traingroup trgr) {

		Trainsort ts = new Trainsort();

		List<Train> info = new ArrayList<Train>();

		Train[] trains = trgr.gettrains();

		for (Train tr : trains) {

			info.add(tr);

		}

		return info;

	}

}
