public class SwapNumber {
    public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
        System.out.println("Enter first number : " + num1);
		int num2 = Integer.parseInt(args[1]);
        System.out.println("Enter second number : " +num2);
		System.out.println("Before swapping value of num1 = " + num1 + " and num2 = " + num2);
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping value of num1 = " + num1 + " and num2 = " + num2);
    }
}
