package com.ramyres.servicos;

public class PalavrasService implements ServiceInterface {
    private static final String VOGAIS = "aeiouAEIOU";
    private static final String VOGAIS_ACENTUADAS = "áàâãéêíóôõúüÁÀÂÃÉÊÍÓÔÕÚÜ";

    private boolean ehVogal(char letra) {
        return VOGAIS.indexOf(letra) >= 0;
    }

    private boolean ehVogalAcentuada(char letra) {
        return VOGAIS_ACENTUADAS.indexOf(letra) >= 0;
    }

    @Override
    public String[] Run(String[] params) {
        if (params.length != 1) {
            throw new IllegalArgumentException("Parametros invalidos. Esperado: texto");
        }

        String texto = params[0];
        int qtdLetras = 0;
        int qtdVogal = 0;
        int qtdVogalAcentuada = 0;
        int qtdConsoantes = 0;
        int qtdEspacos = 0;

        // Percorre cada caractere para separar letras, vogais, consoantes e espacos.
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (Character.isLetter(caractere)) {
                qtdLetras++;
                if (ehVogal(caractere)) {
                    qtdVogal++;
                } else if (ehVogalAcentuada(caractere)) {
                    qtdVogalAcentuada++;
                } else {
                    qtdConsoantes++;
                }
            }

            if (caractere == ' ') {
                qtdEspacos++;
            }
        }

        String textoSemBordas = texto.trim();
        String[] palavras = textoSemBordas.isEmpty() ? new String[0] : textoSemBordas.split("\\s+");
        int qtdPalavrasPar = 0;
        int qtdPalavrasImpar = 0;

        // Conta palavras com quantidade par ou impar considerando apenas letras.
        for (String palavra : palavras) {
            int letrasDaPalavra = 0;
            for (int i = 0; i < palavra.length(); i++) {
                if (Character.isLetter(palavra.charAt(i))) {
                    letrasDaPalavra++;
                }
            }

            if (letrasDaPalavra % 2 == 0) {
                qtdPalavrasPar++;
            } else {
                qtdPalavrasImpar++;
            }
        }

        int qtdPalavras = palavras.length;
        int qtdDeLinhas = texto.isEmpty() ? 0 : texto.split("\\R", -1).length;

        // Ordem do retorno definida no README do projeto.
        return new String[]{
            String.valueOf(qtdLetras),
            String.valueOf(qtdPalavras),
            String.valueOf(qtdVogal),
            String.valueOf(qtdVogalAcentuada),
            String.valueOf(qtdConsoantes),
            String.valueOf(qtdEspacos),
            String.valueOf(qtdPalavrasPar),
            String.valueOf(qtdPalavrasImpar),
            String.valueOf(qtdDeLinhas)
        };
    }
}
