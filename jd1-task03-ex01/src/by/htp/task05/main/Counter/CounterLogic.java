package by.htp.task05.main.Counter;

public class CounterLogic {

	Counter co = new Counter();

	Scancounter scou = new Scancounter();

	public int creaseCurrentValue() {
		
		int value = co.getCurrentValue();
		
		String input = scou.scanCrease();
		
		//while(!(input.equals("0"))){

		if (input.equals("+")) {

			if (value <= co.getMaxValue()) {

				value++;

			} else if (value > co.getMaxValue()) {

				value = co.getMinValue();

			}

		}

		if (input.equals("-")) {

			if (value >= co.getMinValue()) {

				value--;

			} else if (value < co.getMinValue()) {

				value = co.getMaxValue();

			}

		}

		return value;
		
		//}

	}

}
