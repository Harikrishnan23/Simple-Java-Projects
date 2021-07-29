public class Main {
    public static void main(String[] args) {
        Point firstPoint = new Point(8,4);
        Point secondPoint = new Point(3,7);

        System.out.println("Distance(0,0) is: " +firstPoint.distance());
        System.out.println("Distance(second) is: " +secondPoint.distance(secondPoint));
        System.out.println("Distance(2,2) is: " +firstPoint.distance(2,2));

        Point point = new Point();
        System.out.println("distance() is: "+point.distance());


    }
}
