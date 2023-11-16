package Builder;

public class Cliente {
    public static void main(String[] args) {
        //Criação do builder
        Computer.Builder builder = new Computer.Builder();

        //Configuração do computer usando o builder
        Computer computer = builder
                .withProcessador("Intel i7")
                .withMemory(16)
                .withStorage(512)
                .withGraphicsCard("NVIDIA GeFore RTX 3070")
                .build();
        //exibição do computer construido
        System.out.println(computer);
    }
}
