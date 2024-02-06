package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class Alerts {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("dado que o usuario esteja na pagina de alerts")
	public void dado_que_o_usuario_esteja_na_pagina_de_alerts() {

		Executa.abrirNavegador("https://demoqa.com/alerts");
		metodos.scroll(100);
		metodos.pause(2000);

	}

	@When("clicar na opcao Click Button to see alert em click me")
	public void clicar_na_opcao_click_button_to_see_alert_em_click_me() {

		metodos.clicar(el.btnToSeeAlert);

	}

	@Then("sera mostrado ao usuario a mensagem que ele clicou no botao do alerta um")
	public void sera_mostrado_ao_usuario_a_mensagem_que_ele_clicou_no_botao_do_alerta_um() {

		metodos.validarMsgAlerta("You clicked a button");
		metodos.pause(1000);
		metodos.clicarNoAlertaOk();
		metodos.fecharNavegador();
	}

	@When("clicar na opcao On button click, alert will appear after five seconds em click me")
	public void clicar_na_opcao_on_button_click_alert_will_appear_after_cinco_seconds_em_click_me() {

		metodos.clicar(el.btnClickAlert);
	}

	@Then("sera mostrado ao usuario a mensagem que ele clicou no botao do alerta dois")
	public void sera_mostrado_ao_usuario_a_mensagem_que_ele_clicou_no_botao_do_alerta_dois() {

		metodos.validarMsgAlerta("This alert appeared after 5 seconds");
		metodos.pause(5500);
		metodos.clicarNoAlertaOk();
		metodos.fecharNavegador();
	}

	@When("clicar na opcao Click Button confirm box will appear em click me")
	public void clicar_na_opcao_click_button_confirm_box_will_appear_em_click_me() {

		metodos.clicar(el.btnClickConfirmBox);
	}

	@When("mostrar ao usuario a mensagem do alerta")
	public void mostrar_ao_usuario_a_mensagem_do_alerta() {

		metodos.validarMsgAlerta("Do you confirm action?");
	}

	@Then("clicar em ok para ver o resultado de ok")
	public void clicar_em_ok_para_ver_o_resultado_de_ok() {

		metodos.pause(1000);
		metodos.clicarNoAlertaOk();
		metodos.fecharNavegador();
	}

	@Then("clicar em cancelar para ver o resultado cancelar")
	public void clicar_em_cancelar_para_ver_o_resultado_cancelar() {

		metodos.clicarNoAlertaCancelar();
		metodos.fecharNavegador();
	}
	@When("clicar na opcao Click prompt box will appear em click me")
	public void clicar_na_opcao_click_prompt_box_will_appear_em_click_me() {
		
		metodos.clicar(el.btnClickPrompt);
	}

	@When("mostrar ao usuario a mensagem do alerta prompt box")
	public void mostrar_ao_usuario_a_mensagem_do_alerta_prompt_box() {
	 
		metodos.validarMsgAlerta("Please enter your name");
	}

	@When("escrever o nome")
	public void escrever_o_nome() {
	    
		metodos.escreverAlerta("isaac");
		
	}

	@Then("clicar em ok para ver o resultado do nome")
	public void clicar_em_ok_para_ver_o_resultado_do_nome() {
	    
		metodos.pause(1000);
		metodos.clicarNoAlertaOk();
		metodos.fecharNavegador();
	}

	@When("deve mostrar ao usuario a mensagem do alerta  prompt box")
	public void deve_mostrar_ao_usuario_a_mensagem_do_alerta_prompt_box() {
		
		metodos.validarMsgAlerta("Please enter your name");
		
	}
	
	@Then("clicar em cancelar para verificar se nao tem nenhum resultado")
	public void clicar_em_cancelar_para_verificar_se_nao_tem_nenhum_resultado() {
	    
		metodos.clicarNoAlertaCancelar();
		metodos.fecharNavegador();
	}


}