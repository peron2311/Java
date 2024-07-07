public class App {
    public static void main(String[] args) throws Exception {
        int a = 1;
        int b=2;

        int calcular = calcular(a,b);

        System.out.println(calcular);
    }
    
    public static int calcular (int a, int b) {
        return a+b+5;
    }

}
