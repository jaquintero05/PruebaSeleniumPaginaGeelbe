package com.sopho.pruebasseleniumgeelbe.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class GeelbeHomePage {

	
	@FindBy(xpath = "//a[@title='Hogar']") // es locator o (localizadior)
	private WebElement menuHogar;
	@FindBy(xpath = "//input[@name='query']")
	private WebElement buscador;
	@FindBy(xpath = "//a[@title='Hombre']")
	private WebElement menuHombre;
	@FindBy(xpath = "//a[@title='Mujer']")
	private WebElement menuMujer;
	@FindBy(xpath = "//a[@title='Ni�os']")
	private WebElement menuNiños;
	@FindBy(xpath = "//li[3]//a[1]//div[1]//img[1]")
	private WebElement imagAcceso;
	@FindBy(xpath = "//img[@alt='Vino Reserva Cabernet Sauvignon 750 Ml 0687 - Tierra Del Fuego']")
	private WebElement imagAudifo;
	
	@FindBy(xpath = "//select[@class='attribute']")
	private WebElement seleccinarAtributo;
	
	private Select seleccinarAtrib;
	
	@FindBy(xpath = "//select[@name='quantity']")
	private WebElement seleccinarCantida;
	private Select seleccionarCanti;
	
	@FindBy(xpath = "//button[@name='buy']")
	private WebElement botonAgregarCarrito;
	@FindBy(xpath = "//div[@id='alertBg']")
	private WebElement mensajeAler;
	
	@FindBy(xpath = "//h1[@itemprop='name']")
	private WebElement texarticulAcompr;
	@FindBy(xpath = "//p[@class='nombre']")
	private WebElement texArticulCarrrito;
	
	@FindBy(xpath = "//img[@alt='Reloj Gravity Multicolor-Blanco 7013 - Mulco']")
	private WebElement productoReloj;
	
	private String valorIni;
	private String valorFin;
	


//	  public GeelbeHomePage(WebDriver driver) {
//	  
//	  this.driver = driver;
//	  
//	  }
	 

	/*
	 * public void buscarElemento() {
	 * 
	 * menuHogar = driver.findElement(By.xpath("//a[@title='Hogar']")); buscador =
	 * driver.findElement(By.xpath("//input[@name='query']")); menuHombre =
	 * driver.findElement(By.xpath("//a[@title='Hombre']")); menuMujer =
	 * driver.findElement(By.xpath("//a[@title='Mujer']")); menuNi�os =
	 * driver.findElement(By.xpath("//a[@title='Ni�os']")); imagAcceso =
	 * driver.findElement(By.xpath("//li[3]//a[1]//div[1]//img[1]"));
	 * 
	 * }
	 */

	public void clickMenuHogar() {
		menuHogar.click();
	}

	public void clickMenuHombrer() {

		menuHombre.click();
	}

	public void buscarEnFiltro(String text) {
		buscador.sendKeys(text);
		buscador.submit();

	}

	public void clickMenuMujer() {

		menuMujer.click();
	}

	public void clickMenuNiños() {

		menuNiños.click();
	}

	public void clickimagAcceso() {

		imagAcceso.click();
	}

	public void clickimgAudifo() {

		imagAudifo.click();
		valorIni=texarticulAcompr.getText();
	}

	public void seleccionaAtrib(String valor) {

		seleccinarAtrib = new Select(seleccinarAtributo);
		seleccinarAtrib.selectByVisibleText(valor);

	}

	public void seleccionaCantidad(String valor) {

		seleccionarCanti = new Select(seleccinarCantida);
		seleccionarCanti.selectByVisibleText(valor);

	}

	public void botonclickCarrito() {

		botonAgregarCarrito.click();
		valorFin=texArticulCarrrito.getText();

	}
	
	public String textCompraIni() {

		//me convierte el text en minuscula
		return valorIni.toLowerCase();
	}
	
	public String textCompraFin() {

		
		return valorFin.toLowerCase();
	}
 
	public void selecionarReloj() {

		productoReloj.click();
	}
	
	

}
