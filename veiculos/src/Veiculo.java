public class Veiculo {

    private String cor;
    private String placa;


    public static void ligar(){
        conferirCambio();
        System.out.println("Carro ligado");
    }

    private static void conferirCambio(){
        System.err.println("Confere Cambio");
    }

    public String getCor() {
        return cor;
    }

    public void setPlaca(String placaNova){
        this.placa = placaNova;
    }

    public String getPlaca(){
        return placa;
    }

    public void setCor(String novaCor) {
        this.cor = novaCor;
    }

    
}
