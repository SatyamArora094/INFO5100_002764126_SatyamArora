abstract public class Student {

    private float[] scores = new float[15];
    private int currentQuizCount = 0;
    private String fName;
    private String lName;

    Student(String f, String l) {
        fName = f;
        lName = l;
    }

    //1. Create public methods to calculate average quiz scores per student for the whole class
    abstract float avgQuizScore();

    //2. Create public method to print names of part-time students

    abstract void printName();

    abstract void printName(type studentType);

    //3. Create public method to print exam scores of full-time students

    abstract void printExamScores();
    abstract void printExamScores(type studentType);

    abstract void printQuizScore(int index);

    abstract public void addExtraScore(float score);

    abstract public void addExtraScore(float[] scores);

    abstract void addSingleScore(float score);

    public void addScore(float score) {
        try{
            this.scores[this.currentQuizCount++] = score;
        } catch(Exception E) {
            System.out.println("You are trying to add more than 15 scores for this student.");
        }
    }

    public float getScore(int index) {
        if(index < 15 && index > 0) {
            return this.scores[index];
        }
        return 0;
    }

    public int getCurrentQuizCount() {
        return this.currentQuizCount;
    }

    public String getFName() {
        return this.fName;
    }

    public String getLName() {
        return this.lName;
    }

    public String getFullName() {
        return this.getFName() + " " + this.getLName();
    }




}
