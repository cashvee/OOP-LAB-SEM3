class Matrix {
    int[][] matrix;
    int rows, cols;

    Matrix(int[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
    }

    void displayMatrix() {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    void displayTranspose() {
        System.out.println("Transpose:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    void displayMaxValue() {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int val : row) {
                if (val > max)
                    max = val;
            }
        }
        System.out.println("Maximum Value: " + max);
    }

    void displayPrincipalDiagonal() {
        System.out.println("Principal Diagonal:");
        for (int i = 0; i < Math.min(rows, cols); i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    void displayNonDiagonalElements() {
        System.out.println("Non-Diagonal Elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i != j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}

class DisplayMatrixThread extends Thread {
    Matrix matrix;

    DisplayMatrixThread(Matrix matrix) {
        this.matrix = matrix;
    }

    public void run() {
        matrix.displayMatrix();
    }
}

class TransposeThread extends Thread {
    Matrix matrix;

    TransposeThread(Matrix matrix) {
        this.matrix = matrix;
    }

    public void run() {
        matrix.displayTranspose();
    }
}

class MaxValueThread extends Thread {
    Matrix matrix;

    MaxValueThread(Matrix matrix) {
        this.matrix = matrix;
    }

    public void run() {
        matrix.displayMaxValue();
    }
}

class PrincipalDiagonalThread extends Thread {
    Matrix matrix;

    PrincipalDiagonalThread(Matrix matrix) {
        this.matrix = matrix;
    }

    public void run() {
        matrix.displayPrincipalDiagonal();
    }
}

class NonDiagonalThread extends Thread {
    Matrix matrix;

    NonDiagonalThread(Matrix matrix) {
        this.matrix = matrix;
    }

    public void run() {
        matrix.displayNonDiagonalElements();
    }
}

public class isAlivejoin {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Matrix matrix = new Matrix(mat);

        Thread t1 = new DisplayMatrixThread(matrix);
        Thread t2 = new TransposeThread(matrix);
        Thread t3 = new MaxValueThread(matrix);
        Thread t4 = new PrincipalDiagonalThread(matrix);
        Thread t5 = new NonDiagonalThread(matrix);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            // Use isAlive() to check if threads are still running
            while (t1.isAlive() || t2.isAlive() || t3.isAlive() || t4.isAlive() || t5.isAlive()) {
                System.out.println("Some threads are still running...");
                Thread.sleep(500); // Wait before checking again
            }

            // Use join() to wait for threads to finish before printing final message
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();

            System.out.println("All threads have finished execution.");

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
