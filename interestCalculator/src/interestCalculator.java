public class interestCalculator {
    public static void main(String[] args) {
        //for interest rates from 2 through to 8
        for (int ir = 2; ir < 9; ir++){
            System.out.println("10,000 at " +ir+ " interest is " +String.format("%.2f",calculateInterest(10000.0, ir)));
        }
        //working backwards from 8 through to 2
        for (int ir = 8; ir > 1; ir--){
            System.out.println("10,000 at " +ir+ " interest is " +String.format("%.2f",calculateInterest(10000.0, ir)));
        }
    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
