package EstudosGubee.singleResponsibility.Servicos;

import EstudosGubee.singleResponsibility.Model.EstudosGubeeFuncionario;
import EstudosGubee.singleResponsibility.Regras.RegraDeCalaculo;

public class DezPorcento implements RegraDeCalaculo {

    @Override
    public Double calcula(EstudosGubeeFuncionario funcionario) {
        return  funcionario.getSalario() * 0.1;
    }
}
