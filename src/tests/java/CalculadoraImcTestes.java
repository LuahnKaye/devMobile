import control.CalculadoraImc;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraImcTestes {


    CalculadoraImc calc;

    @Before
    public void setup() {
        calc = new CalculadoraImc();
    }

    @After
    public void tearDown() {
        calc = null;
    }

    @Test
    public void idosoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.84, 60.0, 68,"masculino"));
    }

    @Test
    public void idosoPesoNormal1() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.84, 75.0, 67,"masculino"));
    }

    @Test
    public void idosoPesoNormal2() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.84, 76.0, 70,"masculino"));
    }

    @Test
    public void idosoSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.84, 94.0, 81,"masculino"));
    }

    @Test
    public void idosoSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.84, 99.0, 65,"masculino"));
    }

    @Test
    public void idosoObesidadeI1() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.84, 104.0, 68,"masculino"));
    }

    @Test
    public void idosoObesidadeI2() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.84, 106.0, 70,"masculino"));
    }

    @Test
    public void idosoObesidadeII1() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.84, 120.0, 65,"masculino"));
    }

    @Test
    public void idosoObesidadeII2() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.84, 123.0, 69,"masculino"));
    }

    @Test
    public void idosoObesidadeIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(1.84, 137.0, 68,"masculino"));
    }

    // idosA

    @Test
    public void idosaBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.64, 58.0, 69,"feminino"));
    }

    @Test
    public void idosaPesoNormal1() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.64, 64.0, 80,"feminino"));
    }

    @Test
    public void idosaPesoNormal2() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.64, 69.0, 74,"feminino"));
    }

    @Test
    public void idosaSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.64, 76.0, 70,"feminino"));
    }

    @Test
    public void idosaSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.64, 79.0, 91,"feminino"));
    }

    @Test
    public void idosaObesidadeI1() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.64, 89.0, 88,"feminino"));
    }

    @Test
    public void idosaObesidadeI2() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.64, 94.0, 70,"feminino"));
    }

    @Test
    public void idosaObesidadeII1() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.64, 105.0, 77,"feminino"));
    }

    @Test
    public void idosaObesidadeII2() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.64, 110.0, 65,"feminino"));
    }

    @Test
    public void idosaObesidadeIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(1.64, 114.0, 88,"feminino"));
    }

    // adulto
    @Test
    public void adultoBaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(1.70, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoBaixoPesoGrave1() {
        Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.63, 43.0, 25,"feminino"));
    }

    @Test
    public void adultoBaixoPesoGrave2() {
        Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.63, 44.0, 38,"feminino"));
    }

    @Test
    public void adultoBaixoPeso1() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.70, 53.0, 54,"masculino"));
    }

    @Test
    public void adultoBaixoPeso2() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.70, 52.0, 30,"masculino"));
    }

    @Test
    public void adultoPesoNormal1() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.63, 50.0, 22,"feminino"));
    }

    @Test
    public void adultoPesoNormal2() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 72.0, 44,"masculino"));
    }

    @Test
    public void adultoSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.63, 74.0, 39,"feminino"));
    }

    @Test
    public void adultoSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.70, 84.0, 33,"masculino"));
    }

    @Test
    public void adultoObesidadeI1() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 97.0, 55,"masculino"));
    }

    @Test
    public void adultoObesidadeI2() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.63, 90.0, 26,"feminino"));
    }

    @Test
    public void adultoObesidadeII1() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.63, 102.0, 20,"feminino"));
    }

    @Test
    public void adultoObesidadeII2() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.70, 110.0, 31,"masculino"));
    }

    @Test
    public void adultoObesidadeIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(1.63, 146.0, 56,"feminino"));
    }

    // meninO 2 anos

    @Test
    public void meninoDoisAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(0.80, 9.0, 2,"masculino"));
    }

    @Test
    public void meninoDoisAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(0.70, 8.0, 2,"masculino"));
    }


    @Test
    public void meninoDoisAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(0.87, 14.0, 2,"masculino"));
    }

    @Test
    public void meninoDoisAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(0.85, 14.0, 2,"masculino"));
    }


    // meninO 4 anos

    @Test
    public void meninoQuatroAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(0.92, 11.0, 4,"masculino"));
    }

    @Test
    public void meninoQuatroAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(0.98, 14.0, 4,"masculino"));
    }

    @Test
    public void meninoQuatroAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.01, 18.0, 4,"masculino"));
    }

    @Test
    public void meninoQuatroAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.03, 19.0, 4,"masculino"));
    }


    // meninO 6 anos

    @Test
    public void meninoSeisAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.20, 16.0, 6,"masculino"));
    }

    @Test
    public void meninoSeisAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.10, 18.0, 6,"masculino"));
    }

    @Test
    public void meninoSeisAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.15, 24.0, 6,"masculino"));
    }

    @Test
    public void meninoSeisAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.12, 25.0, 6,"masculino"));
    }

    // meninO 8 anos

    @Test
    public void meninoOitoAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.30, 19.0, 8,"masculino"));
    }

    @Test
    public void meninoOitoAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.24, 22.0, 8,"masculino"));
    }

    @Test
    public void meninoOitoAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.20, 26.0, 8,"masculino"));
    }

    @Test
    public void meninoOitoAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.40, 40.0, 8,"masculino"));
    }

    // meninO 10 anos

    @Test
    public void meninoDezAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.50, 25.0, 10,"masculino"));
    }

    @Test
    public void meninoDezAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.42, 29.0, 10,"masculino"));
    }

    @Test
    public void meninoDezAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.38, 37.0, 10,"masculino"));
    }

    @Test
    public void meninoDezAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.34, 41.0, 10,"masculino"));
    }

    // meninO 12 anos

    @Test
    public void meninoDozeAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.46, 30.0, 12,"masculino"));
    }

    @Test
    public void meninoDozeAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.52, 39.0, 12,"masculino"));
    }

    @Test
    public void meninoDozeAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.49, 47.0, 12,"masculino"));
    }

    @Test
    public void meninoDozeAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.55, 59.0, 12,"masculino"));
    }

    // meninA 2 anos

    @Test
    public void meninaDoisAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(0.72, 7.0, 2,"feminino"));
    }

    @Test
    public void meninaDoisAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(0.77, 10.0, 2,"feminino"));
    }


    @Test
    public void meninaDoisAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(0.83, 13.0, 2,"feminino"));
    }

    @Test
    public void meninaDoisAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(0.85, 14.0, 2,"feminino"));
    }


    // meninA 4 anos

    @Test
    public void meninaQuatroAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(0.90, 11.0, 4,"feminino"));
    }

    @Test
    public void meninaQuatroAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(0.94, 13.0, 4,"feminino"));
    }

    @Test
    public void meninaQuatroAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.0, 18.0, 4,"feminino"));
    }

    @Test
    public void meninaQuatroAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.05, 21.0, 4,"feminino"));
    }


    // meninA 6 anos

    @Test
    public void meninaSeisAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.0, 13.0, 6,"feminino"));
    }

    @Test
    public void meninaSeisAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.09, 17.0, 6,"feminino"));
    }

    @Test
    public void meninaSeisAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.15, 23.0, 6,"feminino"));
    }

    @Test
    public void meninaSeisAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.03, 24.0, 6,"feminino"));
    }

    // meninA 8 anos

    @Test
    public void meninaOitoAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.20, 19.0, 8,"feminino"));
    }

    @Test
    public void meninaOitoAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.25, 22.0, 8,"feminino"));
    }

    @Test
    public void meninaOitoAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.20, 27.0, 8,"feminino"));
    }

    @Test
    public void meninaOitoAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.26, 33.0, 8,"feminino"));
    }

    // meninA 10 anos

    @Test
    public void meninaDezAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.22, 20.0, 10,"feminino"));
    }

    @Test
    public void meninaDezAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.31, 25.0, 10,"feminino"));
    }

    @Test
    public void meninaDezAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.29, 38.0, 10,"feminino"));
    }

    @Test
    public void meninaDezAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.37, 46.0, 10,"feminino"));
    }

    // meninA 12 anos

    @Test
    public void meninaDozeAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.44, 30.0, 12,"feminino"));
    }

    @Test
    public void meninaDozeAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.51, 35.0, 12,"feminino"));
    }

    @Test
    public void meninaDozeAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.40, 48.0, 12,"feminino"));
    }

    @Test
    public void meninaDozeAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.55, 62.0, 12,"feminino"));
    }

}
