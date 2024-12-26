package soal1;
import java.lang.Math;

public class Cylinder extends Shape{
    private double radius;
    private double height;
    public Cylinder(double r, double h){
        super("Cylinder");
        this.radius = r;
        this.height = h;
    }
    public double area(){
        return Math.PI * this.radius * this.radius * height; }
    public String toString(){
        return super.toString() + " of radius " + this.radius + " and height " + this.height; }
}