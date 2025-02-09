public class MultiCylinder {
    public static void main(String[] args) {

        Cylinder cylinder1 = new Cylinder(3.0, 5.0);
        Cylinder cylinder2 = new Cylinder(4.0, 6.0);
        Cylinder cylinder3 = new Cylinder(2.5, 7.5);

        printCylinderInfo(cylinder1);
        printCylinderInfo(cylinder2);
        printCylinderInfo(cylinder3);

        cylinder1.setRadius(5.0);
        cylinder1.setHeight(10.0);

        System.out.println("Updated " + cylinder1.toString());
        System.out.printf("Volume: %.2f\n", cylinder1.getVolume());
        System.out.printf("Surface Area: %.2f\n", cylinder1.getSurfaceArea());
    }
    private static void printCylinderInfo(Cylinder cylinder) {
        System.out.println(cylinder.toString());
        System.out.printf("Volume: %.2f\n", cylinder.getVolume());
        System.out.printf("Surface Area: %.2f\n", cylinder.getSurfaceArea());
    }
}