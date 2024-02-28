package kasolution;

public class ExemploAbstractFactory {
    public static void main(String[] args) {
        FabricaPersonagem fabricaHeroi = new FabricaHeroi();
        Personagem heroi = fabricaHeroi.criarPersonagem();
        heroi.executarAcao(); // Saída: Herói executando ação especial!

        FabricaPersonagem fabricaMonstro = new FabricaMonstro();
        Personagem monstro = fabricaMonstro.criarPersonagem();
        monstro.executarAcao(); // Saída: Monstro executando ação assustadora!
    }
}
