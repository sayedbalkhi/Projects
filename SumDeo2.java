package javabundle.sum.conizant;

public class SumDeo2 {

	public static void main(String[] args) {

		int[] myList = { 25, 68, 41, 37, 65, 91, 43, 76, 88, 94 };

		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}
		System.out.println("==================");

		// findin the sum of arrays
		int sum = 0;
		for (int i = 0; i < myList.length; i++) {
			sum += myList[i];
		}
		System.out.println("the total =" + sum);

		// finding the max number
		int max = 0;
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[i];

		}
		System.out.println("te max number is " + max);
	}

}
