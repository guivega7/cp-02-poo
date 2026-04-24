public class PacoteEntrega {
    private String codigo;
    private double peso;
    private String status;

    public PacoteEntrega(String codigo, double peso, String status) {
        setCodigo(codigo);
        setPeso(peso);
        setStatus(status);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("codigo nao pode ser nulo ou vazio");
        }
        this.codigo = codigo.trim();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("peso deve ser positivo");
        }
        this.peso = peso;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = (status == null) ? "" : status.trim();
    }

    @Override
    public String toString() {
        return String.format("PacoteEntrega{codigo='%s', peso=%.2f, status='%s'}", codigo, peso, status);
    }
}

