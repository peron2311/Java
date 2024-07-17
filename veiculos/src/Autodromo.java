public class Autodromo {

    public static void main(String[] args) {
        Veiculo carro = new Veiculo();

        carro.ligar();
        

        carro.setCor("verde");

        String cor = carro.getCor();

        System.out.println(cor);

    }

}
