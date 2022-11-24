import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

abstract class Shape{
    private String color;
    private boolean filled;

    public Shape() {
        this("red", true);
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}

class Circle extends Shape{
    private double radius;

    Circle(){
        //super();
        radius = 10;
    }

    Circle(double radius){
        //super();
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString(){
        String s = "";
        s += "C(0, " + radius + ")\n";
        return s;
    }
}

class Rectangle extends Shape{
    private double width;
    private double length;

    Rectangle(){
        width = 10;
        length = 10;
    }

    Rectangle(double width, double length){
        //super();
        this.length = length;
        this.width = width;
    }

    Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }

    public String toString(){
        String s = "";
        s += "Dreptunghiul cu laturile " + width + " si " + length +"\n";
        return s;
    }
}

class Square extends Rectangle{

    Square(){
        super();
    }
    Square(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    Square(double side, String color, boolean filled){
        this(side);
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }

    public String toString(){
        String s = "";
        s += "Patrat cu latura de: " + this.getSide() + "\n";
        return s;
    }
}



public class Problema_1 {
    public static void main(String[] args){
        boolean ok = true;
        //Verificarea relatiilor de mostenire
        Shape obj1;
        obj1 = new Square();
        obj1 = new Rectangle();
        obj1 = new Circle();
        Rectangle obj3 = new Square();
        //Verificarea constructorilor
        Constructor[] allConstructors = Square.class.getDeclaredConstructors();
        if(allConstructors.length != 3) {
            System.out.println("Clasa Square NU are definiti toti constructorii!");
            ok = false;
        }
        Circle circle = new Circle(2.0, "green", true);
        Square square = new Square(5.0, "black", true);
        if(!Modifier.isAbstract(Shape.class.getModifiers())) {
            System.out.println("Clasa Shape NU este abstracta!");
            ok = false;
        }
        if(!Shape.class.isAssignableFrom(Square.class) && !Rectangle.class.isAssignableFrom(Square.class)) {
            System.out.println("Clasele NU respecta relatia de mostenire descrisa!");
            ok = false;
        }
        if(!circle.isFilled() || !circle.getColor().equals("green")) {
            System.out.println("Constructorul din clasa Circle NU este definit conform specificatiilor!");
            ok = false;
        } else if(!square.isFilled() || !square.getColor().equals("black") || square.getWidth() != square.getLength()) {
            System.out.println("Constructorul din clasa Square NU este definit conform specificatiilor!");
            ok = false;
        } else if(ok){
            System.out.println("Au trecut toate testele!");
        }
    }
}
