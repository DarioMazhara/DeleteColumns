package CS245TwoSum;

public class SortColumns {
	
	static String[] a = {"zyx", "wvu", "tsr"};
	
	public static void main(String[] args) {
		minDeletionSize(a);
	}
	
	//Checks to make sure all elements are of equal size
	public static Boolean checkLength(String[] A) {
		int length = A[0].length();
		for (int i = 0; i < A.length; i++) {
			if (A[i].length() != length) {
				return false;
			}
		}
		return true;
	}
	public static int[] minDeletionSize(String[] A) {
		int D = 0;
		if (checkLength(A)) {
			//Iterates through each character in an element
			for (int i = 0; i < A[0].length(); i++) {
				//Iterates through elements
				for (int j = 0; j < A.length - 1; j++) {
					//Compares characters from different elements
					//If a character at an earlier element is greater than a character
					//from a later element, it is not sorted so add to D
					if (A[j].charAt(i) > A[j+1].charAt(i)) {
						D++;
						break;
					}
				}
			}
		}
		if (D == 0)
			D = -1;
		System.out.println(D);
		return new int[] {D};
	}
}
