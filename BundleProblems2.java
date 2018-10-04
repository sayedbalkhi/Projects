package javabundleExercises2;

import java.util.Arrays;

public class BundleProblems2 {

	
	
	public static int[] sortNumbers() {
		
		int[] myarray1 = {
				 1789, 2035, 1899, 1456, 2013,
				 1458, 2458, 1254, 1472, 2365,
				 1456, 2165, 1457, 2456};
		
		Arrays.sort(myarray1);
		System.out.printf( Arrays.toString(myarray1));
		return null;
		
	}
	
	public static String[] sortName() {
		
		String[] mystrArr = {
				 "Java",
				 "Python",
				 "PHP",
				 "C#",
				 "C Programming",
				 "C++"
				 };
		Arrays.sort(mystrArr);
		System.out.printf(Arrays.toString(mystrArr));

		return null;
	}
}