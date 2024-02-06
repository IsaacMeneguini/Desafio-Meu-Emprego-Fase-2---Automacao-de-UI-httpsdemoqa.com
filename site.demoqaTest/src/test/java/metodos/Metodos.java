package metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.Drivers;

public class Metodos extends Drivers {

	/**
	 * Método para escrever passando o parametro By e String com texto
	 * 
	 * @param elemento
	 * @param texto
	 */

	public void escrever(By elemento, String texto) {

		try {

			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			System.err.println("Erro ao tentar escrever no elemento " + elemento);
		}
	}

	/**
	 * Método para clicar passando o parametro By
	 * 
	 * @param elemento
	 */
	public void clicar(By elemento) {

		try {

			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.err.println("Erro ao tentar clicar no elemento " + elemento);
		}
	}

	/**
	 * Método para clicar passando o parametro By e String com texto
	 * 
	 * @param texto
	 */

	public void preencher(String texto) {

		driver.findElement(By.id("subjectsInput")).sendKeys(texto);

	}

	/**
	 * Método para mecher o mouse em qualquer campo da tela e receber as coordenadas
	 * 
	 */

	public void clickcoordenates() {

		while (true) {
			PointerInfo pointerInfo = MouseInfo.getPointerInfo();
			int x = pointerInfo.getLocation().x;
			int y = pointerInfo.getLocation().y;
			System.out.println("Coordenadas do clique do mouse: (" + x + ", " + y + ")");
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Método selecionar e enviar um arquivo
	 * 
	 */

	public void arquivoSelect() {

		try {

			WebElement fileInput = driver.findElement(By.id("uploadPicture"));
			String filePath = "C:\\Users\\isaac\\Downloads\\Coders.png";
			fileInput.sendKeys(filePath);

		} catch (Exception e) {

		}
	}

	/**
	 * Método para redefinir o tamanho da tela
	 * 
	 * @param porcentagem
	 */

	public void redefinir(int porcentagem) {

		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.body.style.zoom = '" + porcentagem + "%'");

		} catch (Exception e) {
		}
	}

	/**
	 * Método para validar url capturada
	 * 
	 * @param urlDesejada
	 */

	public void currentUrl(String urlDesejada) {

		try {
			assertEquals(urlDesejada, driver.getCurrentUrl());
			
		} catch (Exception e) {
			System.err.println("Erro ao tentar validar a url desejada" + urlDesejada);
		}

	}

	/**
	 * Método para fechar navegador
	 * 
	 */

	public void fecharNavegador() {

		try {

			driver.quit();
			
		} catch (Exception e) {
		}
	}

	/**
	 * Método para validar mensagens passando o By e a mensagem esperada
	 * 
	 * @param elemento
	 * @param MensagemEsperada
	 */
	public void validarTexto(By elemento, String MensagemEsperada) {

		try {
			String msgCapturada = driver.findElement(elemento).getText();
			assertEquals(MensagemEsperada, msgCapturada);

		} catch (Exception e) {
			System.err.println("Erro ao tentar validar a mensagem" + MensagemEsperada);

		}

	}
	
	
	public void validarParteTextoElemento(By elemento, String textoElemento) {
	    
		try {
			
		
		String msgCapturada = driver.findElement(elemento).getText();
	    assertTrue(msgCapturada.contains(textoElemento));
	    
		} catch (Exception e) {

		}
	}

	/**
	 * Método para validar mensagens do alerta
	 *
	 * @param MensagemEsperada
	 */

	public void validarMsgAlerta(String mensagemEsperada) {

		try {
			String mensagemCapturada = driver.switchTo().alert().getText();
			assertEquals(mensagemEsperada, mensagemCapturada);
			System.out.println("A mensagem do alerta está correta");
			
		} catch (Exception e) {
			System.out.println("Erro ao tentar validar a mensagem: " + mensagemEsperada);
			e.printStackTrace();
		}
	}

	/**
	 * Método para criar evidencias
	 *
	 * @param nomeEvidencia
	 */

	public void evidencia(String nomeEvidencia) {

		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método para criar pausa em cada ponto do codigo
	 *
	 * @param tempo
	 */

	public void pause(int tempo) {

		try {
			Thread.sleep(tempo);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Método para dar scroll na tela
	 *
	 * @param valor
	 */

	public void scroll(int valor) {

		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("scrollBy(0," + valor + ")", "");

		} catch (Exception e) {

		}
	}

	/**
	 * Método para dar submit em um formulario
	 *
	 * @param elemento
	 */

	public void submit(By elemento) {

		try {

			driver.findElement(elemento).submit();

		} catch (Exception e) {
		}
	}

	/**
	 * Método para clicar com o esquerdo do mouse
	 *
	 * @param
	 */

	public void mouseClickEsquerdo() {
		try {
			Actions actions = new Actions(driver);
			actions.click().perform();
			
		} catch (Exception e) {
			System.err.println("Erro ao tentar realizar o clique com o botão esquerdo do mouse");
		}
	}

	/**
	 * Método para clicar em qualquer parte do site por coordenadas
	 *
	 * @param x e y
	 */

	public void clickOnWebsite(int x, int y) {
		try {
			Robot robot = new Robot();

			PointerInfo pointerInfo = MouseInfo.getPointerInfo();
			int currentX = pointerInfo.getLocation().x;
			int currentY = pointerInfo.getLocation().y;
			robot.mouseMove(x, y);
			robot.mousePress(java.awt.event.InputEvent.BUTTON1_DOWN_MASK);

		} catch (AWTException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Método para saber as coordenadas coordenadas de qualquer locator
	 *
	 * @param locator
	 */

	public void obterCoordenadasDoLocator(By locator) {

		try {

			WebElement elemento = driver.findElement(locator);

			int x = elemento.getLocation().getX();
			int y = elemento.getLocation().getY();
			System.out.println("As coordenadas do elemento são: X = " + x + ", Y = " + y);
			
		} catch (Exception e) {
		}
	}

	
	public boolean compararParteAlerta(String alerta, String parte) {
	    return alerta.startsWith(parte);
	}
	
	/**
	 * Método para clicar no ok de um alerta
	 *
	 * @param
	 */

	public void clicarNoAlertaOk() {

		try {

			Alert alert = driver.switchTo().alert();
			alert.accept();
			
		} catch (Exception e) {
		}

	}

	/**
	 * Método para clicar no cancelar de um alerta
	 *
	 * @param
	 */

	public void clicarNoAlertaCancelar() {

		try {

			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		} catch (Exception e) {
		}
	}

	/**
	 * Método para clicar escrever em um alerta
	 *
	 * @param texto
	 */

	public void escreverAlerta(String texto) {
	    try {
	        
	        Alert alert = driver.switchTo().alert();
	        alert.sendKeys(texto);
	        alert.accept();
	    } catch (Exception e) {
	        System.err.println("Erro ao tentar escrever no alerta");
	    }
	}

	/**
	 * Método para simular o enter do teclado
	 *
	 * @param
	 */

	public void teclaEnter() throws AWTException, InterruptedException {

		try {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		} catch (Exception e) {
		}
	}

	/**
	 * Método para simular a seta para baixo do teclado
	 *
	 * @param
	 */

	public void teclaSetaBaixo() throws AWTException, InterruptedException {

		try {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		} catch (Exception e) {
		}
	}

	/**
	 * Método para simular a seta para cima do teclado
	 *
	 * @param
	 */

	public void teclaSetaCima() throws AWTException, InterruptedException {

		try {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_UP);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_UP);
		
		} catch (Exception e) {
		}
	}

}
