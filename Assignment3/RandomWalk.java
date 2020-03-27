public class RandomWalk{
	
	public static void main(String[] args){

		int n = Integer.parseInt(args[0])
		int x = n;
		int y = n;
		int steps = 0;

		while ((x > 0 && x < 2 * n) && (y > 0 && 2 * n)){

			steps++;
			double r = Math.random();
			if     (r <= 0.25) x++;
			else if (r <= 0.50) x--;
			else if (r <= 0.75) y++;
		}
		System.out.println(steps);
	}
}