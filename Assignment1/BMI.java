public class BMI{
	
	public static void main(String[] args){

		double m = Double.parseDouble(args[0]);
		double n = Double.parseDouble(args[1]);
		double bmi = (m / (n * n)) * 703;
		System.out.println(bmi);
	}
}