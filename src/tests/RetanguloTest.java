package tests;

import aux.TipoFigura;
import figuras.Retangulo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


class RetanguloTest {

    private static Retangulo retangulo1;
    private static Retangulo retangulo2;
    private static double altura = 10.0;
    private static double largura = 5.0;
    private static TipoFigura tipo = TipoFigura.QUADRADO;

    @BeforeAll
    static void setup() {
       retangulo1 = new Retangulo(tipo, altura,largura);
        retangulo2 = new Retangulo(tipo, altura,largura);

    }

    @AfterAll
    static void done() {
        System.out.println("Testes Finalizados.");
    }


    @Test
    void getAltura() {
        assertEquals(10.0, retangulo1.getAltura());
    }

    @Test
    void setAltura() {
        retangulo2.setAltura(50.0);
        assertEquals(50.0, retangulo2.getAltura());
    }

    @Test
    void getLargura() {
        assertEquals(5.0, retangulo1.getLargura());
    }

    @Test
    void setLargura() {
        retangulo2.setLargura(70.0);
        assertEquals(70.0, retangulo2.getLargura());
    }

    @Test
    void testToString() {
        assertEquals(   retangulo1.toString(), "O retângulo criado tem altura de tamanho: 10.0 e largura de tamanho: 5.0. ");
    }
}