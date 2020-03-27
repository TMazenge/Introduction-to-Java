public class Robber{
	
	public static int houses(int[] money){

		if(money == null || money.length == 0)
			return 0;
		if(money.length == 1)
			return money[0];
		int[] robbed = new int[money.length];
		robbed[0] = money[0];
		robbed[1] = Math.max(money[0], money[1]);

		for(int i = 2; i < money.length; i++){
			robbed[i] = Math.max(robbed[i-2] + money[i], robbed[i - 1]);
		}
	}

}
