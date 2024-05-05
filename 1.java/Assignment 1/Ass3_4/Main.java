/*4. Create a Shape class as the abstract class with abstract method draw( ), its
implementation is provided by the Rectangle &amp; Circle classes. Create a reference of
Shape class and if you create the instance of Rectangle class, draw() method of
Rectangle class will be invoked. And same for Circle class. (Dynamic Method
Dispatch)*/
abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Main {
    public static void main(String[] args) {
        Shape obj = new Circle();
        obj.draw();
        obj = new Rectangle();
        obj.draw();
    }
}