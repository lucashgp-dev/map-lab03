package aux;

import figuras.Circulo;
import figuras.Quadrado;
import figuras.Retangulo;

public class Contas {

    public double areaRetangulo(Retangulo retangulo) {
        return retangulo.getAltura() * retangulo.getLargura();
    }

    public double areaQuadrado(Quadrado quadrado) {
        return Math.pow(quadrado.getLado(), 2);
    }

    public double areaCirculo(Circulo circulo) {
        return Math.PI * (Math.pow(circulo.getRaio(), 2));
    }

    public double perimetroRetangulo(Retangulo retangulo) {
        return (2 * retangulo.getAltura()) + (2 * retangulo.getAltura());
    }

    public double perimetroQuadrado(Quadrado quadrado) {
        return 4 * quadrado.getLado();
    }

    public double perimetroCirculo(Circulo circulo) {
        return (int) (3.14 * circulo.getRaio());
    }

}