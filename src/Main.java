public class Main {
    public static void main(String[] args) {
        try {
            Calc calc= new Calc("2 % 4");
            System.out.println(calc.calc());
        } catch (Exception e) {
            System.out.println("OOps");
        }

    }
}