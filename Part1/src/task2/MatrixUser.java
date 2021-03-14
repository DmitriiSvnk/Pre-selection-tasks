package subtask2;

public class MatrixUser {
    public Matrix multiply(Matrix a, Matrix b){
        Matrix temp = new Matrix(a.getSize());
        for (int i = 0; i < a.getSize(); i++) {
            for (int j = 0; j < a.getSize(); j++) {
                for (int e = 0; e < a.getSize(); e++) {
                    temp[i][j] = a[i][e] * b[e][j];
                }
            }
        return temp;
    }
}
