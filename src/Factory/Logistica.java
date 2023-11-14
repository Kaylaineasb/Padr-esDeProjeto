package Factory;

import Factory.Fabricas.FabricaCaminhao;
import Factory.Fabricas.FabricaNavio;
import Factory.Fabricas.FabricaTransporte;
import Factory.Fabricas.FabricaTrem;
import Factory.Transportes.Transporte;

public class Logistica {
    public void planejarEntrega(String modo){
        FabricaTransporte fabrica;
        if(modo.equalsIgnoreCase("caminhao")){
            fabrica = new FabricaCaminhao();
        } else if (modo.equalsIgnoreCase("navio")) {
            fabrica = new FabricaNavio();
        } else if (modo.equalsIgnoreCase("trem")) {
            fabrica = new FabricaTrem();
        }else {
            throw new IllegalArgumentException(("Modo de transporte inválido"));
        }
        Transporte transporte = fabrica.criarTransporte();
        transporte.entregar();
    }
}
