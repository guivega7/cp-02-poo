public class Rota {
    private PacoteEntrega pacote;
    private Veiculo veiculo;

    public Rota(PacoteEntrega pacote, Veiculo veiculo) {
        if (pacote == null || veiculo == null) {
            throw new IllegalArgumentException("pacote e veiculo nao podem ser nulos");
        }
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void entregar() {
        System.out.println("Entregando " + pacote.getCodigo() + " com " + veiculo.getClass().getSimpleName() + " " + veiculo.getPlaca());
    }

    @Override
    public String toString() {
        return String.format("Rota{pacote=%s, veiculo=%s}", pacote, veiculo);
    }
}

