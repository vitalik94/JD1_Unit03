package by.htp.task05.main.Counter;

public class Main {
	
	public static void main(String[] args) {	
		
		Counter co = new Counter(1,0,10);
		
		//co.setMinValue(0);
		//co.setMaxValue(10);
		//co.setCurrentValue(1);
		
		CounterLogic cl = new CounterLogic();
		
		System.out.println(co.getCurrentValue());
		
		int a = cl.creaseCurrentValue();
		
		
		
		System.out.println(a);
		
		
		
	}

}
