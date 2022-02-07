package aux;

import figuras.Circulo;
import figuras.Quadrado;
import figuras.Retangulo;

public class FigurasGeometricas {

    private Retangulo retangulo;
    private Quadrado quadrado;
    private Circulo circulo;
    private Contas contas;

    public FigurasGeometricas(Retangulo retangulo, Quadrado quadrado, Circulo circulo, Contas contas) {
        this.retangulo = retangulo;
        this.quadrado = quadrado;
        this.circulo = circulo;
        this.contas = contas;
    }

    public void areaFiguras(TipoFigura tipo) {
        switch (tipo) {
            case RETANGULO:
                System.out
                        .println("A área deste retângulo é: " + String.format("%.2f", contas.areaRetangulo(retangulo)));
                break;
            case QUADRADO:
                System.out.println("A área deste quadrado é: " + String.format("%.2f", contas.areaQuadrado(quadrado)));
                break;
            case CIRCULO:
                System.out.println("A área deste círculo é: " + String.format("%.2f", contas.areaCirculo(circulo)));
                break;
            case TODAS:
                System.out.println("Todas as áreas são: \n" +
                        String.format("%.2f", contas.areaRetangulo(retangulo)) + " "
                        + String.format("%.2f", contas.areaQuadrado(quadrado)) + " e "
                        + String.format("%.2f", contas.areaCirculo(circulo)) +
                        ". retângulo, quadrado e círculo, respectivamente");
                break;

            default:
                System.out.println("O valor que vc forneceu não representa nenhuma figura geométrica conhecida!");
                break;
        }
    }

    public void perimetroFiguras(TipoFigura tipo) {

        switch (tipo) {
            case RETANGULO:
                System.out.println(
                        "O perímetro do retângulo é: " + String.format("%.2f", contas.perimetroRetangulo(retangulo)));
                break;
            case QUADRADO:
                System.out.println(
                        "O perímetro do quadrado é: " + String.format("%.2f", contas.perimetroQuadrado(quadrado)));
                break;
            case CIRCULO:
                System.out.println(
                        "O perímetro do círculo é: " + String.format("%.2f", contas.perimetroCirculo(circulo)));
                break;
            case TODAS:
                System.out.println("Todas os perímetros são: \n" +
                        String.format("%.2f", contas.perimetroRetangulo(retangulo)) + " "
                        + String.format("%.2f", contas.perimetroQuadrado(quadrado)) + " e "
                        + String.format("%.2f", contas.perimetroCirculo(circulo)) +
                        ". retângulo, quadrado e círculo, respectivamente");
                break;
            default:
                System.out.println("O valor que vc forneceu não representa nenhuma figura geométrica conhecida!");
                break;
        }
    }

    public void toStringDaFigura(TipoFigura tipo) {

        switch (tipo) {
            case RETANGULO:
                System.out.println(retangulo.toString());
                break;
            case QUADRADO:
                System.out.println(quadrado.toString());
                break;
            case CIRCULO:
                System.out.println(circulo.toString());
                break;

            case TODAS:
                System.out.println("Todas os parâmetros das figuras são: \n" + retangulo.toString() + "\n"
                        + quadrado.toString() + "\n" + circulo.toString() + "\n");
                break;

            default:
                System.out.println("O valor que vc forneceu não representa nenhuma figura geométrica conhecida!");
                break;
        }
    }
}