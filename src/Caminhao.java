public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, double capacidade, int eixos) {
        super(placa, capacidade);
        setEixos(eixos);
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        if (eixos <= 0) {
            throw new IllegalArgumentException("eixos deve ser positivo");
        }
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return String.format("%s{placa='%s', capacidade=%.2f, eixos=%d}", getClass().getSimpleName(), getPlaca(), getCapacidade(), eixos);
    }
}

