public class PartTime extends Student{

    PartTime(String f, String l) {
        super(f,l);
    }

    public void printQuizScore(int index) {
        System.out.println("Quiz scores for position " + index + " is " + getScore(index));
    }

    public void addExtraScore(float __) {
        return;
    }
    public void addExtraScore(float[] __) {
        return;
    }

    public float avgQuizScore() {
        int totalQuizzes = getCurrentQuizCount();
        float sum = 0;
        for(int i = 0; i < totalQuizzes; i++) {
            sum += getScore(i);
        }
        return sum/totalQuizzes;
    }

    public  void printName() {
        System.out.println("This Part-Time student\'s name is : " + getFullName());
    }

    public  void printName(type studentType) {
        if(studentType == type.PART_TIME) {
            System.out.println("This Part-Time student\'s name is : " + getFullName());
        }
    }

    public void printExamScores() {
        int totalQuizzes = getCurrentQuizCount();
        System.out.println("Quiz scores of " + getFName() + " are the following :");
        for(int i = 0; i < totalQuizzes; i++) {
            System.out.println(getScore(i));
        }
    }

    public void printExamScores(type studentType) {
        if(studentType == type.PART_TIME) {
            this.printExamScores();
        }
    }

    public void addSingleScore(float score) {
        addScore(score);
    }
}
