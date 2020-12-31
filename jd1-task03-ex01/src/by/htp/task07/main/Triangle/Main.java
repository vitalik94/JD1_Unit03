package by.htp.task07.main.Triangle;

public class Main {

	public static void main(String[] args) {

		Triangle tr = new Triangle(20, 30, 40);

		Triangleligic trl = new Triangleligic();

		if (trl.correctTriangle(tr) == true) {

			System.out.println("Стороны треугольника: " + tr.getA() + "," + tr.getB() + "," + tr.getC());

			System.out.println("Периметр треугольника: " + trl.Perimeter(tr));

			System.out.println("Площадь треугольника: " + trl.Square(tr));

		} else {

			System.out.println("Введено неверное значение");

		}

	}

}
