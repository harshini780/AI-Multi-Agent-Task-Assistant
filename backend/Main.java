import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("AI Multi-Agent Task Assistant");

        System.out.print("Enter Task: ");

        String task = sc.nextLine();

        System.out.println("Task Assigned Successfully");

        System.out.println("AI Agent Processing: " + task);
    }
}