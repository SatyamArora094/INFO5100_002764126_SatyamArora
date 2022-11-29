package Exercise;


public class Table {

    String type = "office";
    int height = 1;
    int length = 2;
    int width = 3;
    int wheels = 4;
    String feature = "Standing";
    String name = "X";
    String parent = "furniture";

    public Table(int a){
        System.out.println("Instance created");

    }


    void adjustHeight(){

    }

    void dismantle(){

    }

    void move(){

    }

    static class woodenTable{
        void display() {
            System.out.println("First Nested class of table");
        }
    }

    static class plasticTable{
        void display() {
            System.out.println("Second Nested class of table");
        }
    }

}
