import java.util.Scanner;
public class VowelOrConsonent {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet");
	char alpha = sc.next().charAt(0); 
        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
            System.out.println("This is a Vowel");
        } else {
            System.out.println("This is a Consonant");
        }

    }
}
