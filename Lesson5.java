package src;

public class Lesson5 {
    static final int size = 10000000;
    static final int h = size / 2;
    private static float[] arr = new float[size];

    public static void main(String[] args){
        for (int i = 0;i < size; i++){
            arr[i] = 1;
        }

        One(arr);
        Two(arr);

    }

    public static void One(float[] arr){
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void Two(float[] arr){
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        NameRunnable rn = new NameRunnable();

        Thread one = new Thread(rn){
            public void run(){
                for (int i = 0; i < a1.length; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        };

        Thread two = new Thread(rn){
            public void run(){
                for (int i = 0; i < a2.length; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        };

        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        one.start();
        two.start();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println(System.currentTimeMillis() - a);
    }


}
