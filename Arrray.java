package array.test;

public class Arrray {

	static int [] a = {4, 2, 5, 6, 8};
	
	public static void main(String[] args) {
		
		int maxinarray = max(a);
		System.out.println("The max value " + maxinarray);
		
		int minarray = min(a);
		System.out.println("The min value " + minarray);
		
		int [] sortAscVar = sortAsc(a);
		for(int x : sortAscVar ) {
			System.out.print(" " + x);
		}
		
	}
	
	
	public static int max(int [] ab) {
		int max = ab[0];
		for (int i = 0; i < ab.length; i++) {
			if(ab[i] > max) {
				max = ab[i];
			}
		}
		return max;
	}
	
	public static int min(int [] bc) {
		int min = bc[0];
		for (int i = 0; i < bc.length; i++) {
			if (bc[i] < min) {
				min = bc[i];
			}
		}
		return min;
	}
	
	public static int [] sortAsc(int [] s) {
		int temp = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[i] < s[j] ) {
					temp = s[i];
					s[i] = s[j];
					s[j]= temp; 
				}
			}
		}
		return s;
	}

}
