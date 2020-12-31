package by.htp.task07.main.Triangle;

/*
 * 7.Описать класс, представляющий треугольник. 
 * Предусмотреть методы для создания объектов, 
 * вычисления площади, периметра и точки пересечения медиан.
 */

public class Triangle {

	private int a;
	private int b;
	private int c;

	public Triangle(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;

	}

	public void setA(int a) {

		this.a = a;

	}

	public void setB(int b) {

		this.b = b;

	}

	public void setC(int c) {

		this.c = c;

	}

	public int getA() {

		return a;

	}

	public int getB() {

		return b;

	}

	public int getC() {

		return c;

	}

}
