package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BonusServiceTest {

    @Test
    void naoDeveCalcularBonusQuandoFuncionarioTiverSalarioMuitoAlto() {
        Funcionario funcionario = new Funcionario("Priscila", LocalDate.now(), new BigDecimal("15000"));
        BonusService service = new BonusService();
        assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(funcionario));
    }

    @Test
    void bonusDeveSer10PorCentoDoSalario() {
        Funcionario funcionario = new Funcionario("Priscila", LocalDate.now(), new BigDecimal("1500"));
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(funcionario);
        assertEquals(new BigDecimal("150.00"), bonus);
    }

    @Test
    void bonusDeveSer10PorCentoParaSalarioDeExatamente10000() {
        Funcionario funcionario = new Funcionario("Priscila", LocalDate.now(), new BigDecimal("10000"));
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(funcionario);
        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}