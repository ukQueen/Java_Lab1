package ru.spbstu.telematics.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import ru.spbstu.telematics.java.App;


public class AppTest 
    extends TestCase
{
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testSnakeIntFilled(){
        App a = new App();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[][] matrix = {
            {1,2,3},
            {6,5,4},
            {7,8,9},
        };
        int [][] resultMatrix = a.snakeInt(arr);
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                assertEquals(matrix[i][j], resultMatrix[i][j]);
            }
        }
    }

    public void testSnakeIntUnfilled(){
        App a = new App();
        int [] arr = {1,2,3,4,5,6,7};
        int[][] matrix = {
            {1,2,3},
            {6,5,4},
            {7,0,0},
        };
        int [][] resultMatrix = a.snakeInt(arr);
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                assertEquals(matrix[i][j], resultMatrix[i][j]);
            }
        }
    }


    public void testSnakeDoubleFilled(){
        App a = new App();
        double [] arr = {1,2,3,4,5,6,7,8,9};
        double [][] matrix = {
            {1.0,2.0,3.0},
            {6.0,5.0,4.0},
            {7.0,8.0,9.0},
        };
        double [][] resultMatrix = a.snakeDouble(arr);
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                assertEquals(matrix[i][j], resultMatrix[i][j]);
            }
        }
    }

    public void testSnakeDoubleUnfilled(){
        App a = new App();
        double [] arr = {1,2,3,4,5,6};
        double [][] matrix = {
            {1.0,2.0,3.0},
            {6.0,5.0,4.0},
            {0.0,0.0,0.0},
        };
        double [][] resultMatrix = a.snakeDouble(arr);
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                assertEquals(matrix[i][j], resultMatrix[i][j]);
            }
        }
    }
    

    public void testSnakeCharFilled(){
        App a = new App();
        char [] arr = {'a','b','c','d','e','f','g','h','i'};
        char [][] matrix = {
            {'a','b','c'},
            {'f','e','d'},
            {'g','h','i'},
        };
        char [][] resultMatrix = a.snakeChar(arr);
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                assertEquals(matrix[i][j], resultMatrix[i][j]);
            }
        }
    }

    public void testSnakeCharUnfilled(){
        App a = new App();
        char [] arr = {'a','b','c','d','e','f','g'};
        char [][] matrix = {
            {'a','b','c'},
            {'f','e','d'},
            {'g','\0','\0'},
        };
        char [][] resultMatrix = a.snakeChar(arr);
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                assertEquals(matrix[i][j], resultMatrix[i][j]);
            }
        }
    }
}
