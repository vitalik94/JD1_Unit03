package by.htp.task01.main.Test1;

/* 
 * 1.Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения
 * этих переменных. Добавьте метод, который находит сумму значений этих переменных, и метод,
 * который находит наибольшее значение из этих двух переменных.  
 */

public class Test1 {
	
	private int var1;
	private int var2;

	
	public Test1(int var1 , int var2) {
		
		this.var1 = var1;
		this.var2 = var2;
		
	}
	
	public void setvar1(int var1) {
		
		this.var1 = var1;
		
	}
	

	
	public void setvar2(int var2) {
		
		this.var2 = var2;
		
	}
	
	
	
	public void print() {
		
		System.out.println("var1 = " + var1 + ", " + "var2 = " + var2);
		System.out.println();
	}
	
	public void change() {
		var1 = var1 + 1;
		var2 = var2 + 1;
		System.out.println(var1 + ", " + var2);	
		System.out.println();
	}
	
	public void sum() {
		int sum;
		sum = var1 + var2;
		System.out.println("sum = " + sum);
		System.out.println();
	}
	
	public void max() {
		
		if(var1>var2) {
			
			System.out.println("var1 наибольшее значение");
			
		}else {
			System.out.println("var2 наибольшее значение");
		}
		
	}


}
