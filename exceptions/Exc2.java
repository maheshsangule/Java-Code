package exceptions;

public class Exc2 {

    public static void main(String[] args) {

//        level1();

        try {
            level1();
        } catch (Exception e) {

            StackTraceElement[] stackTraceElement = e.getStackTrace();

            for (int i = 0; i < stackTraceElement.length; i++) {
                System.out.println(stackTraceElement[i]);
            }


            System.out.println(e.getMessage());
        }
    }

    public static void level3() {
        int[] arr = new int[10];
        arr[10] = 50;
    }

    public static void level2() {
        level3();
    }

    public static void level1() {
        level2();
    }
}
