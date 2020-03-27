public class Party{
	
	public static boolean party(int[] houses){

		for(int i = 0; i < houses.length; i++){
			int lastHouse = houses.length - 1;
			if ((houses[i] + i) < lastHouse) return false;

		}
		return true;
	}
}