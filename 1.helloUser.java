import java.util.Scanner;
public class LearnMain {
    public static void main(String[] args)  {
        System.out.println("Enter username:");
        Scanner input = new Scanner(System.in);
        String username = input.next();
        System.out.println("Hello, " + username);
    }
    }