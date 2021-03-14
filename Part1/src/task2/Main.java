package subtask2;

public class Main {
    public static void main(String[] args) {
        int size = 3;
        Matrix matrix = new Matrix(size);
        matrix.fillRandom(10);
        matrix.draw();
        System.out.println();
        matrix.transpose();
        matrix.draw();
        System.out.println();
        matrix.turnOn90degreesClockwise();
        matrix.draw();
    }
}
