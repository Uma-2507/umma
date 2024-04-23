package day15;
import java.util.Arrays;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        QuizService quizService = new QuizService();

        // Add some questions
        quizService.addQuestion(new QuizQuestion(
                "What is the capital of France?",
                Arrays.asList("Berlin", "Madrid", "Paris", "Rome"),
                2  // Index of the correct answer in the list (Paris)
        ));

        quizService.addQuestion(new QuizQuestion(
                "Who wrote 'To Kill a Mockingbird'?",
                Arrays.asList("Harper Lee", "Ernest Hemingway", "Mark Twain", "F. Scott Fitzgerald"),
                0  // Index of the correct answer (Harper Lee)
        ));

        quizService.addQuestion(new QuizQuestion(
                "Which planet is known as the Red Planet?",
                Arrays.asList("Earth", "Mars", "Jupiter", "Saturn"),
                1  // Index of the correct answer (Mars)
        ));

        // Run the quiz
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz!");
        System.out.println("You will be asked a series of questions. Select the correct answer by typing its number.");

        for (int i = 0; i < quizService.getNumberOfQuestions(); i++) {
            QuizQuestion question = quizService.getQuestion(i);

            question.displayQuestion();  // Display the question and options
            System.out.print("Your answer: ");
            int userAnswer = sc.nextInt() - 1;  // Subtract 1 to match the index

            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was " + (question.getCorrectAnswer() + 1) + ". " + question.getOptions().get(question.getCorrectAnswer()));
            }
            System.out.println();  // New line for readability
        }

        System.out.println("Quiz completed. Your score: " + score + " out of " + quizService.getNumberOfQuestions());
    }
}
