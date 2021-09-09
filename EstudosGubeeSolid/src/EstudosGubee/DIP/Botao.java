package EstudosGubee.DIP;

public class Botao {
    private Aparelho celular;

    public Botao(Aparelho celular) {
        this.celular = celular;
    }

    public void ligarAparalho() {
        celular.ligar();
    }

    public void desligarAparelho(){
        celular.desligar();
    }

}
