package com.tmoreno.tutorial.cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class SumarFeature {
	
	private WebDriver browser;
	
	@Before
	public void init(){
		browser = new FirefoxDriver();
		browser.get("http://localhost:8080/suma");
	}

	@Dado("^que he introducido (\\d+) como primer sumando$")
	public void que_he_introducido_como_primer_sumando(int x) {
		browser.findElement(By.name("sumando1")).sendKeys(String.valueOf(x));
	}

	@Y("^que he introducido (\\d+) como segundo sumando$")
	public void que_he_introducido_como_segundo_sumando(int x) {
		browser.findElement(By.name("sumando2")).sendKeys(String.valueOf(x));
	}

	@Cuando("^oprimo el botón de sumar$")
	public void oprimo_el_botón_de_sumar() {
		browser.findElement(By.name("sumando2")).submit();
	}

	@Entonces("^el resultado debe ser (\\d+) en la pantalla$")
	public void el_resultado_debe_ser_en_la_pantalla(int resultado) {
		Assert.assertEquals(String.valueOf(resultado), browser.findElement(By.name("resultado")).getAttribute("value"));
	}
	
	@After
	public void fin(){
		browser.quit();
	}
}