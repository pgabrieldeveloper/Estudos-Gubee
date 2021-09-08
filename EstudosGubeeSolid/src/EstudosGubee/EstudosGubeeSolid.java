package EstudosGubee;

import EstudosGubee.Model.Cargo;
import EstudosGubee.Model.EstudosGubeeFuncionario;

public class EstudosGubeeSolid {
    public static void main(String[] args) {
        System.out.println("Hello estudos Gubee");

        EstudosGubeeFuncionario funcionaraGabriel = new EstudosGubeeFuncionario("07058468745", "Paulo Gabriel Gomes Matias", 2000.0, Cargo.DESENVOLVEDOR);

        System.out.println(funcionaraGabriel.getSalario());
        System.out.println(funcionaraGabriel.CalculaSalario());
    }
}