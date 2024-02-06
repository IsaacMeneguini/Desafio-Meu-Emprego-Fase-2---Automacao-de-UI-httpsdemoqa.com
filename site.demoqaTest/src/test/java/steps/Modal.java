package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class Modal {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que estaja na pagina modal")
	public void que_estaja_na_pagina_modal() {
	    
		Executa.abrirNavegador("https://demoqa.com/modal-dialogs");
		
	}

	@When("clicar no botao small")
	public void clicar_no_botao_small() {
	   
		metodos.clicar(el.btnSmallModal);
	}

	@Then("aparecera para o usuario um texto curto")
	public void aparecera_para_o_usuario_um_texto_curto() {
	    
		metodos.validarTexto(el.btnBodySmallModal, "This is a small modal. It has very less content"); 
		metodos.clicar(el.btncloseSmallModal);
		metodos.fecharNavegador();
	}

	@When("clicar no botao large")
	public void clicar_no_botao_large() {
	    
		metodos.clicar(el.btnLargeModal);
	}

	@Then("aparecera para o usuario um texto longo")
	public void aparecera_para_o_usuario_um_texto_longo() {
	   
		metodos.validarParteTextoElemento(el.btncBodyLargeModal, "scrambled it to make a type specimen book. It has survived not only five");
		metodos.clicar(el.btncloseLargeModal);
		metodos.fecharNavegador();
	}


}
