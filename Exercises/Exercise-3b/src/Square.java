public class Square extends Rectangle {
    float area;
    float perimeter;

    Square(int s) {
        super(s, s);
    }

    public float calculateArea() {
        area = super.calculateArea();
        return area;
    }

    public float calculatePerimeter() {
        perimeter = super.calculatePerimeter();
        return perimeter;
    }
}
