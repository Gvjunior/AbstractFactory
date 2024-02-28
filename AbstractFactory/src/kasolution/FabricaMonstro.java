package kasolution;

public class FabricaMonstro implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem() {
        return new Monstro();
    }
}
