public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println("AmirHosein Hadian");
                    break;
                case 1:
                    System.out.println("Alireza Tajmirriahi");
                    break;
                case 2:
                    System.out.println("MohammadSadegh Salimi");
                    break;
                case 3:
                    System.out.println("partners forever :)");
            }
        }
        int y = 75;
        System.out.println(y);
        int x = 23;
        System.out.println(x + 2);
        whatsapp();
    }

    public static void whatsapp() {
        System.out.println("hello how are you?");
    }
    public static void telegram() {
        System.out.println("hi, thanks");
    }
}

class Person {
    public int ID;
    public String name;
}