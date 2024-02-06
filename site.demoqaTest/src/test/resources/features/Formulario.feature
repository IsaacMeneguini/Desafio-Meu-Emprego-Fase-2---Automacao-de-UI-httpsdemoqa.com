	@tag
	Feature: Formulario
  como usuario quero preencher meus dados no formulario

 	Background: dado que o usuario esteja na pagina practice form
  Given estar na pagina practice form

  @TestPositivo
  Scenario: digitar todas as informacoes corretamente
  
    When preencher todos os dados corretamente disponiveis nos campos do formulario
    Then ao clicar em subimit aparecera para um alerta com todas as infomacoes digitadas


 @Testnegativo
  Scenario: digitar o formulario com algumas informacoes incorreta e faltando campos
  
   When preencher alguns campos com dados corretamente disponiveis nos campos do formulario
   But nao digitar o sobrenome
   And nao digitar o email corretamente
   And nao digitar o numero de telefone com numeros
   Then ao clicar em submit os campos ficaram vermelhos