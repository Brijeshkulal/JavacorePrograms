public class LargestNumber{
	public static void main(String[] args){
		int num1 = Integer.parseInt(args[0]);
		System.out.println("Enter first number : " + num1);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("Enter second number : " +num2);
		int num3 = Integer.parseInt(args[2]);
   	System.out.println("Enter Third number : " +num3);
		if(num1 > num2 && num1 > num3)
		{
			System.out.println(num1 +" is the largest number");
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println(num2 +" is the largest number");
		}
		else
		{
			System.out.println(num3 +" is the largest number");
		}
	}
}
