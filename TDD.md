# TDD

## 01. Testes automatizados

Quais as principais vantagens de se utilizar a prática de escrever testes automatizados em uma aplicação?
- Garantir que o código da aplicação atende corretamente aos requisitos de negócio.
  Os testes automatizados ajudam a manter a qualidade da aplicação, pois validam se os requisitos de negócio estão sendo atendidos conforme o esperado.
- Facilitar a manutenção do software.
  Testes automatizados facilitam a manutenção do software, pois qualquer alteração que cause algum impacto será rapidamente detectada.
  
Resumo:
- O que são testes automatizados;
- A importância de se escrever testes automatizados em uma aplicação;
- Como escrever um teste automatizado utilizando uma classe Java com o método main.


## 02. JUnit

Uma das facilidades do JUnit é avaliar se os testes estão passando ou falhando. 
Como o JUnit nos fornece esse feedback?
- Via relatório exibido na IDE, como por exemplo a view JUnit no Eclipse.
  As IDEs possuem plugins de integração com o JUnit, facilitando a análise dos resultados dos testes executados.

Por qual motivo devemos utilizar os métodos estáticos assert do JUnit, como por exemplo o assertEquals?
- Para validar se a implementação atende aos requisitos esperados.
  Os métodos assert nos permitem verificar se a classe testada está executando seu comportamento conforme o esperado.
  
Resumo:
- A história do JUnit;
- Como adicionar o JUnit ao projeto;
- Como escrever um teste automatizado com JUnit;
- Como executar os testes com JUnit e analisar o resultado da execução.


## 03. TDD: Test-Driven Development

Aprendemos que uma das etapas do TDD é chamada de refatoração. 
Quando devemos realizar tal etapa ao desenvolver uma funcionalidade com TDD?
- Quando a qualidade do código estiver ruim.
  A refatoração nos ajuda a manter a qualidade do código, algo extremamente importante para a manutenção de uma aplicação.

Quais as principais vantagens de se utilizar o TDD?
- A funcionalidade implementada já sai coberta por testes.
  No TDD o teste vem antes, o que garante que a funcionalidade já será implementada com cobertura de testes.

- TDD ajuda a manter o foco durante a implementação de uma funcionalidade.
  Ao implementar os cenários de teste a tendência é manter o foco durante a implementação.
  
Resumo:
- O que é o TDD;
- Como escrever uma funcionalidade via TDD;
- Como realizar uma refatoração no código;
- As vantagens de escrever os testes antes da implementação.


## 04. Lidando com exceptions

Qual a maneira correta de testar um método que lança exception?
- Utilizando o método assertThrows. 
  O 'assertThrows' serve para verificar se uma exception foi lançada ao chamar um método.

Resumo: 
- Como testar métodos que podem lançar exceptions; 
- As abordagens para testar um método que lança uma exception.


## 05. Mais recursos

Qual o objetivo da anotação @BeforeEach?
- Marcar um método para ser chamado antes de cada um dos métodos de teste.
O '@BeforeEach' nos ajuda a evitar códigos duplicados nos métodos de teste, uma vez que ele marca um método para sempre ser chamado antes de cada um dos testes.

Vimos que em uma aplicação é possivel termos centenas, ou até mesmo milhares de classes que implementam as regras de negócio dela. 
Quais dessas classes são consideradas boas candidatas para testes automatizados?
- Apenas as classes que possuem regras de negócio e que possivelmente sofrerão bastante modificações.
  Esse é o principal tipo de classe para ser testada em uma aplicação.
  
Resumo:
- Como organizar o código de uma classe de teste;
- A utilizar as anotacoes @BeforeEach, @AfterEach, @BeforeAll e AfterAll do JUnit;
- Que não se deve testar métodos privados;
- Avaliar quais classes devem ser testadas em uma aplicação.
