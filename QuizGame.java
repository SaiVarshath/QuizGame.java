import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions
        String[] questions = {
            "1. What is the capital of France?",
            "2. Which language is used for Android development?",
            "3. What is 5 + 3?",
            "4. Who wrote 'Romeo and Juliet'?",
            "5. Which planet is known as the Red Planet?"
        };

        // Options (4 options per question)
        String[][] options = {
            {"A. Berlin", "B. Paris", "C. Madrid", "D. Rome"},
            {"A. Java", "B. Python", "C. Swift", "D. Ruby"},
            {"A. 6", "B. 7", "C. 8", "D. 9"},
            {"A. Charles Dickens", "B. Jane Austen", "C. William Shakespeare", "D. Mark Twain"},
            {"A. Earth", "B. Mars", "C. Jupiter", "D. Venus"}
        };

        // Correct answers (corresponding to options A=1, B=2, etc.)
        char[] correctAnswers = {'B', 'A', 'C', 'C', 'B'};

        int score = 0;

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char answer = scanner.next().toUpperCase().charAt(0);

            switch (answer) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (answer == correctAnswers[i]) {
                        System.out.println("Correct!\n");
                        score++;
                    } else {
                        System.out.println("Wrong! The correct answer was " + correctAnswers[i] + ".\n");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Skipping question.\n");
            }
        }

        // Final score
        System.out.println("Quiz finished!");
        System.out.println("Your score: " + score + " out of " + questions.length);

        scanner.close();
    }
}
