package Factory.Transportes;

public class Caminhao implements Transporte {
    @Override
    public void entregar(){
        System.out.println("Entrega por caminhão");
    }
}
