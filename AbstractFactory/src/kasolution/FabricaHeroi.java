package kasolution;

public class FabricaHeroi implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem() {
        return new Heroi();
    }
}
