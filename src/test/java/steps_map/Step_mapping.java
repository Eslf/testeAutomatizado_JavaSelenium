package steps_map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Step_mapping {
	
	private static WebDriver driver;
	
	 // Steps for f1_productSearch.feature

    @Given ("Acessada a pagina do Submarino")
    public void submarino_homePage() {
    	System.setProperty("webdriver.firefox.driver", "/usr/local/bin/geckodriver");
		driver = new FirefoxDriver();
	    driver.get("https://www.submarino.com.br/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
    }

    @When ("Pesquisado no campo de busca por caneta bic")
    public void search_product() {
    	driver.findElement(By.id("h_search-input")).sendKeys("caneta bic");
    	driver.findElement(By.id("h_search-btn")).click();
    }
        

    @Then ("O site retorna o resultado da pesquisa")
    public void validate_search() {
    	assertThat(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/div/div[1]/div/div[2]/div[1]/div/div/h1")).getText(), is("caneta bic"));

    }
        
    // Steps for f2_addToCart.feature

  @Given ("Clicado no primeiro produto da lista")
  public void select_firstItemOnList() {
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/div/div[1]/div/div[2]/div[6]/div/div/div/div[1]/div[1]/div/div[2]/a/section/div[1]/div/div/picture/img")).click();
  }
      
  @When ("E adicionado o produto ao carrinho de compras")
  public void addItemToCart() {
	  driver.findElement(By.cssSelector(".hyuQAM")).click();
  }
    
  @Then ("E exibida a lista de produtos no carrinho")
  public void validate_itemAddedToCart() {
	  assertThat(driver.findElement(By.xpath("/html/body/div[4]/section/header/h2")).getText(), is("Meu carrinho"));
	  driver.findElement(By.xpath("/html/body/div[4]/section/section/div[1]/div[2]/div[1]/section/ul/li/div[2]/div[1]/h2/a"));
	  driver.close();
  }
	
}
