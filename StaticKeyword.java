public class StaticKeyword {
    static int age; // 1st priorty
    static{           // 2nd prorty
        int age=99;
        System.out.println("Static Block  ");
    }
    static void diaplay(){
        System.out.println("sataic method, main method ke baad jab ham call karenge");
    }
    public static void main(String[] args) {
        System.out.println("Main method ");
        diaplay();
    }
}
