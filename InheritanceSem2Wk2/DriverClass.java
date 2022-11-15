public class DriverClass {
    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.area();
        
        Square square = new Square();
        square.area();
        square.area(2.3);

        Rectangle rect = new Rectangle();
        rect.area();
        rect.area(10.9, 12.0);

        Circle circle = new Circle();
        circle.area();
        circle.area(10.2);
    }
}
