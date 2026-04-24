public abstract class Veiculo {
    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        setPlaca(placa);
        setCapacidade(capacidade);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.trim().isEmpty()) {
            throw new IllegalArgumentException("placa nao pode ser nula ou vazia");
        }
        this.placa = placa.trim();
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("capacidade deve ser positiva");
        }
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return String.format("%s{placa='%s', capacidade=%.2f}", getClass().getSimpleName(), placa, capacidade);
    }
}

