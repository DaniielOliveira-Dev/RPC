# Projeto RPC com Sockets e JSON-RPC

Projeto desenvolvido para a disciplina de Sistemas Distribuídos, com comunicação cliente-servidor usando Sockets e protocolo JSON-RPC.

## Funcionalidades

- Cálculo das raízes de uma equação do segundo grau pela fórmula de Bhaskara.
- Cálculo do valor de PI com a quantidade de casas decimais informada pelo usuário.
- Estatísticas de texto, incluindo:
  - quantidade de letras;
  - quantidade de palavras;
  - vogais sem acento;
  - vogais acentuadas;
  - consoantes;
  - espaços;
  - palavras com quantidade par de letras;
  - palavras com quantidade ímpar de letras;
  - quantidade de linhas.

## Estrutura

O projeto é dividido em duas aplicações Maven:

- `servidor-socket-rpc-jsonrpc`: servidor responsável por receber as requisições RPC e executar os serviços.
- `cliente-socket-rpc-jsonrpc`: cliente de terminal que envia requisições ao servidor.

## Tecnologias

- Java
- Maven
- Sockets TCP
- JSON-RPC
- Gson
- JUnit
