package Factory.Transportes;

public class Navio implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por transporte maritimo");
    }
}
