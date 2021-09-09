package EstudosGubee.DIP;

public class Celular implements Aparelho {
    private Boolean isLigado;
    @Override
    public void ligar() {
        System.out.println("Ligando Aparalho");
        this.isLigado = true;
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Aparelho");
        this.isLigado = false;
    }
}
