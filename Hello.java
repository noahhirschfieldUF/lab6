import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        //make a connection and declare response
        Scanner keyboard = new Scanner(System.in);
        String response;

        //ask questions and get scanner input to respond
        System.out.println("Hello. What is your name?");
        response = keyboard.next();
        System.out.println("It's nice to meet you, " + response + ". How old are you?");
        response = keyboard.next();
        System.out.println("I see that you are still quite young at only " + response + ".");
        System.out.println("Where do you live?");
        response = keyboard.next();
        System.out.println("Wow! I've always wanted to go to " + response + ". Thanks for chatting with me. Bye!");

    }
}
