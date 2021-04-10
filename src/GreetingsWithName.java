import java.util.Scanner;

public class GreetingsWithName {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.print("Hello, " + name);
    }
}
