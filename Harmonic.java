public class Harmonic{
	public static void main(String[] args){
		double number = Double.parseDouble(args[0]);		
		double i;
		double hNum = 0;
		for(i=1;i<=number;i++){
			hNum += (1/i);
		}
		System.out.println("Harmonic value : " + hNum);
	}
}
