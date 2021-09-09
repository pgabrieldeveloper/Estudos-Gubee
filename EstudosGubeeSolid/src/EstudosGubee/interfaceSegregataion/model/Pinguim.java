package EstudosGubee.interfaceSegregataion.model;

import EstudosGubee.interfaceSegregataion.interfaces.Aves;

public class Pinguim implements Aves {


    @Override
    public void porOvos() {
        System.out.println("pondo ovos");
    }

    @Override
    public  void voar() {

    }

    @Override
    public void baterAsas() {
        System.out.println("Batendo asas");
    }
}
