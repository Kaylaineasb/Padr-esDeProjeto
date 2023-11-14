package Factory.Fabricas;

import Factory.Transportes.Transporte;
import Factory.Transportes.Trem;

public class FabricaTrem implements FabricaTransporte{
    @Override
    public Transporte criarTransporte() {
        return new Trem();
    }
}
