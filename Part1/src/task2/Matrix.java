package subtask2;

public class Matrix {
    private int size;
    private int [][] matrix;

    public Matrix(int size) {
        this.size = size;
        matrix = new int[this.size][this.size];
    }

    public int getSize() {
        return size;
    }

    public void fillRandom(int limit){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * limit);
            }
        }
    }

    public void draw(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void transpose(){
        int [][] temp = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                temp[i][j] = matrix[j][i];
            }
        }
        matrix = temp;
    }

    public void turnOn90degreesClockwise(){
        int [][] temp = new int[size][size];
        int index;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                index = size - j - 1;
                temp[i][j] = matrix[index][i];
            }
        }
        matrix = temp;
    }
}
