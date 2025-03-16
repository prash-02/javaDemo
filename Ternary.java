public class Ternary {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int c=4;
        int d1=4;
        int res=(a<b)?(b<c?a:b):(c<a?c:d1);
        System.out.println(res);

        String result=(a==b)?"yes":"no";
        System.out.println(result);
        int c1=3;
        int d=3;
        int result1=(c1==d)?c1:a;
        System.out.println(result1);
    }
}
