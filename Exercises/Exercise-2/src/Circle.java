public class Circle extends Shape {
    float radius;
    float area;
    float perimeter;

    Circle(float r) {
        radius  = r;
    }

    public float calculateArea() {
        area = 22/7 * radius * radius;
        return area;
    }

    public float calculatePerimeter() {
        perimeter = 2 * 22/7 * radius;
        return perimeter;
    }
}
