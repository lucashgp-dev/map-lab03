package figuras;

import aux.TipoFigura;

public class Quadrado {
    private TipoFigura tipo;
    private double lado;

    public Quadrado(TipoFigura tipo, double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    @Override
    public String toString() {
        return "O quadrado criado tem lados de tamanho: " + getLado() + ". ";
    }
}
