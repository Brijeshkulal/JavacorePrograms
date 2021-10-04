public class QuotientAndRemainder{
   public static void main (String[] args){
      int number1 = Integer.parseInt(args[0]);
      System.out.println("Enter divident " + number1);
		int number2 = Integer.parseInt(args[1]);
      System.out.println("Enter divisor " + number2);
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		System.out.println("The quotient is " + quotient);
      System.out.println("The remainder is " + remainder);
	}
}
		
