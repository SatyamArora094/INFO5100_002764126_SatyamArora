import java.util.Arrays;

public class Session {
    public Student[] students;
    public int studentCount;
    Session() {
        students = new Student[20];
        studentCount = 0;
    }

    public void createStudent(String fName, String lName, type studentType, float[] scores) {
        Student ward;
        if(studentType == type.FULL_TIME) {
            ward = new FullTime(fName,lName);
        } else {
            ward = new PartTime(fName,lName);
        }
        for(int i = 0; i< scores.length; i++) {
            ward.addSingleScore(scores[i]);
        }
        students[studentCount++] = ward;
    }

    public void printParticularQuizInAscendingOrder(int index) {
        float[] allMarks = new float[20];
        for(int i = 0; i < 20; i++) {
            allMarks[i] = this.students[i].getScore(index);
        }
        Arrays.sort(allMarks);
        for(int i = 0 ; i < 20 ; i++) {
            System.out.println("Marks in Quiz " + index + " is " + allMarks[i]);
        }
    }


}
