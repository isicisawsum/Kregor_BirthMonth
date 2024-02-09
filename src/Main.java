import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month;
        System.out.println("Enter your birth month as a number [1-12]:");
        month = in.nextInt();
        in.nextLine();
        if (month > 0 && month < 12)
        {
                System.out.println("Your birth month is: " + month);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + month);
        }
    }
}
