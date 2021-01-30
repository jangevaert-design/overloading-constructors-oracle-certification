package edu.cnm.deepdive;



  class Dog {
    private String name;
    private String breed;
    private double weight;

    public Dog(String name) {
      this.name = name;
      breed = "husky";
      weight = 30.0;
    }

    public Dog(String name, String breed) {
//      this.name = name;
//      this.breed = breed;
//      weight = 50.0;
      this(name, breed, 30.0);// is called constructor chaining and calls the 3rd constructor.
    }

    public Dog(String name, String breed, double weight) {
      this.name = name;
      this.breed = breed;
      this.weight = weight;
    }

    public void print() {
      System.out.println(name + " " + breed + " " + weight);
    }
  }
public class OverloadingConstructors {
  public static void main(String[] args) {
    Dog dog1 = new Dog("Jimmy");
    dog1.print();

    Dog dog2 = new Dog("Anthony", "Shepherd");
    System.out.println();
    dog2.print();

    Dog dog3 = new Dog("Rex", "German shepherd", 40);
    System.out.println();
    dog3.print();

  }

}
