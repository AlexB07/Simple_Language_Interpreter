import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
        System.out.println("Welcome to the Excellent Versatile Interpreted Language!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            ArrayList<String> output = interpreter.interpret(scanner.nextLine());
            for (String i: output) {
                System.out.println(i);
            }
        }
    }
}
