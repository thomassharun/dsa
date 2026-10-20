package dsa.basics;

public class A5_Patterns {

	public static void main(String[] args) {
		System.out.println("Pyramid");
		for (int i = 0; i <= 11; i++) {
			for (int k = 0; k <= 11-i-1; k++) {
				
				System.out.print(" ");
			}
			for (int j = 0; j <= i*2; j++) {
				
				System.out.print("*");
			}
			System.out.println(" ");
		}

		System.out.println("Inverted pyramid");
		for (int i = 11; i >= 0; i--) {
			for (int k = 0 ; k <= 11-i-1; k++) {

				System.out.print(" ");
			}
			for (int j = i * 2; j >= 0; j--) {

				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("Triangle");
		for (int i = 0; i <= 11; i++) {
			for (int k = 0; k <= 11-i-1; k++) {
				
				System.out.print(" ");
			}
			for (int j = 0; j <= i*2; j++) {
				if(j==0 || j==i*2 || i==11) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
