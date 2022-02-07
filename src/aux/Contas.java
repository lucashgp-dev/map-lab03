package aux;

import figuras.Circulo;
import figuras.Quadrado;
import figuras.Retangulo;

public class Contas {

    public double areaRetangulo(Retangulo retangulo) {
        return retangulo.getAltura() * retangulo.getLargura();
    }

    public double areaQuadrado(Quadrado quadrado) {
        return (quadrado.getLado() * 2);
    }

    public double areaCirculo(Circulo circulo) {
        return ((2 * 3.14 * circulo.getRaio()));
    }

    public double perimetroRetangulo(Retangulo retangulo) {
        return (2 * retangulo.getAltura()) + (2 * retangulo.getLargura());
    }

    public double perimetroQuadrado(Quadrado quadrado) {
        return 4 * quadrado.getLado();
    }

    public double perimetroCirculo(Circulo circulo) {
        return (int) (3.14 * circulo.getRaio());
    }

}