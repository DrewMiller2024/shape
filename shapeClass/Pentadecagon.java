public class Pentadecagon implements Shape {
    private String color;
    private int sides;
    private int distanceSideCenterToShapeCenter;
    private int sideLength;
    public Pentadecagon(int theDistanceSideCenterToShapeCenter, int theSideLength, String theColor) {
        this.sides = 15;
        this.color = theColor;
        this.distanceSideCenterToShapeCenter = theDistanceSideCenterToShapeCenter;
        this.sideLength = theSideLength;
    }
    
    public double getArea() {
        return .5 * sideLength * distanceSideCenterToShapeCenter * 15;
    }
    
    public double getPerimeter() {
        return sideLength * sides;
    }
    
    public String getColor() {
        return this.color;
    }
}