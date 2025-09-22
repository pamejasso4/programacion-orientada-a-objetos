package shapes;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() { 
        super();
        radius = 0.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (Math.pow(this.radius, 2));
    }

    public double getPerimeter() {
        double diameter = this.getDiameter();
        return diameter * Math.PI;
    }

    public double getDiameter() { 
        double diameter = this.radius * 2;
        return diameter;
    }

    public void printCircle() {
        System.out.println(super.toString());
        System.out.printf("Radio: %d \t Area: %d \t Perimetro: %d \t Diametro: %d", this.radius, this.getArea(), this.getPerimeter(), this.getDiameter());
    }

}
