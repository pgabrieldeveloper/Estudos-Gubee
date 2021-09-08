package EstudosGubee.singleResponsibility.Model;

import EstudosGubee.singleResponsibility.Regras.RegraDeCalaculo;
import EstudosGubee.singleResponsibility.Servicos.DezPorcento;
import EstudosGubee.singleResponsibility.Servicos.VintePorcento;

public enum Cargo {
    DESENVOLVEDOR(new DezPorcento()),
    ANALISTA(new VintePorcento()),
    DBA(new VintePorcento());

    private RegraDeCalaculo regra;

    Cargo(RegraDeCalaculo regra){
        this.regra = regra;
    }

    public RegraDeCalaculo getRegra() {
        return regra;
    }
}
