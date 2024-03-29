public class Dog {
  String breed;
  boolean hasOwner;
  int age;
  String color;
  
  public Dog(String dogBreed, boolean dogOwned, int dogYears, String dogColor) {
    System.out.println("Constructor invoked!");
    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
    color = dogColor;
  }
  
  public static void main(String[] args) {
    System.out.println("Main method started");
    Dog fido = new Dog("poodle", false, 4, "black");
    Dog nunzio = new Dog("shiba inu", true, 12, "white");
    boolean isFidoOlder = fido.age > nunzio.age;
    int totalDogYears = nunzio.age + fido.age;
    System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
    System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    System.out.println("The color of fido is: " +fido.color + " and color of nunzio is: "+nunzio.color );
    System.out.println("Main method finished");
  }
}
