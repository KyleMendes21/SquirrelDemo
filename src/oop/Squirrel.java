package oop;

public class Squirrel {

  // variables
  String name;
  String colour;
  String age;
  String weight;

  public Squirrel(String newName, String newColour, String newAge, String newWeight) {
    this.name = newName;
    this.colour = newColour;
    this.age = newAge;
    this.weight = newWeight;
  }

  public void performJob(String strJob) {
    System.out.println("Performing job: " + strJob);
  }

  public void run(){
    System.out.println(this.name + " is running from people!");
  }

  public void climb(String strClimb) {
    System.out.println(this.name + " is climbing a: " + strClimb);
  }

  public void nuts(String strNuts) {
    System.out.println(this.name + " has this amount of nuts: " + strNuts);
  }
 


}