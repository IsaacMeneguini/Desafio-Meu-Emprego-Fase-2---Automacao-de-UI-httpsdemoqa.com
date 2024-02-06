@tag
Feature: Modal
	Feature: validando o modal small e large
  como usuario que estar na pagina de modal e clicar nos botoes small e large 

 	Background: dado que o usuario esteja na tela do modal
  Given que estaja na pagina modal

 @TestPositivo
  Scenario: botao small
  
    When clicar no botao small
    Then aparecera para o usuario um texto curto


 @TestPositivo
  Scenario: botao large
  
   When clicar no botao large
   Then aparecera para o usuario um texto longo
