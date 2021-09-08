package EstudosGubee.OpenClosed.servicos;

import EstudosGubee.OpenClosed.model.Compra;
import EstudosGubee.OpenClosed.regras.ServicoDeEntrega;
import EstudosGubee.OpenClosed.regras.ServicodePreco;

public class CalculadoraDePrecos implements ServicodePreco {
    private Compra compra;
    private ServicoDeEntrega frete;
    public CalculadoraDePrecos(Compra compra, ServicoDeEntrega frete) {
        this.compra = compra;
        this.frete = frete;
    }

    public Double calculaPreco() {
        return compra.getValor() + frete.para(compra.getCidade());
    }


}
