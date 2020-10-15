public class Main {
  public static void main(String[] args) {
    // test your code here by creating a three different dogs from the Dog class. Be sure you give each dog different characteristics.

  Dog grimm = new Dog("Grimm", "Hound", 25, "gray", false);
  System.out.println(grimm.getName());

  Dog scooby = new Dog("Scooby", "Mut", 40, "brown", true);
  System.out.println(scooby.getName() + ", " + scooby.getBreed() + ", " + scooby.getWeight() + ", " + scooby.getColor() + ", " + scooby.houseTrained());

  Dog bob = new Dog("Bob", "Beagle", 15, "white", true);
  System.out.println(bob.getName());

  }
}