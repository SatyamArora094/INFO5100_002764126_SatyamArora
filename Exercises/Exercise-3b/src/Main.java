import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    static private Rectangle R;
    static private Square S;
    static private Triangle T1;
    static private Triangle T2;
    static private Circle C;

    static private float areaOfRectangle;
    static private float areaOfSquare;
    static private float areaOfTriangle1;
    static private float areaOfTriangle2;
    static private float areaOfCircle;
    static private float periOfRectangle;
    static private float periOfSquare;
    static private float periOfTriangle1;
    static private float periOfTriangle2;
    static private float periOfCircle;

    static private FileOutputStream fos;
    static private ObjectOutputStream oos;

    static public String getFileName(String type) {
        String filePath = "";
        switch(type) {
            case "Rectangle" :
                filePath = "/Users/dhruvinity/IdeaProjects/aedEX3b/output_R.txt";
                break;
            case "Square":
                filePath = "/Users/dhruvinity/IdeaProjects/aedEX3b/output_S.txt";
                break;
            case "Triangle1":
                filePath = "/Users/dhruvinity/IdeaProjects/aedEX3b/output_T1.txt";
                break;
            case "Triangle2":
                filePath = "/Users/dhruvinity/IdeaProjects/aedEX3b/output_T2.txt";
                break;
            case "Circle":
                filePath = "/Users/dhruvinity/IdeaProjects/aedEX3b/output_C.txt";
                break;
            default:
                filePath = "/Users/dhruvinity/IdeaProjects/aedEX3b/output.txt";
        }
        return filePath;
    }

    static public void setAreas() {
        areaOfRectangle = R.calculateArea();
        areaOfSquare = S.calculateArea();
        areaOfTriangle1 = T1.calculateArea();
        areaOfTriangle2 = T2.calculateArea();
        areaOfCircle = C.calculateArea();
    }

    static public void setColor() {
        C.setColor("red");
        R.setColor("blue");
        T1.setColor("yellow");
        T2.setColor("pink");
        S.setColor("orange");
    }

    static public void setPeri() {
        periOfRectangle = R.calculatePerimeter();
        periOfSquare = S.calculatePerimeter();
        periOfTriangle1 = T1.calculatePerimeter();
        periOfTriangle2 = T2.calculatePerimeter();
        periOfCircle = C.calculatePerimeter();
    }
    static public void serializeCustom(String type) {
        try {
            fos = new FileOutputStream(getFileName(type));
            oos = new ObjectOutputStream(fos);
            switch(type) {
                case "Rectangle":
                    oos.writeObject(R);
                    break;
                case "Square":
                    oos.writeObject(S);
                    break;
                case "Triangle1":
                    oos.writeObject(T1);
                    break;
                case "Triangle2":
                    oos.writeObject(T2);
                    break;
                case "Circle":
                    oos.writeObject(C);
                    break;
            }
            oos.flush();
            oos.close();
        }catch(Exception E) {
            System.out.println("There was a problem serializing the data");
        }

    }
    static public void deSerializeCustom(String type) {
        try {
            FileInputStream fis = new FileInputStream(getFileName(type));
            ObjectInputStream ois = new ObjectInputStream(fis);
            switch (type) {
                case "Rectangle":
                    Rectangle R = (Rectangle)ois.readObject();
                    break;
                case "Square":
                    Square S =  (Square)ois.readObject();;
                    break;
                case "Triangle1":
                    Triangle T1 = (Triangle)ois.readObject();;
                    break;
                case "Triangle2":
                    Triangle T2 = (Triangle)ois.readObject();;
                    break;
                case "Circle":
                    Circle C = (Circle) ois.readObject();;
                    break;

            }
        } catch (Exception E) {
            System.out.println("There was a problem deserializing the data");
        }

    }

    static public void printoutput() {
        System.out.println("Area of Rectangle R is " + areaOfRectangle + " and perimeter of this rectangle is " + periOfRectangle + "\nColor of this rectangle is "+ R.Color);
        System.out.println("Area of Square S is " + areaOfSquare + " and perimeter of this square is " + periOfSquare + "\nColor of this square is "+ S.Color);
        System.out.println("Area of Triangle T1 is " + areaOfTriangle1 + " and perimeter of this triangle is " + periOfTriangle1 + "\nColor of this triangle is "+ T1.Color);
        System.out.println("Area of Triangle T2 is " + areaOfTriangle2 + " and perimeter of this triangle is " + periOfTriangle2 + "\nColor of this triangle is "+ T2.Color);
        System.out.println("Area of Circle C is " + areaOfCircle + " and perimeter of this circle is " + periOfCircle + "\nColor of this circle is "+ C.Color);
    }

    static public void setShapesFromSerialization() {
        deSerializeCustom("Rectangle");
        deSerializeCustom("Square");
        deSerializeCustom("Triangle1");
        deSerializeCustom("Triangle2");
        deSerializeCustom("Circle");
    }

    static public void setShapes() {
        R = new Rectangle(10,20);
        S = new Square(10);
        T1 = new Triangle(10,20);
        T2 = new Triangle(3,4,5);
        C = new Circle(7);
    }

    public static void withoutDeserialization() {
        setShapes();
        setColor();
        setAreas();
        setPeri();
        serializeCustom("Rectangle");
        serializeCustom("Square");
        serializeCustom("Triangle1");
        serializeCustom("Triangle2");
        serializeCustom("Circle");
        printoutput();
    }

    public static void withDeserialization() {
        setShapesFromSerialization();
        setColor();
        setAreas();
        setPeri();
        serializeCustom("Rectangle");
        serializeCustom("Square");
        serializeCustom("Triangle1");
        serializeCustom("Triangle2");
        serializeCustom("Circle");
        printoutput();
    }

    public static void main(String[] args) {
        withoutDeserialization();
        withDeserialization();
    }
}
