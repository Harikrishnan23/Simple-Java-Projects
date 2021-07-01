public class findEvenNumber {
    public static void main(String[] args) {
        isEvenNumber(3);

        int number = 4;
        int finishNumber = 20;
        int count =0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even Number " +number);
            count++;
            if (count >= 5){
                System.out.println("Exiting Loop");
                break;
            }
            System.out.println("Total number of eve numbers found " +count);

        }


    }
    public static boolean isEvenNumber(int number) {
            if (number % 2 == 0) {
                return true;
            } else
                return false;
        }
    }
