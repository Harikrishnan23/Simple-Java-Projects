public class Main {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(8);
        Floor floor = new Floor(12,22);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("The total cost is: "+calculator.getTotalCost());

    }
}
