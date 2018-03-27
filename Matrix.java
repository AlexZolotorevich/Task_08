package by.htp.lsn17HomeWork;

public class Matrix {
	private int size;
	private int [][] matrix;
	
	
	public Matrix (int size) {
		this.size = size;
		matrix = new int[size][size];
		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	public void setPosMatrix(int x, int y, int id) {
		this.matrix[x][y] = id;
	}
	
	public void printMatrix() {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
		        }
			System.out.println("");
		}
		
	}
	
	public int check() {
		return matrix[size-1][size-1];
	}

	
	
}
