import aux.FigurasG;
import aux.TipoFigura;
import figuras.Circulo;
import figuras.Quadrado;
import figuras.Retangulo;

public class Main {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(TipoFigura.RETANGULO, 10, 5);
        Quadrado quadrado = new Quadrado(TipoFigura.QUADRADO, 7);
        Circulo circulo = new Circulo(TipoFigura.CIRCULO, 25);
        

        FigurasG figuras = new FigurasG(retangulo, quadrado, circulo);

        System.out.println("\n----------- Áreas das Figuras -------------\n");

        figuras.areaFiguras(TipoFigura.QUADRADO);
        figuras.areaFiguras(TipoFigura.CIRCULO);
        figuras.areaFiguras(TipoFigura.RETANGULO);
        figuras.areaFiguras(TipoFigura.TODAS);

        System.out.println("\n----------- Perímetros das Figuras -------------\n");

        figuras.perimetroFiguras(TipoFigura.QUADRADO);
        figuras.perimetroFiguras(TipoFigura.CIRCULO);
        figuras.perimetroFiguras(TipoFigura.RETANGULO);
        figuras.perimetroFiguras(TipoFigura.TODAS);
        
        System.out.println("\n----------- Informações das Figuras -------------\n");

        figuras.toStringDaFigura(TipoFigura.QUADRADO);
        figuras.toStringDaFigura(TipoFigura.CIRCULO);
        figuras.toStringDaFigura(TipoFigura.RETANGULO);
        figuras.toStringDaFigura(TipoFigura.TODAS);

    }
}