public class Rectangle extends Shape {
    float length;
    float width;
    float area;
    float perimeter;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    public float calculateArea() {
        area = length * width;
        return (float) area;
    }

    public float calculatePerimeter() {
        perimeter = 2*(length + width);
        return (float) perimeter;
    }
}
