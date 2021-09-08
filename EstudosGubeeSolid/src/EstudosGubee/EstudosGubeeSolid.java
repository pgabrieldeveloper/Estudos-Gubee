package EstudosGubee;

import EstudosGubee.OpenClosed.model.Compra;
import EstudosGubee.OpenClosed.servicos.CalculadoraDePrecos;
import EstudosGubee.OpenClosed.servicos.FreteComum;
import EstudosGubee.singleResponsibility.Model.Cargo;
import EstudosGubee.singleResponsibility.Model.EstudosGubeeFuncionario;

public class EstudosGubeeSolid {
    public static void main(String[] args) {
        System.out.println("Hello estudos Gubee");

        EstudosGubeeFuncionario funcionaraGabriel = new EstudosGubeeFuncionario("07058468745", "Paulo Gabriel Gomes Matias", 2000.0, Cargo.DESENVOLVEDOR);
        System.out.println(funcionaraGabriel.getSalario());
        System.out.println(funcionaraGabriel.CalcularDescontoSalrio());
        System.out.println("----------------------------------------------------------");
        Compra compra = new Compra(5000.0,"SERGIPE");
        CalculadoraDePrecos calculaPrecoCompra = new CalculadoraDePrecos(compra, new FreteComum());
        System.out.println(calculaPrecoCompra.calculaPreco());
        System.out.println("----------------------------------------------------------");

    }
}