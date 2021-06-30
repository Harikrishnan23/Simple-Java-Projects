public class switchCase {
    public static void main(String[] args) {
        char alphabetValue = 'F';
        switch (alphabetValue){
            case 'A':
                System.out.println("Value entered is A");
                break;

            case 'B':
                System.out.println("Value entered is B");
                break;

            case 'C':
                System.out.println("Value entered is C");
                break;

            case 'D':
                System.out.println("Value entered is D");
                break;

            case 'E':
                System.out.println("Value entered is E");
                break;

            default:
                System.out.println("Not any of the above alphabets");
                break;
        }
    }
}