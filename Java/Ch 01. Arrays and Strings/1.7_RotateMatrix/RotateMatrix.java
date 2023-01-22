import java.util.*;

public class RotateMatrix {
	private static boolean Rotate(int[][] matrix){
		if(matrix.length == 0 || matrix.length != matrix[0].length) return false;
		int n = matrix.length;
		if(n == 1) return true;
		for(int i = 0; i < n/2; i++){
			for(int j = i; j < (n-1-i); j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-i-j][i];
				matrix[n-1-i-j][i] = matrix[n-1-i][n-1-i-j];
				matrix[n-1-i][n-1-i-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{1,2,3}, {1,2,3}};
		PrintMatrix(mat);
		Rotate(mat);
		PrintMatrix(mat);
	}
	
	private static void PrintMatrix(int[][] mat){
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[0].length; j++){
				System.out.print("" + mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}