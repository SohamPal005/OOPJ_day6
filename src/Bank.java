public class Bank {
    double balance = 10000.00;

    static class InterestCalculator{
        static double calc(double p, double r, double t){
            return (p * r * t) / 100;
        }

        void show(){
            // This line will show error because accessing non static member
           // System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args){
        double interest = InterestCalculator.calc(10000, 5, 2);
        System.out.println("Simple interest: " + interest);
    }
}