// Task 1
class MathOperation {
  int add(int a, int b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }

  int add(int a, int b, int c, int d) {
    return a + b + c + d;
  }
}

// Task 2
abstract class Shape {
  private double perimeter;
  private double area;

  public double getPerimeter() {
    return perimeter;
  }

  public void setPerimeter(double perimeter) {
    this.perimeter = perimeter;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  abstract double calculatePerimeter();
  abstract double calculateArea();
}

class Rectangle extends Shape {
  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  double calculateArea() {
    return this.width * this.height;
  }

  @Override
  double calculatePerimeter() {
    return this.width * 2 + this.height * 2;
  }
}

class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  double calculateArea() {
    return Math.PI * (this.radius * this.radius);
  }

  @Override
  double calculatePerimeter() {
    double d = this.radius * 2;
    return Math.PI * d;
  }
}

// Task 3
abstract class Animal {
  String name;
  String favoriteFood;

  abstract String manageSelf();
}

class Cat extends Animal {
  String name;
  String favoriteFood;

  Cat(String name, String favoriteFood) {
    this.name = name;
    this.favoriteFood = favoriteFood;
  }

  String manageSelf() {
    return "I am " + name + " and my favorite food is " + favoriteFood + "\n Meow.";
  }
}

class Dog extends Animal {
  String name;
  String favoriteFood;

  Dog(String name, String favoriteFood) {
    this.name = name;
    this.favoriteFood = favoriteFood;
  }

  String manageSelf() {
    return "I am " + name + " and my favorite food is " + favoriteFood + "\n Ruff.";
  }
}

class Main {
  public static void main(String[] args) {
    // Task 1
    MathOperation mo = new MathOperation();
    System.out.println(mo.add(2, 3));
    System.out.println(mo.add(2, 78, 60));
    System.out.println(mo.add(10, 5, 3, 10));
    System.out.println(mo.add(2, 3, 4, 5));

    System.out.println();

    // Task 2
    Rectangle rectangle = new Rectangle(15, 12);
    System.out.println("The rectangle's area is " + rectangle.calculateArea());
    System.out.println("The rectangle's perimeter is " + rectangle.calculatePerimeter());

    Circle circle = new Circle(30);
    System.out.println("The circle's area is " + circle.calculateArea());
    System.out.println("The circle's perimeter is " + circle.calculatePerimeter());

    System.out.println();

    // Task 3
    Dog dog = new Dog("Rocky", "Meat");
    System.out.println(dog.manageSelf());

    Cat cat = new Cat("Miki", "Whiskas");
    System.out.println(cat.manageSelf());
  }
}