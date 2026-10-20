package dsa.basics;

public class A4_MatrixMultiplication {

	public static void main(String[] args) {
		int ar1[][] = { { 1, 2 }, { 4, 5 } };
		int ar2[][] = { { 2, 1 }, { 3, 4 } };
		int n = 2;
		int m = 2;
		int[][] sum = new int[n][m];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					//System.out.print(" i:" + i + " j:" + j + " k:" + k + "\n");
					sum[i][j] += ar1[i][k] * ar2[k][j];
				}
				//System.out.println();
			}
			//System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	
		System.out.println("----------------------");
	//2X3*3X2 matrix => 2X2 matrix
	
	int ar3[][] = { { 1, 2, 4 }, { 4, 5, 9 } };
	int ar4[][] = { { 2, 1 }, { 3, 4 }, {4, 1} };
	int a = 3;//row of ar3
	int b = 2;//col of ar4
	int c = 3;//col of ar3 = row of ar4
	int[][] res = new int[n][m];
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			for (int k = 0; k < c; k++) {
				//System.out.print(" i:" + i + " j:" + j + " k:" + k + "\n");
				res[i][j] += ar3[i][k] * ar4[k][j];
			}
			//System.out.println();
		}
		//System.out.println();
	}
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 2; j++) {
			System.out.print(res[i][j] + " ");
		}
		System.out.println();
	}
}

}
