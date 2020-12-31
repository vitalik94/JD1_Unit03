package by.htp.task07.main.Triangle;

public class Triangleligic {

	public boolean correctTriangle(Triangle tr) {

		boolean a;

		if ((tr.getA() + tr.getB() > tr.getC()) & (tr.getA() + tr.getC() > tr.getB())
				& (tr.getC() + tr.getB() > tr.getA())) {

			a = true;

		} else {

			a = false;

		}

		return a;

	}

	public int Perimeter(Triangle tr) {

		int p;

		p = tr.getA() + tr.getB() + tr.getC();

		return p;

	}

	public double Square(Triangle tr) {

		double p;

		double S;

		p = (tr.getA() + tr.getB() + tr.getC()) / 2;

		S = Math.sqrt(p * (p - tr.getA()) * (p - tr.getB()) * (p - tr.getC()));

		return S;

	}

}
