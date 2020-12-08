package oop;

import oop.Squirrel;

public class SquirrelGame {

  public static void main(String[] args) {
    Squirrel squirrel1;
    Squirrel squirrel2;
    Squirrel squirrel3;
    Squirrel squirrel4;

    // create squirrels
    squirrel1 = new Squirrel("Rob", "Hazel", "10 years", "700 grams");
    squirrel2 = new Squirrel("Steven", "Brown", "5 years", "500 grams");
    squirrel3 = new Squirrel("Luke", "Grey", "7 years", "800 grams");
    squirrel4 = new Squirrel("Bob", "Black", "9.5 years", "725 grams");

    // do stuff
    squirrel1.run();
    squirrel2.run();
    squirrel3.run();
    squirrel4.run();

    // job
    squirrel1.performJob("looking for nuts");
    squirrel2.performJob("storing nuts");
    squirrel3.performJob("eating nuts");
    squirrel4.climb("tree");

    // how many nuts
    squirrel1.nuts("200");
    squirrel1.nuts("100");
    squirrel1.nuts("50");
    squirrel1.nuts("250");


  }
}