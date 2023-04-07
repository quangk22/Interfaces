package advance.dev;

import java.util.Scanner;

public class Rectangle extends Shape implements IShape{
	private double a;
	private double b;
	
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2 * (a + b);
	}
	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return a *b;
	}

	@Override
	public void input(Shape[] shapes) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("Nhập thông tin hình chữ nhật " + (i+1));
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			shapes[i] = new Rectangle(a, b);
		}
	}

	@Override
	public void print(Shape[] shapes) {
		// TODO Auto-generated method stub
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("Thông tin hình chữ nhật " + (i+1));
			System.out.println("Diện tích : " + shapes[i].dienTich());
			System.out.println("Chu vi : " + shapes[i].chuVi());
		}
	}

	@Override
	public String toString() {
		return "-Hình vuông [a=" + a + ", b=" + b + "]";
	}

}
