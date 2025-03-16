class TypeCasting{
    public static void main(String[] args) {
        int a=3;
        double b;
        b=a;                        //Implicit Casting
        System.out.println(b);
        double b1=63.3;
        int a1;
        a1=(int)b1;                  //Explicit Casting
        System.out.println(a1);
        double b2=23;
        int a2;
        a2=(int)b2;                   //Explicit Casting(where we have define)
        System.out.println(a2);
    }
}