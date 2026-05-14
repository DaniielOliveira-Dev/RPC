package com.ramyres.servicos;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
Pesquise sobre os metodos e escolha um
    * Método de Arquimedes
    * Método de Chudnovsky
    * Método de Leibniz
    * Método de Machin
*/
public class PiService implements ServiceInterface {
    @Override
    public String[] Run(String[] params) {
        if (params.length != 1) {
            throw new IllegalArgumentException("Parametros invalidos. Esperado: qtdCasas");
        }

        int qtdCasas = Integer.parseInt(params[0]);
        if (qtdCasas < 0) {
            throw new IllegalArgumentException("A quantidade de casas decimais nao pode ser negativa");
        }

        // Usa o valor de Math.PI e ajusta a quantidade de casas decimais pedida no README.
        BigDecimal pi = BigDecimal.valueOf(Math.PI).setScale(qtdCasas, RoundingMode.HALF_UP);
        return new String[]{ pi.toPlainString() };
    }
}
