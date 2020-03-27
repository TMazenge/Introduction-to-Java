public class EuclideanDistance{
	
	public static void main(String[] args){

		int x1 = Integer.parseInt(args[0]);
		int y1 = Integer.parseInt(args[1]);
		int x2 = Integer.parseInt(args[2]);
		int y2 = Integer.parseInt(args[3]);
		int x = x2 - x1;
		int y = y2 - y1;
		int e = (x * x) + (y * y);
		double val = java.lang.Math.sqrt(e);

		System.out.println(val);
	}
}