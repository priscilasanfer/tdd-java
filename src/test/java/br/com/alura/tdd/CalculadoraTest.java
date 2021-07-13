package br.com.alura.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumerosPostivos() {
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(1, 2);
        assertEquals(3, soma);
    }
}