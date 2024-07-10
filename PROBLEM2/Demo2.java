public class Demo2 {
    public static void main(String[] args) {
        Shape s = new Shape("Red", true);
        System.out.println(s);

        Circle c = new Circle(5.0);
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());

        Circle c1 = new Circle(5.0, "blue", true);
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        Rectangle r = new Rectangle(2.0, 3.0);
        System.out.println(r);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

        Rectangle r1 = new Rectangle(2.0, 3.0, "green", false);
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        Square sq = new Square(4.0);
        System.out.println(sq);
        System.out.println("Area: " + sq.getArea());
        System.out.println("Perimeter: " + sq.getPerimeter());

        Square sq1 = new Square(4.0, "yellow", true);
        System.out.println(sq1);
        System.out.println("Area: " + sq1.getArea());
        System.out.println("Perimeter: " + sq1.getPerimeter());
    }
}
