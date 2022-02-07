package tests;

import aux.TipoFigura;
import figuras.Circulo;
import figuras.Quadrado;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    private static Quadrado quadrado1;
    private static Quadrado quadrado2;
    private static double lado = 10;
    private static TipoFigura tipo = TipoFigura.QUADRADO;

    @BeforeAll
    static void setup() {

        System.out.println("Testes Iniciados.");
        quadrado1 = new Quadrado(tipo, lado);
        quadrado2 = new Quadrado(tipo, lado);
    }

    @AfterAll
    static void done() {
        System.out.println("Testes Finalizados.");
    }

    @Test
        //Espera-se saida 10 quando solicitar o valor do lado do quadrado
    void getLado() {
        assertEquals(10, quadrado1.getLado());
    }

    @Test
        //Espera-se saida 20 quando solicitar o valor do lado depois de alterado
    void setLado() {
        quadrado2.setLado(20);
        assertEquals(20, quadrado2.getLado());
    }

    @Test
        //Espera-se saida QUADRADO quando solicitar o valor do tipo da figura
    void getTipo() {
        assertEquals(TipoFigura.QUADRADO, quadrado1.getTipo());
    }


    @Test
    void testToString() {
        assertEquals(quadrado1.toString(), "O quadrado criado tem lados de tamanho: 10.0. ");
    }
}