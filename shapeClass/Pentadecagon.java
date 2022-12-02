public class Pentadecagon implements Shape {
    private String color;
    private int sides;
    private int apothem;
    private int sideLength;
    public Pentadecagon(int theSideLength, String theColor) {
        this.sides = 15;
        this.color = theColor;
        this.sideLength = theSideLength;
    }
    
    public double getArea() {
        return .5 * sideLength *  * sides;
    }
    
    public double getPerimeter() {
        return sideLength * sides;
    }
    
    public String getColor() {
        return this.color;
    }
}