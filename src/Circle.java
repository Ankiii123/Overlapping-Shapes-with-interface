public class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    void draw() {
        double area = 3.14 * radius * radius;
        System.out.println(area);
    }
}
