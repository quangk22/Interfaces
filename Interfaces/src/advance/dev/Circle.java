package advance.dev;

import java.util.Iterator;
import java.util.Scanner;

public class Circle extends Shape implements IShape {
	private double r;

	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * r;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}

	@Override
	public void input(Shape[] shapes) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("Nhập thông tin hình tròn " + (i + 1));
			System.out.println("Nhập r :");
			double r = sc.nextDouble();
			shapes[i] = new Circle(r);
		}
	}

	@Override
	public void print(Shape[] shapes) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nCircles = 3;
		int nRectangles = 3;
		int nTriangles = 4;
		// Nhập thông tin cho các hình tròn
		for (int i = 0; i < nCircles; i++) {
			System.out.println("Enter radius of circle " + (i + 1) + ":");
			double radius = sc.nextDouble();
			shapes[i] = new Circle(radius);
		}

		// Nhập thông tin cho các hình chữ nhật
		for (int i = 0; i < nRectangles; i++) {
			System.out.println("Enter length and width of rectangle " + (i + 1) + ":");
			double length = sc.nextDouble();
			double width = sc.nextDouble();
			shapes[i + nCircles] = new Rectangle(length, width);
		}

		// Nhập thông tin cho các hình tam giác
		for (int i = 0; i < nTriangles; i++) {
			System.out.println("Enter 3 sides of triangle " + (i + 1) + ":");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			shapes[i + nCircles + nRectangles] = new Triangle(a, b, c);
		}
	}

	@Override
	public String toString() {
		return "-Hình tròn [r=" + r + "]";
	}
	

}
