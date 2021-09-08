package EstudosGubee.singleResponsibility.Servicos;

import EstudosGubee.singleResponsibility.Model.EstudosGubeeFuncionario;
import EstudosGubee.singleResponsibility.Regras.RegraDeCalaculo;

public class VintePorcento implements RegraDeCalaculo {
    @Override
    public Double calcula(EstudosGubeeFuncionario funcionario) {
        return funcionario.getSalario() * 0.2;
    }
}
