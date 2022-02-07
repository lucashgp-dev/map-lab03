import aux.FigurasGeometricas;
import aux.TipoFigura;

public class Main {

    public static void main(String[] args) {

        //Classe Principal
        FigurasGeometricas figuras = new FigurasGeometricas();

        // Criando Figuras
        figuras.criarCirculo(TipoFigura.CIRCULO, 25);
        figuras.criarQuadrado(TipoFigura.QUADRADO, 7);
        figuras.criarRetangulo(TipoFigura.RETANGULO, 10, 5);

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