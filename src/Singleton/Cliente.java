package Singleton;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Se você ver o mesmo valor, então o singleton foi usado."+
                "\n"+"Se você ver valores diferentes, então dois singleton foram criados."+
                "\n\n"+"Resultado: "+"\n");
        Singleton singleton = Singleton.getInstance("Jogador 1");
        Singleton anotherSingleton = Singleton.getInstance("Jogador 2");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
