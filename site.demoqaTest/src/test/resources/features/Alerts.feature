	@tag
	Feature: Alerts
  como usuario devo clicar no botao alerts para ver as opcoes e testa-las 

 	Background: dado que o usuario esteja na categoria  de alerts
  Given dado que o usuario esteja na pagina de alerts

  @TestPositivo
  Scenario: validar a mensagem da opcao Click Button to see alert
  
  	
    When clicar na opcao Click Button to see alert em click me 
    Then sera mostrado ao usuario a mensagem que ele clicou no botao do alerta um

  
 	@TestPositivo
  Scenario: valida1r a mensagem da opcao On button click, alert will appear after 
  
  	
    When clicar na opcao On button click, alert will appear after five seconds em click me 
    Then sera mostrado ao usuario a mensagem que ele clicou no botao do alerta dois
    
    
    
  @TestPositivo
  Scenario: validar a mensagem da opcao Click Button confirm box will appear e clicar no ok 
  
  	
    When clicar na opcao Click Button confirm box will appear em click me 
    And mostrar ao usuario a mensagem do alerta 
    Then clicar em ok para ver o resultado de ok
    
  @TestPositivo
  Scenario: validar a mensagem da opcao Click Button confirm box will appear e clicar no cancelar
  
  	
    When clicar na opcao Click Button confirm box will appear em click me 
    And mostrar ao usuario a mensagem do alerta 
    Then clicar em cancelar para ver o resultado cancelar
    
    
  @TestPositivo
  Scenario: validar a mensagem da opcao Click prompt box will appear e escrever o nome e clicar em ok
  
  	
    When clicar na opcao Click prompt box will appear em click me 
    And mostrar ao usuario a mensagem do alerta prompt box
    And escrever o nome
    Then clicar em ok para ver o resultado do nome
    
    
  @TestPositivo
  Scenario: validar a mensagem da opcao Click prompt box will appear e clicar em cancelar
  
  	
    When clicar na opcao Click prompt box will appear em click me 
    And deve mostrar ao usuario a mensagem do alerta  prompt box
    Then clicar em cancelar para verificar se nao tem nenhum resultado