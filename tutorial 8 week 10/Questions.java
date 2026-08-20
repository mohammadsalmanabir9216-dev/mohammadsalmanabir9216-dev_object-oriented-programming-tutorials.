public class Questions {
    private String question;
    private String option1;
    private String option2;
    private String answer;

    // Constructor
    public Questions(String question, String option1, String option2, String answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.answer = answer;
    }

    // Missing getters from the prompt
    public String getQuestion() {
        return this.question;
    }

    public String getOption1() {
        return this.option1;
    }

    public String getOption2() {
        return this.option2;
    }

    // Method to check if the user selected the correct answer
    public boolean isCorrect(String choice) {
        return choice.equalsIgnoreCase(answer);
    }
}