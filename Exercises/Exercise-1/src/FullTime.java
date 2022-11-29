public class FullTime extends Student{
    private float[] extraScores;
    private int totalExtraScoreCounter;

    FullTime(String f, String l) {
        super(f,l);
        extraScores = new float[2];
        totalExtraScoreCounter = 0;
    }

    public void addExtraScore(float score) {
        if(this.totalExtraScoreCounter < 2) {
            this.extraScores[this.totalExtraScoreCounter++] = score;
        } else {
            System.out.println("A full time student can have only two extra test scores.");
        }
    }

    public void addExtraScore(float[] scores) {
        if(this.totalExtraScoreCounter < 2) {
            this.extraScores = scores;
        } else {
            System.out.println("A full time student can have only two extra test scores.");
        }
    }

    public float getExtraScore(int index) {
        if(index >=0 && index < 2) {
            return this.extraScores[index];
        }else {
            System.out.println("You are trying to retrieve a quiz that doesn\'t exist.");
            return 0;
        }
    }

    public void printQuizScore(int index) {
        System.out.println("Quiz scores for position " + index + " is " + getScore(index));
    }



    public float avgQuizScore() {
        int totalQuizzes = getCurrentQuizCount();
        float sum = 0;
        for(int i = 0; i < totalQuizzes; i++) {
            sum += getScore(i);
        }
        for(int i = 0; i < this.totalExtraScoreCounter; i++) {
            sum+= this.getExtraScore(i);
        }
        return sum/(totalQuizzes+this.totalExtraScoreCounter);
    }

    public  void printName() {
        System.out.println("This Full-Time student\'s name is : " + getFullName());
    }

    public  void printName(type studentType) {
        if(studentType == type.FULL_TIME) {
            System.out.println("This Full-Time student\'s name is : " + getFullName());
        }
    }

    public void printExamScores() {
        int totalQuizzes = getCurrentQuizCount();
        System.out.println("Quiz scores of " + getFName() + " are the following :");
        for(int i = 0; i < totalQuizzes; i++) {
            System.out.println(getScore(i));
        }
        for(int i = 0; i < 2; i++) {
            System.out.println(this.getExtraScore(i));
        }
    }


    public void printExamScores(type studentType) {
        if(studentType == type.FULL_TIME) {
            this.printExamScores();
        }
    }

    public void addSingleScore(float score) {
        addScore(score);
    }
}
