public class Main {
    public static void main(String[] args) {
        Rectangle R = new Rectangle(10,20);
        Square S = new Square(10);
        Triangle T1 = new Triangle(10,20);
        Triangle T2 = new Triangle(3,4,5);
        Circle C = new Circle(7);
        C.setColor("red");
        R.setColor("blue");
        T1.setColor("yellow");
        T2.setColor("pink");
        S.setColor("orange");
        float areaOfRectangle = R.calculateArea();
        float areaOfSquare = S.calculateArea();
        float areaOfTriangle1 = T1.calculateArea();
        float areaOfTriangle2 = T2.calculateArea();
        float areaOfCircle = C.calculateArea();
        float periOfRectangle = R.calculatePerimeter();
        float periOfSquare = S.calculatePerimeter();
        float periOfTriangle1 = T1.calculatePerimeter();
        float periOfTriangle2 = T2.calculatePerimeter();
        float periOfCircle = C.calculatePerimeter();
        System.out.println("Area of Rectangle R is " + areaOfRectangle + " and perimeter of this rectangle is " + periOfRectangle + "\nColor of this rectangle is "+ R.Color);
        System.out.println("Area of Square S is " + areaOfSquare + " and perimeter of this square is " + periOfSquare + "\nColor of this square is "+ S.Color);
        System.out.println("Area of Triangle T1 is " + areaOfTriangle1 + " and perimeter of this triangle is " + periOfTriangle1 + "\nColor of this triangle is "+ T1.Color);
        System.out.println("Area of Triangle T2 is " + areaOfTriangle2 + " and perimeter of this triangle is " + periOfTriangle2 + "\nColor of this triangle is "+ T2.Color);
        System.out.println("Area of Circle C is " + areaOfCircle + " and perimeter of this circle is " + periOfCircle + "\nColor of this circle is "+ C.Color);
    }
}
