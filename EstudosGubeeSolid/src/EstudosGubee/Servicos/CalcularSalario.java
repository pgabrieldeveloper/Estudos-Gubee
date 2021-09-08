package EstudosGubee.Servicos;


import EstudosGubee.Model.Cargo;
import EstudosGubee.Model.EstudosGubeeFuncionario;

public class CalcularSalario  {
    public double calcula(EstudosGubeeFuncionario funcionario) {
        return funcionario.getSalario() * 0.1;
    }
}
