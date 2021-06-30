public class printDayOfTheWeek {
    public static void main(String[] args) {
printDayOfTheWeek1(8);

    }
        private static void printDayOfTheWeek1(int day) {
            switch (day) {
                case 0:
                    System.out.println("Corresponding day of the week is Sunday");
                    break;

                case 1:
                    System.out.println("Corresponding day of the week is Monday");
                    break;

                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Corresponding day of the week is Tuesday, Wednesday, Thursday, Friday or Saturday");
                    break;

                default:
                    System.out.println("Invalid date");
                    break;
            }
            if (day == 0) {
                System.out.println("Day is Sunday");
            } else if (day == 1) {
                System.out.println("Day is Monday");
            } else if (day == 2) {
                System.out.println("Day is Tuesday");
            } else if (day == 3) {
                System.out.println("Day is Wednesday");
            } else if (day == 4){
                System.out.println("Day is Thursday");
            } else if (day == 5){
                System.out.println("Day is Friday");
            } else if (day == 6){
                System.out.println("Day is Saturday");
            } else
                System.out.println("Invalid Date entered");


        }



}
