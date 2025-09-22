import java.util.ArrayList;

import shapes.Circle;
import shapes.GeometricObject;
import shapes.Rectangle;


public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<GeometricObject> shapes = new ArrayList<>();

        Circle c = new Circle(5.0);
        Rectangle r = new Rectangle(20.0, 12.0, "yellow", true);

        shapes.add(c);
        shapes.add(r);

        for(GeometricObject shape : shapes) {
            System.out.println(shape.toString());
        }

        System.out.println("--- info del circulo ----");
        System.out.printf("El area es %.2f\n",c.getArea());
        System.out.printf("El perimetro es %.2f\n", c.getPerimeter());
        System.out.printf("El diametro es %.2f\n",  c.getDiameter());

        System.out.println("--- info del rectangulo ----");
        System.out.printf("El area es %.2f \n", r.getArea());
        System.out.printf("El perimetro es %.2f \n", r.getPerimeter());

    }
}
