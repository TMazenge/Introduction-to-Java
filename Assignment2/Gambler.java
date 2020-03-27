public class Gambler{
	
	public static void main(String[] args){

		int cash = 0;
		double target = 0;

		for (int k = 0; k < 100; k++){
			cash += 10;
			target = cash * 1.5;
			int wins = 0;
			for (int i = 0; i < 100; i++){

				int money = cash;
				while (money > 0 && money < target){
				
					double chance = Math.random();
					if (chance < 0.35) money += 1;
					else if (chance < 0.5) money += 4;
					else                   money -= 2;
				}
				if (money >= target) wins++;
		    }
		    StdOut.println(wins/100.0);
		}
	}
}