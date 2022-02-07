package figuras;

import aux.TipoFigura;

public class Circulo {

    private TipoFigura tipo;
    private double raio;

    public Circulo(TipoFigura tipo, double raio) {
        this.tipo = tipo;
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public TipoFigura getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "O circulo criado tem raio de tamanho: " + getRaio() + ". ";

    }


}
