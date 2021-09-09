package EstudosGubee.liskov.model;

public class Retangulo {
    private Double altura;
    private Double largura;


    public Retangulo(Double altura, Double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Double calcularArea () {
        return altura * largura;
    }
}
