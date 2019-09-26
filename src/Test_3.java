/**
 * total = 2+22+222+2222
 */
public class Test_3 {
    public static void main(String[] args) {
        double m=4;
        double n=2;
        double sum = 0;
        double total = 0;
        for (int i = 1; i <= m; i++) {
            sum +=  n *(Math.pow(10,(i-1)));
            total+= sum;
           System.out.println(sum);
        }
        System.out.println("总和为："+total);
    }
}
