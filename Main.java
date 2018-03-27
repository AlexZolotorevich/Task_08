package by.htp.lsn17HomeWork;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Matrix matrix = new Matrix(10);
		
			Thread th1 = new Thread(new ThreadClass(matrix, 1));
			Thread th2 = new Thread(new ThreadClass(matrix, 2));
			Thread th3 = new Thread(new ThreadClass(matrix, 3));

			th1.start();
			th2.start();
			th3.start();

			th1.join();
			th2.join();
			th3.join();
		
		matrix.printMatrix();
	}
}
