package advance.dev;

import java.util.Scanner;

public class MianApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[10];
		intput(shapes);
		print(shapes);
		dienTichLonNhat(shapes);
		
	}

	private static void dienTichLonNhat(Shape[] shapes) {
		// TODO Auto-generated method stub
		 double maxArea = 0;
	        Shape maxAreaShape = null;
	        int n =0;

	        for (int i = 0; i < shapes.length; i++) {
	            double area = shapes[i].dienTich();
	            if (area > maxArea) {
	                maxArea = area;
	                maxAreaShape = shapes[i];
	                n=i;
	            }
	        }

	        System.out.println("Hình có diện tích lớn nhất:");
	        System.out.println(maxAreaShape.toString());
	        System.out.println("Diện tích : " + shapes[n].dienTich());
	    }
	

	private static void print(Shape[] shapes) {
		// TODO Auto-generated method stub
		  for (int i = 0; i < shapes.length; i++) {
	            System.out.println(shapes[i].toString());
	            System.out.println("Diện tích : " + shapes[i].dienTich());
	            System.out.println("Chu vi : " + shapes[i].chuVi());
	            System.out.println("  ");
	        }
	}

	private static void intput(Shape[] shapes) {
		// TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in);
        int nCircles = 3;
        int nRectangles = 3;
        int nTriangles = 4;

        // Nhập thông tin cho các hình tròn
        for (int i = 0; i < nCircles; i++) {
            System.out.println("Nhập hình tròn " + (i+1) + ":");
            double radius = scanner.nextDouble();
            shapes[i] = new Circle(radius);
        }

        // Nhập thông tin cho các hình chữ nhật
        for (int i = 0; i < nRectangles; i++) {
            System.out.println("Nhập 2 cạnh cho hình chữ nhật " + (i+1) + ":");
            double length = scanner.nextDouble();
            double width = scanner.nextDouble();
            shapes[i + nCircles] = new Rectangle(length, width);
        }

        // Nhập thông tin cho các hình tam giác
        for (int i = 0; i < nTriangles; i++) {
            System.out.println("Nhập 3 cạnh cho hình tam giác " + (i+1) + ":");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            shapes[i + nCircles + nRectangles] = new Triangle(a, b, c);
        }
    }
}
