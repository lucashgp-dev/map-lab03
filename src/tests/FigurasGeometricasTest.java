package tests;

import aux.FigurasGeometricas;
import aux.TipoFigura;
import figuras.Circulo;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigurasGeometricasTest {

    private static FigurasGeometricas figuras;

    @BeforeAll
    static void setup() {

        System.out.println("Testes Iniciados.");
        figuras = new FigurasGeometricas();
    }

    @AfterAll
    static void done() {
        System.out.println("Testes Finalizados.");
    }


    @Test
    void criarCirculo() {
        assertTrue(figuras.criarCirculo(TipoFigura.CIRCULO, 25));

    }

    @Test
    void criarQuadrado() {
        assertTrue(figuras.criarQuadrado(TipoFigura.QUADRADO, 7));

    }

    @Test
    void criarRetangulo() {
        assertTrue(figuras.criarRetangulo(TipoFigura.RETANGULO, 10, 5));
    }
}