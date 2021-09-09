package EstudosGubee.liskov.model;

public class Quadrado extends Retangulo {

    public Quadrado(Double altura, Double largura) throws Exception {
        super(altura, largura);
        if(!altura.equals(largura)){
            throw new Exception("Os lados do Quado precisam ser iguais");
        }
    }


}
