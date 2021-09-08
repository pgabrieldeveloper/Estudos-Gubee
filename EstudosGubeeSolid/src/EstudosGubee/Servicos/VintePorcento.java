package EstudosGubee.Servicos;

import EstudosGubee.Model.EstudosGubeeFuncionario;
import EstudosGubee.Regras.RegraDeCalaculo;

public class VintePorcento implements RegraDeCalaculo {
    @Override
    public Double calcula(EstudosGubeeFuncionario funcionario) {
        return funcionario.getSalario() * 0.2;
    }
}
