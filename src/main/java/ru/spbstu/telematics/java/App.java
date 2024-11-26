package ru.spbstu.telematics.java;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Выберите тип данных:");
            System.out.println("[1] - int");
            System.out.println("[2] - double");
            System.out.println("[3] - char");
            System.out.println("[0] - выход");
            int choice = scan.nextInt();
            scan.nextLine();
            if (choice >= 0 && choice <= 3){
                if (choice == 0){
                    break;
                }
                else{
                    while(true){
                        System.out.println("Введите данные для массива в одну строку через пробел, для возврата назад введите '0'");
                        int [] arrInt = new int[0];
                        double [] arrDouble = new double[0];
                        char [] arrChar = new char[0];
                        boolean flag = true;
                        String str = scan.nextLine();
                        if (str.equals("0")){
                            break;
                        }
                        if (choice == 3){
                            arrChar = str.replace(" ", "").toCharArray();
                        }
                        else{
                            String [] data = str.split(" ");
                            for (String elem: data) {
                                try {
                                    int numberInt;
                                    double numberDouble;
                                    switch (choice) {
                                        case 1:
                                            numberInt = Integer.parseInt(elem);
                                            int[] newNumbersInt = new int[arrInt.length + 1];
                                            System.arraycopy(arrInt, 0, newNumbersInt, 0, arrInt.length);
                                            arrInt = newNumbersInt;
                                            arrInt[newNumbersInt.length - 1] = numberInt;
                                            break;
                                        case 2:
                                            numberDouble = Double.parseDouble(elem);
                                            double[] newNumbersDouble = new double[arrDouble.length + 1];
                                            System.arraycopy(arrDouble, 0, newNumbersDouble, 0, arrDouble.length);
                                            arrDouble = newNumbersDouble;
                                            arrDouble[newNumbersDouble.length - 1] = numberDouble;
                                            break;
                                    }

                                } catch (NumberFormatException e) {
                                    System.out.println("Ошибка ввода, попробуйте снова");
                                    flag = false;
                                    break;
                                }

                            }
                        }
                        if(flag){
                            switch(choice) {
                                case 1:
                                    printMatrixInt(snakeInt(arrInt));
                                    break;
                                case 2:
                                    printMatrixDouble(snakeDouble(arrDouble));
                                    break;
                                case 3:
                                    printMatrixChar(snakeChar(arrChar));
                                    break;
                            }
                        }
                    }
                }
            }
        }
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


    public static void printMatrixInt(int [][] matrix) {
        System.out.println("Matrix:");
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void printMatrixDouble(double [][] matrix) {
        System.out.println("Matrix:");
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void printMatrixChar(char [][] matrix) {
        System.out.println("Matrix:");
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
