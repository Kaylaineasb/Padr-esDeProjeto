package Builder;

public class Computer {
    private String processador;
    private int memoryGigabytes;
    private int storageGigabytes;
    private String graphicsCard;
    //contrutor privado para forçar a criação por meio do builder
    private Computer(){}

    public String getProcessador() {
        return processador;
    }

    public int getMemoryGigabytes() {
        return memoryGigabytes;
    }

    public int getStorageGigabytes() {
        return storageGigabytes;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processador='" + processador + '\'' +
                ", memoryGigabytes=" + memoryGigabytes +
                ", storageGigabytes=" + storageGigabytes +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }

    public static class Builder{
        private Computer computer;
        public Builder(){
            this.computer= new Computer();
        }
        public Builder withProcessador(String processador){
            computer.processador = processador;
            return this;
        }
        public Builder withMemory(int memoryGigabytes){
            computer.memoryGigabytes = memoryGigabytes;
            return this;
        }
        public Builder withStorage(int storageGigabytes){
            computer.storageGigabytes = storageGigabytes;
            return this;
        }
        public Builder withGraphicsCard(String graphicsCard){
            computer.graphicsCard = graphicsCard;
            return this;
        }
        public Computer build(){
            return computer;
        }
    }
}
