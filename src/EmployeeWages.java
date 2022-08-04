import java.util.Scanner;

public class EmployeeWages {
    public static void main(String[] arg) {
        System.out.println("Welcome To The Emp Wages Calculator Stimulator To Check Salary");

        int Full_time = 8;
        int Wages_pr_hr = 20;
        int Days_in_month = 20;
        int Working_hrs= 100;

        for (int i = 1; i <= Days_in_month; i++) {
            int wages = (Wages_pr_hr * Full_time);
            System.out.println("day : " + i + " Salary is : " + wages);
        }
        for (int i = 1; i <= Working_hrs; i++) {
            int wages2 = (Working_hrs * Full_time);
            System.out.println("day : " + i + " Salary is : " + wages2);
        }
    }
}
