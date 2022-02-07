package tests;

import aux.Contas;
import aux.TipoFigura;
import figuras.Circulo;
import figuras.Quadrado;
import figuras.Retangulo;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContasTest {

    private static Retangulo retangulo;
    private static double altura = 2.0;
    private static double largura = 2.0;
    private static Circulo circulo;
    private static double raio = 2.0;
    private static Quadrado quadrado;
    private static double lado = 2.0;

    public static Contas contas;

    @BeforeAll
    static void setup() {
        contas = new Contas();
        retangulo = new Retangulo(TipoFigura.QUADRADO, altura,largura);
        circulo = new Circulo(TipoFigura.CIRCULO, raio);
        quadrado = new Quadrado(TipoFigura.QUADRADO, lado);

        System.out.println("Testes Iniciados.");
    }

    @Test
    void areaRetangulo() {
        assertEquals("4.00",    String.format("%.2f", contas.areaRetangulo(retangulo)));
    }

    @Test
    void areaQuadrado() {
        assertEquals("4.00",    String.format("%.2f", contas.areaQuadrado(quadrado)));
    }

    @Test
    void areaCirculo() {
        assertEquals("12.57",    String.format("%.2f", contas.areaCirculo(circulo)));
    }

    @Test
    void perimetroRetangulo() {
        assertEquals("8.00",    String.format("%.2f", contas.perimetroRetangulo(retangulo)));
    }

    @Test
    void perimetroQuadrado() {
        assertEquals("8.00",   String.format("%.2f",  contas.perimetroQuadrado(quadrado)));
    }

    @Test
    void perimetroCirculo() {
        assertEquals("6.00",   String.format("%.2f",  contas.perimetroCirculo(circulo)));
    }

    @AfterAll
    static void done() {
        System.out.println("Testes Finalizados.");
    }

}