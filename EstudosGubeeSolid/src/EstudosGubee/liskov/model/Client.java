package EstudosGubee.liskov.model;

public class Client {
    private String nome;
    private String Endereco;

    public Client(String nome, String endereco) {
        this.nome = nome;
        Endereco = endereco;
    }

    public void pagarConta() {
        System.out.println("pagar Conta");
    }

}
