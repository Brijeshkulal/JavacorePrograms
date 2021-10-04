import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number to check odd or even ");
        Scanner n = new Scanner(System.in);
        number = n.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        }
        else 
	{
            System.out.println(number + " is odd number");
        }
    }

}
