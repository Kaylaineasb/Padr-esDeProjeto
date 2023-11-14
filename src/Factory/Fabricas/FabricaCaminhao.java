package Factory.Fabricas;

import Factory.Transportes.Caminhao;
import Factory.Transportes.Transporte;

public class FabricaCaminhao implements FabricaTransporte {
    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }
}
