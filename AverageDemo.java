package javabundel.calculateaverage.cognnt;

public class AverageDemo {

	public static void main(String[] args) {
		int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
		
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];
		}
			int average=sum/numbers.length;
			System.out.println("the average = "+average);
		

		
	}

}
