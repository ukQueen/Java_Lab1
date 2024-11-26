package ru.spbstu.telematics.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import ru.spbstu.telematics.java.App;

/**
 * Unit test for simple App.
 */
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
        a.printArrayInt(arr);
        int [][] matrix = a.snakeInt(arr);
        a.printMatrixInt(matrix);
    }

    public void testSnakeIntUnfilled(){
        App a = new App();
        int [] arr = {1,2,3,4,5,6,7};
        a.printArrayInt(arr);
        int [][] matrix = a.snakeInt(arr);
        a.printMatrixInt(matrix);
    }


    public void testSnakeDoubleFilled(){
        App a = new App();
        double [] arr = {1,2,3,4,5,6,7,8,9};
        a.printArrayDouble(arr);
        double [][] matrix = a.snakeDouble(arr);
        a.printMatrixDouble(matrix);
    }

    public void testSnakeDoubleUnfilled(){
        App a = new App();
        double [] arr = {1,2,3,4,5,6};
        a.printArrayDouble(arr);
        double [][] matrix = a.snakeDouble(arr);        
        a.printMatrixDouble(matrix);
    }
    

    public void testSnakeCharFilled(){
        App a = new App();
        char [] arr = {'a','b','c','d','e','f','g','h','i'};
        a.printArrayChar(arr);
        char [][] matrix = a.snakeChar(arr);
        a.printMatrixChar(matrix);
    }

    public void testSnakeCharUnfilled(){
        App a = new App();
        char [] arr = {'a','b','c','d','e','f','g'};
        a.printArrayChar(arr);
        char [][] matrix = a.snakeChar(arr);
        a.printMatrixChar(matrix);
    }
}
