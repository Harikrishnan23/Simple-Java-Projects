public class divisibleChallenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int dc = 1; dc <= 1000; dc++){
            if ((dc % 3 == 0) && (dc % 5 == 0)) {
                count++;
                sum = sum + dc;
                System.out.println("Numbers divisible by 3 and 5 are " + dc);
            }
                if (count == 5){
                    System.out.println("Exiting Loop");
                    break;
                }
        }
        System.out.println("Sum of the divisible numbers is: " +sum);
    }
}
