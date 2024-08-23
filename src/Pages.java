import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int userAge = scanner.nextInt();
        int pagesRead = 100 - userAge;
        System.out.println(userAge + " year olds should read at least " + pagesRead + " pages before giving up on a book");    

    }
}
