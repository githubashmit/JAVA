import java.awt.*;

class cylinder{
    private int radius;
    private int height;
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2*3.14*radius *radius + 2*3.14*radius*height;
    }
    public double volume(){
        return 3.142*radius *radius *height;
    }

}
class Rectange{
    private int length;
    private int breadth;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public Rectange(){
        this.length = 4;
        this.breadth = 5;
    }

}
public class T18_practiceSet {
    public static void main(String[] args) {
        //Problem 1
//        cylinder myCylinder = new cylinder();
//        myCylinder.setHeight(12);
//        int h = myCylinder.getHeight();
//        System.out.println(h);
//        myCylinder.setRadius(9);
//        System.out.println(myCylinder.getRadius());
//        System.out.println(myCylinder.surfaceArea());
//        System.out.println(myCylinder.volume());
          Rectangle r = new Rectangle();
        System.out.println(r.getlength());
        System.out.println(r.getbreadth());
    }
}
