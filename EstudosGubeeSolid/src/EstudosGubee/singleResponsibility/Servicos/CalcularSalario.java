package EstudosGubee.singleResponsibility.Servicos;


import EstudosGubee.singleResponsibility.Model.EstudosGubeeFuncionario;

public class CalcularSalario  {
    public double calcula(EstudosGubeeFuncionario funcionario) {
        return funcionario.CalcularDescontoSalrio();
    }
}


