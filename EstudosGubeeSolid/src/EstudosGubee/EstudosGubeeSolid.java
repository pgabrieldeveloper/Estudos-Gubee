package EstudosGubee;

import EstudosGubee.OpenClosed.model.Compra;
import EstudosGubee.OpenClosed.servicos.CalculadoraDePrecos;
import EstudosGubee.OpenClosed.servicos.FreteComum;
import EstudosGubee.liskov.model.Client;
import EstudosGubee.liskov.model.ClientVip;
import EstudosGubee.liskov.model.Quadrado;
import EstudosGubee.liskov.model.Retangulo;
import EstudosGubee.singleResponsibility.Model.Cargo;
import EstudosGubee.singleResponsibility.Model.EstudosGubeeFuncionario;

public class EstudosGubeeSolid {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello estudos Gubee");

        EstudosGubeeFuncionario funcionaraGabriel = new EstudosGubeeFuncionario("07058468745", "Paulo Gabriel Gomes Matias", 2000.0, Cargo.DESENVOLVEDOR);
        System.out.println(funcionaraGabriel.getSalario());
        System.out.println(funcionaraGabriel.CalcularDescontoSalrio());
        System.out.println("----------------------------------------------------------");
        Compra compra = new Compra(5000.0,"SERGIPE");

        CalculadoraDePrecos calculaPrecoCompra = new CalculadoraDePrecos(compra, new FreteComum());
        System.out.println(calculaPrecoCompra.calculaPreco());
        System.out.println("----------------------------------------------------------");
        /*
           *“Se para cada objeto o1 do tipo S há um objeto o2 do
           * tipo T de forma que, para todos os programas P
           * definidos em termos de T, o comportamento de P
           *  é inalterado quando o1 é substituído por o2
           * então S é um subtipo de T”

            Em outras palavras, toda e qualquer classe derivada deve poder ser usada como se fosse a classe base.


         */
        Retangulo retangulo = new Retangulo(5.0,10.0);
        System.out.println("area do retangulo: "+ retangulo.calcularArea());
        /*
            No exemplo abaixo do quadrado quebra o principio de liskov uma ves que seus lados precisa ser iguais para funcionar de formaa correta
            aa uma implementação na classe (com isso ela acaba não sendo usada como sua classe base)
         */
        Quadrado quadrado1 = new Quadrado(5.0, 5.0);
        System.out.println("area do quadrado1: "+ quadrado1.calcularArea());

//        Quadrado quadrado2 = new Quadrado(5.0, 10.0);
//        System.out.println("area do quadrado2: "+ quadrado2.calcularArea());
//        System.out.println("----------------------------------------------------------");

        /*
            No exemplo abaiaxo não fera o principio de liskov pois o clientVip pode ser usado como sua claasse base
         */
        Client client = new Client("Paulo", "Av a 571");
        ClientVip clientVip = new ClientVip("Paulo Gabriel ", "Av a 571");
        client.pagarConta();
        clientVip.pagarConta();
        System.out.println("----------------------------------------------------------");




    }
}