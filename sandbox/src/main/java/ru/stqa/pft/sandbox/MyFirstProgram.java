package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] agrs) {
    hello("world");
    hello("user");
    hello("Nat");

    Square s = new Square(5);
    System.out.println("Area of a square with a side " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Area of a rectangle with sides " + r.a + " and " + r.b + " = " + r.area());

    double x1 = 2;
    double x2 = 9;
    double y1 = 2;
    double y2 = 7;
    System.out.println("Distance between the dots = " + distance(x1, x2, y1, y2));

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");

  }

  public static double distance (double x1, double x2, double y1, double y2){
    return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
  }

}