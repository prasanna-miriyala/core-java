public class SwapingNums {
    public static void main(String[] args) {
        int a = 10, b = 20,temp=0;
        System.out.println("Before swapping"+a +" "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping"+a+" "+b);
    }
}
