package Prototype;

public class Main {
    public static void main(String[] args) {
        FiestaPrototype protopioFiesta = new FiestaPrototype();

        CarroPrototype fiestaNovo = protopioFiesta.clonar();
        fiestaNovo.setValorCompra(27900.0);
        CarroPrototype fiestaUsado = protopioFiesta.clonar();
        fiestaUsado.setValorCompra(21000.0);

        System.out.println(fiestaNovo.exibirInfo());
        System.out.println(fiestaUsado.exibirInfo());
    }

}
