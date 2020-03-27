public class RandomArray{
	
	public static void main(String[] args){
		int k = (int)(1 + Math.random() * 100);
		double[] array = new double[k];
		int specific = (int)((1 + 100 * Math.random())*(1 + 100 * Math.random()));
		int count = 0;
		for(int i = 0; i < k; i++){
			int r = (int)(1 + 100 * Math.random());
			int q = (int)(1 + 100 * Math.random());

			array[i] = r * q;
			if(r*q == specific){
				count++;
			}
		}
	}
}