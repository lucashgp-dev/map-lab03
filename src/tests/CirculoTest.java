package tests;

import aux.TipoFigura;
import figuras.Circulo;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    private static Circulo circulo1;
    private static Circulo circulo2;
    private static double raio = 5;
    private static TipoFigura tipo = TipoFigura.CIRCULO;

    @BeforeAll
    static void setup() {

        System.out.println("Testes Iniciados.");
        circulo1 = new Circulo(tipo, raio);
        circulo2 = new Circulo(tipo, raio);
    }

    @AfterAll
    static void done() {
        System.out.println("Testes Finalizados.");
    }

    @Test
        //Espera-se saida 5 quando solicitar o valor do raio
    void getRaio() {
        assertEquals(5, circulo1.getRaio());
    }

    @Test
        //Espera-se saida 10 quando solicitar o valor do raio depois de alterado
    void setRaio() {
        circulo2.setRaio(10);
        assertEquals(10, circulo2.getRaio());
    }

    @Test
        //Espera-se saida CIRCULO quando solicitar o valor do tipo da figura
    void getTipo() {
        assertEquals(TipoFigura.CIRCULO, circulo1.getTipo());
    }

    @Test
    void testToString() {
        assertEquals(circulo1.toString(),
                "O circulo criado tem raio de tamanho: 5.0. ");
    }
}