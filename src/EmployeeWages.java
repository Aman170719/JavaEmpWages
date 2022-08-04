import java.util.Scanner;

public class EmployeeWages {
    public static void main(String[] arg) {
        System.out.println("Welcome To The Emp Wages Calculator Stimulator To Check Salary");

        int Full_time = 8;
        int Part_time = 4;
        int Wages_pr_hr = 20;
        int Present = 1;
        int Days_in_month = 20;
        double value = Math.floor(Math.random() * 10) % 2;

        if (value == Present) {
            System.out.println("Employee is Present ");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the 1 for Full_time And 2 For Part_time");
            int i = scan.nextInt();
            scan.close();
            switch (i) {
                case 1:
                    System.out.println("Employee is Present Full Time");
                    System.out.println("Daily wages of an Employee is : " + Full_time * Wages_pr_hr);
                    System.out.println("Monthly wages of an Employee is : " + (Full_time * Wages_pr_hr)* Days_in_month);
                    break;
                case 2:
                    System.out.println("Employee is Present Part Time");
                    System.out.println("Daily wages of an Employee for Part Time is : " + Part_time * Wages_pr_hr);
                    System.out.println("Monthly wages of an Employee for Part Time is : " + (Part_time * Wages_pr_hr)* Days_in_month);
                    break;
                default:
                    System.out.println("You Have Entered Wrong Number ");
                       }
                                 }

                else {
            System.out.println("Employee is Absent");
        }
    }
}



