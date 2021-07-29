public class Main {
    public static void main(String[] args) {
        Wall areaCalculation = new Wall(8,8);
        System.out.println("The area is: " + areaCalculation.getArea());

        areaCalculation.setWidth(19);
        areaCalculation.getWidth();
        System.out.println("The width now is: "+areaCalculation.getWidth());
        areaCalculation.setHeight(22);
        areaCalculation.getHeight();
        System.out.println("The Height now is: "+areaCalculation.getHeight());
        Wall newAreaValue = new Wall(areaCalculation.getHeight(), areaCalculation.getWidth());
        System.out.println("The new area Value is: "+newAreaValue.getArea());
    }
}
