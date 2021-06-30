public class primeNumberCalculation {
    public static void main(String[] args) {

            int count = 0;
            for (int i = 2; i < 20; i++){
                if(isPrime(i)){
                    count++;
                    System.out.println("Number " +i+ " is a Prime number");
                    if (count == 3){
                        System.out.println("Exiting");
                        break;
                    }
                }
            }
    }
    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i=2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
