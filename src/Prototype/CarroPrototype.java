package Prototype;

public abstract class CarroPrototype {
    private double valorCompra;
    public abstract String exibirInfo();
    public abstract CarroPrototype clonar();

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
}