package dsa.basics;

public class A3_MatrixAddition {
	
	public static void main(String[] args) {
		int ar1[][] = {{2,3}, {5,7}, {2,18}};
		int ar2[][] = {{2,33}, {15,7}, {32,18}};
		int n=3;
		int m=2;
		int[][] sum= new int[n][m];
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				sum[i][j]=ar1[i][j]+ar2[i][j];
			}
		}
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < m; j++) {
		        System.out.print(sum[i][j] + " ");
		    }
		    System.out.println();
		}
	}
	
}
