package Prototype;

public class FiestaPrototype extends CarroPrototype{
    public FiestaPrototype(FiestaPrototype fiestaPrototype){
        this.setValorCompra(fiestaPrototype.getValorCompra());
    }
    public FiestaPrototype(){
        this.setValorCompra(0.0);
    }
    @Override
    public String exibirInfo(){
        return "Modelo: Fiesta\nMontadora: Ford\n"+"Valor:R$"+getValorCompra();
    }
    @Override
    public CarroPrototype clonar(){
        return new FiestaPrototype(this);
    }
}
