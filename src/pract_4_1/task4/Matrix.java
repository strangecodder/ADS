package pract_4_1.task4;

public class Matrix {
    private int lines;
    private int columns;
    private double matrix[][];

    Matrix(int lines, int columns)
    {
        this.matrix = new double[lines][columns];
    }



    public boolean matrixSizeVerification(double[][] matrix){
        if(matrix.length == lines && matrix[0].length == columns){
            return true;
        } else {
            return false;
        }
    }
    public void matrixAdding(double matrix1[][]){
        if(matrixSizeVerification(matrix1)!=false){
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] += matrix1[i][j];
                }
            }
        }
    }
    public void matrixNumberMultiplication(double a){
        for(int i = 0; i<lines;i++){
            for(int j = 0; j<columns;j++){
                matrix[i][j]*=a;
            }
        }
    }
}
