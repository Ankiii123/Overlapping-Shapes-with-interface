public class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void draw() {
        int area = length * breadth;
        System.out.println(area);
    }
}
