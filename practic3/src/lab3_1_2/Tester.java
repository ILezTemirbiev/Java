package lab3_1_2;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Tester
{
    public static void main(String[] args)
    {
        int length;
        Random rand = new Random();

        System.out.println("Enter the number of circles: ");

        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();

        Circle[] mas = new Circle[length];

        for(int i = 0; i < length; i++)
        {

            int R = rand.nextInt(1000);

            int x = rand.nextInt(1000);

            int y = rand.nextInt(1000);

            mas[i] = new Circle();
            mas[i].setR(R);
            mas[i].setXY(x, y);

        }
        for(int i = 0; i < length; i++)
        {
            System.out.println("x = " + mas[i].getX() + ", y = " + mas[i].getY() + ", R = " + mas[i].getR());
        }

        System.out.println("Max circle:");

        int mx = 0;

        for(int i = 0; i < length; i++)
        {
            mx = Math.max(mas[i].getR(), mx);
        }

        System.out.println(mx);

        System.out.println("Min circle:");

        int mn = 1000000;

        for(int i = 0; i < length; i++)
        {
            mn = Math.min(mas[i].getR(), mn);
        }

        System.out.println(mn);

        System.out.println("Array after sort:");

        Circle t = new Circle();

        for(int i = 0; i < length; i++)
        {
            for(int j = i; j < length - 1; j++)
            {
                if(mas[j].getR() > mas[i].getR())
                {
                    t = mas[i];
                    mas[i] = mas[j];
                    mas[j] = t;
                }
            }
        }

        for(int i = 0; i < length; i++)
        {
            System.out.println("x = " + mas[i].getX() + ", y = " + mas[i].getY() + ", R = " + mas[i].getR());
        }
    }
}
