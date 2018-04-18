public class Circle implements Shape {
    private double radius;

    @Override
    public double getArea() {
        return (radius * radius * Math.PI);
    }
}