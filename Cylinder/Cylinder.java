public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public String toString() {
        return "Cylinder with radius " + radius + " and height " + height;
    }
}