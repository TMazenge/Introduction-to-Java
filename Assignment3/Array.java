public class Array{
	
	public static void main(String[] args){

		int[][] nums = new int[10][10];

		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; i++){
				int num = (int)(Math.random() * 100 + 1);
				nums[i][j] = num;
			}
		}
		int x = 15;
		int y = 75;
		int count = 0;
		for(int i, i < 10; i++){
			for(int j = 0; j < 10; i++){
				if(nums[i][j] >= x && nums[i][j] <= y)
					count++;
			}
		}
		System.out.println(count)
	}
}