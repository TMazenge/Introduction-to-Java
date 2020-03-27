public class Leader{
	
	public static void main(String[] args){

		String[] contestants = {"Timothy", "Mazenge", "Noah", "Michael"};
		int[] value = new int[contestants.lenth];
		int count = 0;
		for(String person: contestants){
			String buffer = "";
			String input = person.toLowerCase();
			for(int i = 0; i < input.length(); i++){
				if (!buffer.contains(String.valueOf(input.charAt(i)))){
					buffer += input.charAt(i);
				}
			}
			value[count] = buffer.length();
			count++;
		}
		int maxValue = valu[0];
		int n = 0;
		for (int i = 1; i < value.length; i++){
			if (value[i] > maxValue){
				maxValue = value[i];
				n = i;
			}
		}
		System.out.println("The winner is " + contestants[n]);	

	}
}