package ru.spbstu.telematics.java;

public class App 
{
    public static void main( String[] args ) {
        System.out.println("hello");
        
        int [][] matrix = snakeInt(new int[]{1,2,3,4,5,6,7,8,9});
        printMatrixInt(matrix);
    }

    public static int[][] snakeInt (int[] arr) {
        int lenOfArr = arr.length;
        int n = (int) Math.ceil(Math.sqrt(lenOfArr)); //находится корень от длины массива, затем округляется вверх до целого числа
        int [][] matrix = new int[n][n];
        for (int i = 0; i < n; i++){
            if ((i & 1)==1){
                for (int j = n - 1; j >= 0 ; j-- ){
                    int elem;
                    if (arr.length > 0){
                        elem = arr[0];
                        arr = removeFirsElemInt(arr);
                        matrix[i][j] = elem;
                    }
                    else break;
                }
            }
            else {
                for (int j = 0; j < n ; j++){
                    int elem;
                    if (arr.length > 0){
                        elem = arr[0];
                        arr = removeFirsElemInt(arr);
                        matrix[i][j] = elem;
                    }
                    else break;
                }
            } 
        }
        return matrix;
    }

    public static int[] removeFirsElemInt(int[] arr) {
        int[] newArr =  new int[arr.length - 1];
        System.arraycopy(arr, 1, newArr, 0, newArr.length);
        return newArr;
    }



    public static double[][] snakeDouble (double[] arr) {
        int lenOfArr = arr.length;
        int n = (int) Math.ceil(Math.sqrt(lenOfArr)); //находится корень от длины массива, затем округляется вверх до целого числа
        double [][] matrix = new double[n][n];
        for (int i = 0; i < n; i++){
            if ((i & 1)==1){
                for (int j = n - 1; j >= 0 ; j-- ){
                    double elem;
                    if (arr.length > 0){
                        elem = arr[0];
                        arr = removeFirsElemDouble(arr);
                        matrix[i][j] = elem;
                    }
                    else break;
                }
            }
            else {
                for (int j = 0; j < n ; j++){
                    double elem;
                    if (arr.length > 0){
                        elem = arr[0];
                        arr = removeFirsElemDouble(arr);
                        matrix[i][j] = elem;
                    }
                    else break;
                }
            } 
        }
        return matrix;
    }

    public static double[] removeFirsElemDouble(double[] arr) {
        double[] newArr =  new double[arr.length - 1];
        System.arraycopy(arr, 1, newArr, 0, newArr.length);
        return newArr;
    }



    public static char[][] snakeChar (char[] arr) {
        int lenOfArr = arr.length;
        int n = (int) Math.ceil(Math.sqrt(lenOfArr)); //находится корень от длины массива, затем округляется вверх до целого числа
        char [][] matrix = new char[n][n];
        for (int i = 0; i < n; i++){
            if ((i & 1)==1){
                for (int j = n - 1; j >= 0 ; j-- ){
                    char elem;
                    if (arr.length > 0){
                        elem = arr[0];
                        arr = removeFirsElemChar(arr);
                        matrix[i][j] = elem;
                    }
                    else break;
                }
            }
            else {
                for (int j = 0; j < n ; j++){
                    char elem;
                    if (arr.length > 0){
                        elem = arr[0];
                        arr = removeFirsElemChar(arr);
                        matrix[i][j] = elem;
                    }
                    else break;
                }
            } 
        }
        return matrix;
    }

    public static char[] removeFirsElemChar(char[] arr) {
        char[] newArr =  new char[arr.length - 1];
        System.arraycopy(arr, 1, newArr, 0, newArr.length);
        return newArr;
    }    
}
