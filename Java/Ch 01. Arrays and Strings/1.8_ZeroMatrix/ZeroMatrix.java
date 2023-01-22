import java.util.*;

public class ZeroMatrix{
	public static List<Integer> xs = new ArrayList<Integer>();
	public static List<Integer> ys = new ArrayList<Integer>();
	
	private static void ZeroMat(int[][] mat){
		FindZeros(mat);
		for(int i : xs){
			MakeZero(mat, i, -1);
		}
		for(int j : ys){
			MakeZero(mat, -1, j);
		}
	}
	private static void MakeZero(int[][] mat, int row, int col){
		if(row != -1){
			for(int i = 0; i < mat[0].length; i++){
				mat[row][i] = 0;
			}
		}
		if(col != -1){
			for(int i = 0; i < mat.length; i++){
				mat[i][col] = 0;
			}
		}
	}
	private static void FindZeros(int[][] mat){
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[0].length; j++){
				if(mat[i][j] == 0){
					if(!xs.contains(i)){
						xs.add(i);
					}
					if(!ys.contains(j)){
						ys.add(j);
					}
				}
			}
		}
	}
	public static void main(String[] args){
		int[][] mat = {{1,2,3,0},{1,2,1,2}, {1,2,0,4}};
		PrintMatrix(mat);
		System.out.println();
		ZeroMat(mat);
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