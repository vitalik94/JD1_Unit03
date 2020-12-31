package by.htp.task04.main;

public class Traingroup {

	private Train[] trains;
	private int Grouptrain;

	public Traingroup(int number) {

		trains = new Train[number];
		Grouptrain = 0;

	}

	public boolean add(Train newTrain) {

		if (Grouptrain >= trains.length) {

			return false;

		}

		trains[Grouptrain] = newTrain;
		Grouptrain++;

		return true;

	}

	public void settrains(Train[] trains) {

		this.trains = trains;

	}

	public Train[] gettrains() {

		return trains;

	}

}
