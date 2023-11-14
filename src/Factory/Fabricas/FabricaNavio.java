package Factory.Fabricas;

import Factory.Transportes.Navio;
import Factory.Transportes.Transporte;

public class FabricaNavio implements FabricaTransporte{
    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }
}
