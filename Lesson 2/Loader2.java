public class Loader2 {
    public static  void main(String[] args) {
        try {
         String[][] arr = new String[4][4];
            MyArraySize.getArray(arr);
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
            System.out.println("[" + ex.getNumber() + "]" + "[" + ex.getNumber2() + "]");
        }catch(MyArrayDataException ex){
            System.out.println(ex.getMessage());
            System.out.println("[" + ex.getNumber1() + "]" + "[" + ex.getNumber2() + "]");
        }

    }
}
