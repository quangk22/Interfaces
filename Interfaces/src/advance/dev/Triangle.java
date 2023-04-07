package advance.dev;

import java.util.Scanner;

public class Triangle extends Shape implements IShape{
	private double a,b,c;
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		double p = chuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	@Override
	public void input(Shape[] shapes) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("nhập Tam giác thứ " + (i+1));
			System.out.println("Nhập 3 cạnh:");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			shapes[i] = new Triangle(a, b, c);
		}
	}

	@Override
	public void print(Shape[] shapes) {
		// TODO Auto-generated method stub
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("Thông tin tam giác thứ " + (i+1));
			System.out.println("Diện tích : " + shapes[i].dienTich());
			System.out.println("Chu vi : " + shapes[i].chuVi());
		}
	}

	@Override
	public String toString() {
		return "-Hình tam giác [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
