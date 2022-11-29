public class Triangle extends Shape {
    float height;
    float base;
    float side1;
    float side2;
    float side3;
    float semiPerimeter;
    float perimeter;
    float area;

    Triangle(float h, float b) {
        height = h;
        base = b;
    }

    Triangle(float s1, float s2, float s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    private void calculateSemiPerimeter() {
        semiPerimeter = (side1 + side2 +side3)/2;
    }

    private void calculateAreaSimple() {
        area = (base * height)/2;
    }

    private void calculateAreaHard() {
        calculateSemiPerimeter();
        double temp = semiPerimeter *  (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3);// √[s(s-a)(s-b)(s-c)]
        area = (float)Math.sqrt(temp);
    }

    public float calculateArea() {
        if(height != 0 && base !=0) {
            calculateAreaSimple();
        } else {
            calculateAreaHard();
        }
        return area;
    }

    public float calculatePerimeter() {
        perimeter = side1 + side2 + side3;
        return perimeter;
    }

}
