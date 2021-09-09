package EstudosGubee.interfaceSegregataion.model;

import EstudosGubee.interfaceSegregataion.interfaces.Aves;

public class Pardal implements Aves {
    @Override
    public void porOvos() {
        System.out.println("Pondo OVOS");
    }

    @Override
    public void voar() {
        System.out.println("Voando");
    }

    @Override
    public void baterAsas() {
        System.out.println("Batendo Aves");
    }
}
