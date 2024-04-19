package tests;

import control.CalculadoraImc;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraImcTestes {

    CalculadoraImc calculadoraImc;

    @Test
    public void AdultoHomemBaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calculadoraImc.calcularImc(1.66, 40, 21, "masculino"));
    }

    @Test
    public void AdultoHomemBaixoPesoGrave() {
        Assert.assertEquals("Baixo peso grave", calculadoraImc.calcularImc(1.66, 45, 21, "masculino"));
    }

    @Test
    public void AdultoHomemBaixoPeso() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.66, 50, 21, "masculino"));
    }

    @Test
    public void AdultoHomemPesoNormal() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.66, 60, 21, "masculino"));
    }

    @Test
    public void AdultoHomemSobrepeso() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.66, 75, 21, "masculino"));
    }

    @Test
    public void AdultoHomemObesidadeGrauI() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.66, 90, 21, "masculino"));
    }

    @Test
    public void AdultoHomemObesidadeGrauII() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.66, 105, 21, "masculino"));
    }

    @Test
    public void AdultoHomemObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 120, 21, "masculino"));
    }

    @Test
    public void AdultoMulherBaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calculadoraImc.calcularImc(1.66, 40, 21, "feminino"));
    }

    @Test
    public void AdultoMulherBaixoPesoGrave() {
        Assert.assertEquals("Baixo peso grave", calculadoraImc.calcularImc(1.66, 45, 21, "feminino"));
    }

    @Test
    public void AdultoMulherBaixoPeso() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.66, 50, 21, "feminino"));
    }

    @Test
    public void AdultoMulherPesoNormal() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.66, 60, 21, "feminino"));
    }

    @Test
    public void AdultoMulherSobrepeso() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.66, 75, 21, "feminino"));
    }

    @Test
    public void AdultoMulherObesidadeGrauI() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.66, 90, 21, "feminino"));
    }

    @Test
    public void AdultoMulherObesidadeGrauII() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.66, 105, 21, "feminino"));
    }

    @Test
    public void AdultoMulherObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 120, 21, "feminino"));
    }
    @Test
    public void IdosoHomemBaixoPeso() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.66, 50, 70, "masculino"));
    }

    @Test
    public void IdosoHomemPesoNormal() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.66, 70, 70, "masculino"));
    }

    @Test
    public void IdosoHomemSobrepeso() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.66, 80, 70, "masculino"));
    }

    @Test
    public void IdosoHomemObesidadeGrauI() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.66, 90, 70, "masculino"));
    }

    @Test
    public void IdosoHomemObesidadeGrauII() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.66, 100, 70, "masculino"));
    }

    @Test
    public void IdosoHomemObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 120, 70, "masculino"));
    }
    @Test
    public void IdosoMulherBaixoPeso() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.55, 40, 70, "feminino"));
    }

    @Test
    public void IdosoMulherPesoNormal() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.55, 60, 70, "feminino"));
    }

    @Test
    public void IdosoMulherSobrepeso() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.55, 70, 70, "feminino"));
    }

    @Test
    public void IdosoMulherObesidadeGrauI() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.55, 80, 70, "feminino"));
    }

    @Test
    public void IdosoMulherObesidadeGrauII() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.55, 90, 70, "feminino"));
    }

    @Test
    public void IdosoMulherObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(1.55, 120, 70, "feminino"));
    }

    @Test
    public void CriancaHomemBaixoPeso() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.5, 35, 10, "masculino"));
    }

    @Test
    public void CriancaHomemPesoNormal() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.5, 45, 12, "masculino"));
    }

    @Test
    public void CriancaHomemSobrepeso() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.5, 65, 15, "masculino"));
    }

    @Test
    public void CriancaHomemObesidade() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(1.5, 75, 17, "masculino"));
    }

    @Test
    public void CriancaMulherBaixoPeso()
    {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.5, 35, 10, "feminino"));
    }

    @Test
    public void CriancaMulherPesoNormal()
    {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.5, 45, 12, "feminino"));
    }

    @Test
    public void CriancaMulherSobrepeso()
    {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.5, 65, 15, "feminino"));
    }

    @Test
    public void CriancaMulherObesidade()
    {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(1.5, 75, 17, "feminino"));
    }


}
