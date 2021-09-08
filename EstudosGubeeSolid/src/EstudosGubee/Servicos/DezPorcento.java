package EstudosGubee.Servicos;

import EstudosGubee.Model.EstudosGubeeFuncionario;
import EstudosGubee.Regras.RegraDeCalaculo;

import java.math.BigDecimal;

public class DezPorcento implements RegraDeCalaculo {

    @Override
    public Double calcula(EstudosGubeeFuncionario funcionario) {
        return  funcionario.getSalario() * 0.1;
    }
}
