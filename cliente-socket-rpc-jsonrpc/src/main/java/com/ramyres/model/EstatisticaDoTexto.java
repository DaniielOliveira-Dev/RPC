package com.ramyres.model;

public class EstatisticaDoTexto 
{
    public int qtdLetras;
    public int qtdPalavras;
    public int qtdVogal;
    public int qtdVogalAcentuada;
    public int qtdConsoantes;
    public int qtdEspacos;
    public int qtdPalavrasPar;
    public int qtdPalavrasImpar;
    public int qtdDeLinhas;

    @Override
    public String toString() {
        // Formata os campos na mesma ordem retornada pelo servidor.
        return "Letras: " + qtdLetras
            + "\nPalavras: " + qtdPalavras
            + "\nVogais sem acento: " + qtdVogal
            + "\nVogais acentuadas: " + qtdVogalAcentuada
            + "\nConsoantes: " + qtdConsoantes
            + "\nEspacos: " + qtdEspacos
            + "\nPalavras pares: " + qtdPalavrasPar
            + "\nPalavras impares: " + qtdPalavrasImpar
            + "\nLinhas: " + qtdDeLinhas;
    }
}
