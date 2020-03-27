public class DNA{
	
	public static void main(String[] args){

		String k = "ATCGGTTACTGGAATTCC";
		char[] chars = k.toCharArray();
		cahr[] template = new char[k.length()];
		for (int i = 0; i < chars.length; i++){
			if(chars[i] == 'A') template[i] = 'T';
			else if(chars[i] == 'C') template[i] = 'G';
			else if(chars[i] == 'T') template[i] = 'A';
			else if(chars[i] == 'G') template[i] = 'C';
		}
	System.out.println(template);	
	}
}