package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] agrs) {
    hello ("world");
    hello("user");
    hello("Nat");

    double l = 5;
    System.out.println("Area of a square with a side " + l + " = " + area (l));

    double a = 4;
    double b = 6;
    System.out.println("Area of a rectangle with sides " + a + " and " + b + " = " +area (a, b) );

  }

  public static void hello (String somebody) {
        System.out.println("Hello, " + somebody + "!");
  }

  public static double area (double len){
    return len * len;
  }

  public static double area (double a, double b) {
    return a * b;
  }


}