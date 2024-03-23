
import java.util.Scanner;

public class SignOfNumber{
	public static void signOfNumber(int number){
		if(number > 0){
			System.out.println("Positive");
		}else if(number < 0){
			System.out.println("Negative");
		}else{
			System.out.println("Zero");
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number with sign: ");
		int number = scanner.nextInt();
		scanner.close();
		signOfNumber(number);
	}
}