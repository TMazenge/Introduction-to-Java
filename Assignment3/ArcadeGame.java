public class ArcadeGame{
	
	public static void main(String[] args){

		int plays = Integer.parseInt(args[0]);
		int wins = 0;

		for (int i = 0; i < plays; i++){

			int hit = (int)(Math.random() * 25 + 1);

			int checkh = hit % 3;
			int checkkp = 1 % 4;

			if (checkh == 0 && checkp == 0){
				wins += 1;
			}
		}
		System.out.println("Number of jackpots: " + wins);
	}
}