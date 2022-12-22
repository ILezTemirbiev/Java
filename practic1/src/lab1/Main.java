package lab1;

import java.util.Scanner;

public class Main
{
    //public static void main(String[] args)
    //{
        /*-------------#3-------

		int[] mas = {1, 2, 3, 5, 6, 7, 11, 21, 22, 12};
		int sum = 0;
		int n = mas.length;

		for(int i = 0; i < mas.length; i++)
		{
		    sum += mas[i];
		}

		float average = sum / n;
		System.out.println(sum);
		System.out.println(average);
		*/


		/*-------------------------#4-------
		Scanner in = new Scanner(System.in);

		int mas[] = new int[10];
		int sum = 0;

		for (int i = 0; i < 10; i++)
		{
		    mas[i] = in.nextInt();
		}

		int i = 0;

		while (i < 10)
		{
		    sum += mas[i];
		    i++;
		}

		i = 0;
		int mx = 0;
		int mn = 99999;

		do
		{
		    if (mas[i] < mn)
		    {
		        mn = mas[i];
		    }

		    if (mas[i] > mx)
		    {
		        mx = mas[i];
		    }

		    i++;
		} while (i < 10);

		System.out.println(sum);
		System.out.println(mn);
		System.out.println(mx);
		*/



		/*------------------------#5----------
		for(int i = 0; i < args.length; i++)
	    {
	        System.out.println(args[i]);
	    }
	    */



	    /*----------------#6-------------
	    for(float i = 1; i < 11; i++)
	    {
	        System.out.printf("%.2f/n ", 1/i);
	    }
	    */



    //}

    public static int fact(int a)
    {
        int result = 1;

        for (int i = 1; i <= a; i++)
        {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(fact(n));
    }
}
