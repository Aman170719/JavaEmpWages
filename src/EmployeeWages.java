public class EmployeeWages {
    public static void main(String[] arg) {
        System.out.println("Welcome To The Emp Wages Calculator Stimulator To Check Salary");

        int Full_time=8;
        int Part_time=4;
        int Wages_pr_hr =20;
        int Present = 1;
        double value = Math.floor(Math.random() * 10) % 2;
        if (value == Present) {
            System.out.println("Employee is Present");
            System.out.println("Daily wages of an Employee is : " +Full_time * Wages_pr_hr);
        } else
            System.out.println("Employee is Absent");
    }
        }
