package lab3_3_1;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int menu = 1;

        do {

            System.out.println("Enter the number u want to complete: \n1.Internet Shop\n2.Employees Report\n0.Exit");
            menu = sc.nextInt();

            switch (menu)
            {
                case 1:
                    Online_Shop shop = new Online_Shop();
                    break;
                case 2:
                    EmployReport report = new EmployReport();
                    int menu1 = 1;

                    do {
                        System.out.println("1.Add new Employee\n2.Look at the report of the employees\n0.Back");
                        menu1 = sc.nextInt();

                        switch (menu1)
                        {
                            case 1 -> report.addEmployee();
                            case 2 -> EmployReport.Report.generateReport();
                        }

                    } while(menu1 != 0);

            }
        } while(menu != 0);
    }

}
