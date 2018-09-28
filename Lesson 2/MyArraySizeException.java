public class MyArraySizeException extends Exception {
    private int number;
    private int number2;

    public MyArraySizeException(String message,int size1,int size2){
        super(message);
        number = size1;
        number2 = size2;

    }

    public int getNumber() {
        return number;
    }

    public int getNumber2() {
        return number2;
    }
}
