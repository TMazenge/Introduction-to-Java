public class CouponCollector {
	
	public static void main(String[] args){

		int N = 1;
		
		while (N < 50){	
			for(int i = 0; i < 100; i++){

				boolean[] coupons = new boolean[N];
				int cards = 0, valcnt = 0;
				for (int j = 0; valcnt < N; j++){

					int num = (int)(Math.random() * N);
					cards++;
					if (!coupons[num]){
						valcnt++;
						coupons[num] = true;
					}
				}
				StdOut.println(cards);
				N++;
			}
		}
	}
}