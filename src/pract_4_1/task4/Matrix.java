package pract_4_1.task4;

public class Matrix {
    private int lines;
    private int columns;
    private double matrix[][];

    Matrix()
    {}
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
    public void matrixAdding(double matrix1[][], double matrix2[][]){
        if(matrixSizeVerification(matrix1)!=false){
        double[][] matrix3 = new double[lines][columns];
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            returnMatrix(matrix3);
        }
    }
    public void matrixNumberMultiplication(double a){
        for(int i = 0; i<lines;i++){
            for(int j = 0; j<columns;j++){
                matrix[i][j]*=a;
            }
        }
    }
    public void returnMatrix(double[][] matrix)
    {
        for(int i = 0 ; i<matrix.length;i++)
        {
            for(int j = 0; j<matrix[0].length;j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}
