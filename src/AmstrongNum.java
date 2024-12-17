public class AmstrongNum {
    public static void main(String[] args) {
        int num=153,total=0;
        while(num>0){
           int n=num%10;
           total=total+n*n*n;
           num=num/10;

        }
        System.out.println(num);
    }

}
