# testeAutomatizado_JavaSelenium

Configuração de ambiente

- Nesta seção serão informados os locais que haverá a necessidade de verificar alguns diretórios, 
antes dos testes serem realizados.
  
Procure pelo arquivo "Step_mapping.java", localizado em src/test/java/steps_map e encontre a seção:

  @Given ("Acessada a pagina do Submarino")
    public void submarino_homePage() {
    	System.setProperty("webdriver.firefox.driver", "FIREFOX_PATH");
		driver = new FirefoxDriver();
	    driver.get("https://www.submarino.com.br/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
    }

  Onde possui "FIREFOX_PATH", substitua pelo diretório onde se encontra o arquivo de driver do 
  Mozilla Firefox ("Geckodriver").
  
  Execução de Testes
  
  Para executar o "Desafio ZUP", encontre o arquivo "Step_execution.java" localizado em src/test/java/steps_running 
  e clique com o botão direito do mouse. No menu, vá até "Run as" e selecione a opção "JUnit Test".
