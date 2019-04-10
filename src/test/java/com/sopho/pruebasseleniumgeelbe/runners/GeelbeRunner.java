package com.sopho.pruebasseleniumgeelbe.runners;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.sopho.pruebasseleniumgeelbe.pages.CapturaDeEvindecia;
import com.sopho.pruebasseleniumgeelbe.pages.GeelbeHomePage;

public class GeelbeRunner {
	private WebDriver driver;

	@Before
	public void setUp()  {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.geelbe.com/");
		driver.manage().window().maximize();// maximiza la pagina
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

	}

	@Test
	public void test() {
		GeelbeHomePage oGeelbeHomePage = new GeelbeHomePage();
		PageFactory.initElements(driver, oGeelbeHomePage);
		oGeelbeHomePage.clickMenuHogar();
		oGeelbeHomePage.clickimagAcceso();
		CapturaDeEvindecia.capturaPatallaso(driver);
		oGeelbeHomePage.clickimgAudifo();
		CapturaDeEvindecia.capturaPatallaso(driver);
		oGeelbeHomePage.seleccionaAtrib("S--A");
		oGeelbeHomePage.seleccionaCantidad("2");
		oGeelbeHomePage.botonclickCarrito();
		CapturaDeEvindecia.capturaPatallaso(driver);
		System.out.println("confirmacionde la compra a realizar");
		System.out.println(oGeelbeHomePage.textCompraIni());
		System.out.println(oGeelbeHomePage.textCompraFin());
		assertEquals(oGeelbeHomePage.textCompraIni(), oGeelbeHomePage.textCompraFin());

	}
	
	@Test
	public void compraPorBuscador() {
		GeelbeHomePage oGeelbeHomePage = new GeelbeHomePage();
		// oGeelbeHomePage.buscarElemento()
		PageFactory.initElements(driver, oGeelbeHomePage);
		CapturaDeEvindecia.capturaPatallaso(driver);
		oGeelbeHomePage.buscarEnFiltro("reloj");
		CapturaDeEvindecia.capturaPatallaso(driver);
		oGeelbeHomePage.selecionarReloj();
		CapturaDeEvindecia.capturaPatallaso(driver);
		oGeelbeHomePage.seleccionaAtrib("S--A");
		oGeelbeHomePage.seleccionaCantidad("2");
		oGeelbeHomePage.botonclickCarrito();
		CapturaDeEvindecia.capturaPatallaso(driver);

	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
		
	}

}
