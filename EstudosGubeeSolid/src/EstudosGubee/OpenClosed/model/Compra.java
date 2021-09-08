package EstudosGubee.OpenClosed.model;

public class Compra {
    private Double valor;
    private String cidade;

    public Double getValor() {
        return valor;
    }

    public String getCidade() {
        return cidade;
    }

    public Compra(Double valor, String cidade) {
        this.valor = valor;
        this.cidade = cidade;
    }
}
