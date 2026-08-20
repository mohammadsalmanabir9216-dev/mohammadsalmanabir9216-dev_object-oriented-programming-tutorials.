import javax.swing.*;
import java.awt.event.*;

public class QuizBattleGUI implements ActionListener {
    private JFrame frame;
    private JLabel questionLabel;
    private JButton option1Btn, option2Btn;
    private JLabel resultLabel;

    private Questions[] questions;
    private int currentIndex = 0;

    public QuizBattleGUI() {
        // Instantiate the sample questions
        questions = new Questions[] {
            new Questions("Which keyword creates an object?", "new", "class", "new"),
            new Questions("Which is not a primitive type?", "int", "String", "String")
        };

        // Frame initialization
        frame = new JFrame("Programming Quiz Battle");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Absolute Positioning layout

        // Construct layout components
        questionLabel = new JLabel();
        questionLabel.setBounds(50, 30, 300, 30);
        frame.add(questionLabel);

        option1Btn = new JButton();
        option1Btn.setBounds(50, 80, 120, 40);
        option1Btn.addActionListener(this);
        frame.add(option1Btn);

        option2Btn = new JButton();
        option2Btn.setBounds(210, 80, 120, 40);
        option2Btn.addActionListener(this);
        frame.add(option2Btn);

        resultLabel = new JLabel("Answer the question!", SwingConstants.CENTER);
        resultLabel.setBounds(50, 150, 300, 30);
        frame.add(resultLabel);

        // Load the first question
        loadQuestion();

        frame.setVisible(true);
    }

    // Method to change text dynamically for the current question index
    private void loadQuestion() {
        if (currentIndex < questions.length) {
            questionLabel.setText(questions[currentIndex].getQuestion());
            option1Btn.setText(questions[currentIndex].getOption1());
            option2Btn.setText(questions[currentIndex].getOption2());
            resultLabel.setText("Answer the question!");
        } else {
            // Reached the end of the array
            questionLabel.setText("Quiz Finished!");
            option1Btn.setVisible(false);
            option2Btn.setVisible(false);
            resultLabel.setText("Congratulations! You defeated the Code Boss!");
        }
    }

    // Overridden method from ActionListener to handle button click interactions
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton selectedBtn = (JButton) e.getSource();
        String choice = selectedBtn.getText();

        if (questions[currentIndex].isCorrect(choice)) {
            resultLabel.setText("Correct! You defeated the Code Boss!");
            
            // Optional: short timer delay to move to the next question automatically after 1.5s
            Timer timer = new Timer(1500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    currentIndex++;
                    loadQuestion();
                }
            });
            timer.setRepeats(false);
            timer.start();
        } else {
            resultLabel.setText("Wrong! Try Again!");
        }
    }

    // Main entry point to launch the desktop application
    public static void main(String[] args) {
        new QuizBattleGUI();
    }
}