package Marketing;

import java.util.Scanner;
import General.Employee;
public class Sales extends Employee{
    public Sales(int i, String n){
        super(i, n);
    }

    public double tallowance(double e){
        return 0.05 * e;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();
        Sales emp = new Sales(id, name);
        double te = emp.earnings(basic);
        System.out.println("ID of employee: " + emp.getEmpid());
        System.out.println("Total earning: " + te);
    }
}
