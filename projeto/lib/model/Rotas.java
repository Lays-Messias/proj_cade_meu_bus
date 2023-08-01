public class Rotas {
    private String origem;
    private String destino;
    private double distancia;
    private int tempoDePercurso;

    //Construtor
    public Rotas(String origem, String destino, double distancia, int tempoDePercurso) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.tempoDePercurso = tempoDePercurso;
    }

    // Gete Set
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getTempoDePercurso() {
        return tempoDePercurso;
    }

    public void setTempoDePercurso(int tempoDePercurso) {
        this.tempoDePercurso = tempoDePercurso;
    }
}