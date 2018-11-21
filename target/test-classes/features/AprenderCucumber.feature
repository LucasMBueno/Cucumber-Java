#language: pt
Funcionalidade: Aprender Cucumber
  Como aluno
  Eu quero aprender utilizar cucumber
  Para que eu possa automatizar criterios de aceitação

  Cenario: Deve executar especificação
    Dado que criei o arquivo corretamente
    Quando executa-lo
    Entao a especificacao deve finalizar com sucesso

  Cenario: deve incrementar o contador
    Dado que o valor do contador é 15
    Quando eu incrementar em 3
    Entao o valor do contador será 18

  Cenario: deve incrementar o contador1
    Dado que o valor do contador é 15
    Quando eu incrementar em 5
    Entao o valor do contador será 20

  Cenario: deve calcular atraso na entrega
    Dado que a entrega é dia 05/04/2018
    Quando a entrega atrasar em 2 dias
    Entao a entrega será efetuada em 07/04/2018

  Cenario: deve calcular atraso na entrega
    Dado que a entrega é dia 05/04/2018
    Quando a entrega atrasar em 2 meses
    Entao a entrega será efetuada em 05/06/2018
