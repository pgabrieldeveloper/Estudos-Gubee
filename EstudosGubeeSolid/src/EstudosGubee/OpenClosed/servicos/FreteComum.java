package EstudosGubee.OpenClosed.servicos;

import EstudosGubee.OpenClosed.regras.ServicoDeEntrega;

public class FreteComum implements ServicoDeEntrega {

    public Double para(String cidade) {
        if(cidade.equals("SERGIPE")){
            return 30.0;
        }else{return 50.0;}
    }
}