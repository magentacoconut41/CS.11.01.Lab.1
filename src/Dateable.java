import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int userAge = scanner.nextInt();
        int dateableAge = 7 + userAge / 2;
        System.out.println(userAge + " year olds should date someone at least " + dateableAge);    
    }
}
