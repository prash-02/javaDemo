class Demo {
    static void disp1(){
        System.out.println("Static disp1");
    }
    
    void disp2(){
        System.out.println("Non Static disp2");
    }
    
}
public class Static2 {
    public static void main(String[] args) {
        Demo.disp1();
        //Demo.disp2(); //  bcz it is non satatic
        Demo d= new Demo();
        d.disp1(); //The static method disp1() from the type Demo should be accessed in a static way just like above illstrated
        d.disp2();
    }
}
