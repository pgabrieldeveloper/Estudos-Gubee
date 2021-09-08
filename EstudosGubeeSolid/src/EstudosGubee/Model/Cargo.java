package EstudosGubee.Model;

import EstudosGubee.Regras.RegraDeCalaculo;
import EstudosGubee.Servicos.DezPorcento;
import EstudosGubee.Servicos.VintePorcento;

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
