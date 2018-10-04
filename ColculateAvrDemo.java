package javabundel.calculateaverage.cognnt;

public class ColculateAvrDemo {

	public static void main(String[] args) {

		int[] cal = { 48, 94, 25,83, 64, 94, 15, 21, 17, 63, 48 };
		int sum = 0;

		for (int i = 0; i < cal.length; i++) {
			sum += cal[i];
		}
		int average = sum / cal.length;
		
		System.out.println("the average is "+ average);
	}

}
