public class Factorial {
    public static void main(String ags[]) {
        int num = 4;
        long factorial=1;
        for (int i = 1; i <= num; i++) {

         factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}