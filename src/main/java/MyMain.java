import java.util.Scanner;

public class MyMain {
	public static void main(final String[] args) {

        final Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        final String name = scan.next();
        System.out.println("Hello, " + name + "!" + " It's nice to meet you!");
        System.out.print("What is your favorite color, " + name + "?");
        final String color = scan.next();
        System.out.println("Oh I like " + color + " too!");
        System.out.print("What is your favorite food, " + name + "?");
        final String food = scan.next();
        System.out.println("Oh " + food + " I see that's interesting!");
        System.out.print("What is your favorite hobby, " + name + "?");
        final String hobby = scan.next();
        System.out.println(hobby + " It's nice to know your hobby! Thank you.");
        System.out.print("Last question, " + name + ". If you can visit any country, Which country would you go?");
        final String country = scan.next();
        System.out.println("Nice " + country + ". I want to visit there as well. Thank you for answering questions and see you again." );
}
}
