package Factory.Transportes;

public class Trem implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por transporte ferroviário");
    }
}
