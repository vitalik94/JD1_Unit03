package by.htp.task05.main.Counter;

/*
 * 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать 
 * свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика 
 * значениями по умолчанию и произвольными значениями. Счетчик имеет методы 
 * увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. 
 * Написать код, демонстрирующий все возможности класса.
 */

public class Counter {
	
	private int currentvalue;
	private int maxvalue;
	private int minvalue;
	
	public Counter() {
		
		this.currentvalue = 1;
		this.minvalue = 0;
		this.maxvalue = 10;
		
	}
	
	public Counter(int currentvalue, int maxvalue, int minvalue) {
		
		this.currentvalue = currentvalue;
		this.maxvalue = maxvalue;
		this.minvalue = minvalue;
		
	}
	
	public void setCurrentValue(int currentvalue) {
		
		this.currentvalue = currentvalue;
		
	}
	
	public void setMaxValue(int maxvalue) {
		
		this.maxvalue = maxvalue;
		
	}
	
	public void setMinValue(int minvalue) {
		
		this.minvalue = minvalue;
		
		
	}
	
	public int getCurrentValue() {
		
		return currentvalue;
		
	}
	
	public int getMaxValue() {
		
		return maxvalue;
		
	}
	
	public int getMinValue() {
		
		return minvalue;
		
	}
	
}
