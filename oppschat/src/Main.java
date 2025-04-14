public class Main {
    public static void main(String[] args) {
        Circle r=new Circle(67.99);
        r.area();
        r.circumference();
        r.Compare();

    }
}

//Create a class called Rectangle with attributes length and width.
//
// Implement a method named calculateArea that calculates and returns the area of the
// rectangle. Write a simple program to demonstrate the usage of this class
// by creating an object, setting its attributes, and calling the calculateArea method.
class Rectangle{
    int length;
    int width;
    void calculateArea(){
        System.out.println("the area of rectangle is: " + length*width);

    }
    Rectangle(int l,int w){
        this.length=l;
        this.width=w;

    }
}
//Create a class called Circle with a radius attribute.
// Implement methods to calculate and return the area and circumference of the circle.
// Additionally, provide a static method to compare the areas of two circles.
// Write a program to demonstrate the usage of this class
// by creating two circle objects, setting their radii, and comparing their areas.
class  Circle {
    double radius;
    final double PI = 3.142;

    double area() {

        System.out.println("area is:  " + PI * radius * radius);

        return 0;
    }

    double circumference() {
        System.out.println("circumference is:  " + 2*PI * radius);
        return 0;
    }

    void Compare() {
        double a=area();
        double c= circumference();
        if(a>c){
            System.out.println("area is bigger");}
            else{
                System.out.println("circumference is bigger");
            }
        }




    Circle(double ra){
        this.radius=ra;

    }
}