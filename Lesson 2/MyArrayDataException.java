public class MyArrayDataException extends Exception{
    private int number1;
    private int number2;

    public MyArrayDataException(String message,int size1,int size2){
        super(message);
        number1 = size1;
        number2 = size2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }
}
