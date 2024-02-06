package steps;

import java.awt.AWTException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;
import utilits.MassaDados;

public class Formulario {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	MassaDados md = new MassaDados();
	
	
	
	@Given("estar na pagina practice form")
	public void estar_na_pagina_practice_form() {
	    
		Executa.abrirNavegador("https://demoqa.com/automation-practice-form");
		metodos.scroll(200);
	}

	@When("preencher todos os dados corretamente disponiveis nos campos do formulario")
	public void preencher_todos_os_dados_corretamente_disponiveis_nos_campos_do_formulario() throws AWTException, InterruptedException {
	    
		metodos.escrever(el.btnFirstName, md.nome3);
		metodos.escrever(el.btnLastName,md.Sobrenome2);
		metodos.escrever(el.btnEmail, md.Email2);
		metodos.clicar(el.btnFemale);
		metodos.escrever(el.btnMobileNumber, md.numero1);
		metodos.clicar(el.btnDateOfBirth);
		metodos.clicar(el.btnMonthSelect);
		metodos.clicar(el.btnMonthResults);
		metodos.clicar(el.btnYearSelect);
		metodos.clicar(el.btnYearResults);
		metodos.clicar(el.btnNumberResults);
		metodos.preencher(md.subj2);
		metodos.teclaSetaBaixo();
		metodos.teclaEnter();
		metodos.clicar(el.btnHobbies2);
		metodos.scroll(300);
		metodos.arquivoSelect();
		metodos.escrever(el.btncurrentAddress, md.City2);
		metodos.redefinir(40);
		metodos.pause(1000);
		metodos.clickOnWebsite(541,480);
		metodos.clickOnWebsite(552,531);
		metodos.teclaEnter();
		metodos.clickOnWebsite(877,477);
		metodos.clickOnWebsite(831,513);
		metodos.teclaEnter();
		
		
		
	}

	@Then("ao clicar em subimit aparecera para um alerta com todas as infomacoes digitadas")
	public void ao_clicar_em_subimit_aparecera_para_um_alerta_com_todas_as_infomacoes_digitadas() {
	    
		metodos.submit(el.btnSubmit);
		metodos.redefinir(70);
		metodos.evidencia("Formulario Teste Positivo");
		metodos.clickOnWebsite(823,415);
		metodos.mouseClickEsquerdo();
		metodos.fecharNavegador();
	}

	@When("preencher alguns campos com dados corretamente disponiveis nos campos do formulario")
	public void preencher_alguns_campos_com_dados_corretamente_disponiveis_nos_campos_do_formulario() {
	  
		metodos.escrever(el.btnFirstName, md.nome1);
	}

	@When("nao digitar o sobrenome")
	public void nao_digitar_o_sobrenome() {
		metodos.clicar(el.btnLastName);
	}
	
	@When("nao digitar o email corretamente")
	public void nao_digitar_o_email_corretamente() {
	    
		metodos.escrever(el.btnEmail, md.City1);
		metodos.clicar(el.btnMale);
	}


	@When("nao digitar o numero de telefone com numeros")
	public void nao_digitar_o_numero_de_telefone_com_numeros() {
	    
		metodos.escrever(el.btnMobileNumber, md.Country1);
	}

	@Then("ao clicar em submit os campos ficaram vermelhos")
	public void ao_clicar_em_submit_os_campos_ficaram_vermelhos() {
	   
		metodos.submit(el.btnSubmit);
		metodos.redefinir(60);
		metodos.evidencia("Formulario Teste Negativo");
		metodos.fecharNavegador();
	}


}
