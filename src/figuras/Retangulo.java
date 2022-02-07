package figuras;

import aux.TipoFigura;

public class Retangulo {

    private TipoFigura tipo;
    private double altura;
    private double largura;

    public Retangulo(TipoFigura tipo, double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public TipoFigura getTipo() {
        return tipo;
    }

    public void setTipo(TipoFigura tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "O retângulo criado tem altura de tamanho: " + getAltura() +
                " e largura de tamanho: " + getLargura() + ". ";
    }
}
