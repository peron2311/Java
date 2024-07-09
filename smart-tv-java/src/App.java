public class App {
    public static void main(String[] args) throws Exception {

        SmartTV comandos = new SmartTV();
        comandos.ligar();
        comandos.desligar();
        comandos.ligar();
        System.out.println(comandos.ligada);
    
        System.out.println("Hello, World!");
    }
}
