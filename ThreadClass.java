package by.htp.lsn17HomeWork;

public class ThreadClass implements Runnable {

	private int id;
	private Matrix matrix;

	public ThreadClass(Matrix matrix, int id) {
		this.matrix = matrix;
		this.id = id;

	}

	public int getId() {
		return id;
	}

	@Override
	public void run() {
		while (matrix.check() == 0) {
			synchronized (matrix) {
				for (int i = 0, j = 0; i < matrix.getMatrix().length; i++, j++) {
					if (matrix.getMatrix()[i][j] == 0) {
						matrix.setPosMatrix(i, j, id);
						printInfo(i, j, id);
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					}
				}
			}
		}

	}

	public void printInfo(int i, int j, int id) {
		System.out.println("Position in Matrix: " + "[" + i + "]" + "[" + j + "]" + " Thread Number: " + id);
	}

}
