package General;

public class Employee {
    protected int empid;
    private String ename;

    public Employee(int i, String n){
        empid = i;
        ename = n;
    }

    public double earnings (double basic){
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    public int getEmpid() {
        return empid;
    }
}
