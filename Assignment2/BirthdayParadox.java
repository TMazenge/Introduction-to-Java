public class BirthdayParadox{

	public static void main(String[] args){

		int N = 1;
		while (N <= 100){


			int shared = 0;

			for (int i = 0; i < 1000; i++){

				boolean[] days = new boolean[365];
				for (int j = 0; j < N; j++){

					int num = (int)(Math.random() * 365);
					if (days[num]){
						shared++;
						break;	
					}
					else{
						days[num] = true;
						
					}
				}
			}
			double prob = shared / 1000.0;
	        StdOut.println(prob);
	        N++;
	    }

	}
}
