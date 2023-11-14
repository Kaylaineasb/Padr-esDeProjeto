package Factory;

public class Main {
    public static void main(String[] args) {
        Logistica logistica = new Logistica();
        logistica.planejarEntrega("caminhao");
        logistica.planejarEntrega("trem");
        logistica.planejarEntrega("navio");
    }
}
