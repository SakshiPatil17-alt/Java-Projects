import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1. What is the capital of India?");
        System.out.println("A. Mumbai");
        System.out.println("B. Delhi");
        System.out.println("C. Pune");
        System.out.println("D. Jaipur");

        char ans1 = sc.next().charAt(0);

        if (ans1 == 'B' || ans1 == 'b') {
            score++;
        }

       
        System.out.println("\nQ2. 2 + 2 = ?");
        System.out.println("A. 3");
        System.out.println("B. 4");
        System.out.println("C. 5");
        System.out.println("D. 6");

        char ans2 = sc.next().charAt(0);

        if (ans2 == 'B' || ans2 == 'b') {
            score++;
        }

        
        System.out.println("\nQ3. Java is a?");
        System.out.println("A. Programming Language");
        System.out.println("B. Animal");
        System.out.println("C. Food");
        System.out.println("D. Car");

        char ans3 = sc.next().charAt(0);

        if (ans3 == 'A' || ans3 == 'a') {
            score++;
        }

        System.out.println("\nYour Score: " + score + "/3");
    }
}