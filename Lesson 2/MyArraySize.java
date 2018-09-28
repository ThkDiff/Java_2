import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MyArraySize {

    public static void getArray(String[][] array) throws MyArraySizeException,MyArrayDataException {
        int result = 0;
        if ((array.length != 4) || (array[0].length != 4)) throw new
                MyArraySizeException("Size is not match the rules",array.length,array[0].length);
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[0].length; j++)
                array[i][j] = "123";
         array[1][3] = "Hi";
        for (int i = 0;i < array.length;i++) {
            for (int j = 0; j < array[0].length; j++) {
                char[] ch = array[i][j].toCharArray();
                for (char c : ch) {
                    if (c >= '0' && c <= '9')
                        result += (int) c;
                    else
                        throw new MyArrayDataException("String is not match the rules", i, j);
                }
            }

        }
        System.out.println(result);
    }


}

