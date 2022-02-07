import aux.Contas;
import aux.FigurasGeometricas;
import aux.TipoFigura;
import figuras.Circulo;
import figuras.Quadrado;
import figuras.Retangulo;

public class Main {

    public static void main(String[] args) {

        Contas contas = new Contas();
        Retangulo retangulo = new Retangulo(TipoFigura.RETANGULO, 10, 5);
        Quadrado quadrado = new Quadrado(TipoFigura.QUADRADO, 7);
        Circulo circulo = new Circulo(TipoFigura.CIRCULO, 25);
        

        FigurasGeometricas figuras = new FigurasGeometricas(retangulo, quadrado, circulo, contas);

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