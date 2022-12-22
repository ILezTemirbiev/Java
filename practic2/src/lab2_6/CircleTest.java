package lab2_6;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        double R, x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("X, Y, R for Circle №1");

        x = scanner.nextDouble();
        y = scanner.nextDouble();
        R = scanner.nextDouble();

        System.out.println("X, Y, R for Circle №2");

        Circle circle1 = new Circle(x, y, R);

        x = scanner.nextDouble();
        y = scanner.nextDouble();
        R = scanner.nextDouble();

        Circle circle2 = new Circle(x, y, R);

        if(circle1.Comparison(circle2)) System.out.println("First circle is bigger");

        else System.out.println("Second circle is bigger");

        System.out.println("Circle №1: S = " + circle1.getSquare() + ", P = " + circle1.getLength());
        System.out.println("Circle №2: S = " + circle2.getSquare() + ", P = " + circle2.getLength());
    }
}
