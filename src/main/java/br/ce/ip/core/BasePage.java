package br.ce.ip.core;
import static br.ce.ip.core.DriverFactory.getDriver;
import org.openqa.selenium.By;


	public class BasePage {
		

		
		/********* TextField ************/
		
		public void write(By By, String text){
			getDriver().findElement(By).clear();
			getDriver().findElement(By).sendKeys(text);
		}

			
		public void write(String id_campo, String text){
			write(By.id(id_campo), text);
		}
			
				
		
		public String getFieldValue(String id_campo) {
			return getDriver().findElement(By.id(id_campo)).getAttribute("value");
		}


		/********* Radio and Check **************/

		
	    public boolean checkBox(String id){
	    	getDriver().findElement(By.id(id)).click();
			return false;
			
			}
		
	    /********* Button ************/
		
		public void clickButton(By by) {
			getDriver().findElement(by).click();
		}
		
		public void clickButton(String id) {
			getDriver().findElement(By.id(id)).click();
		}
		
		public void clicButtonXpath(String id) {
	    	 getDriver().findElement(By.xpath(id)).click();
		}
		
		public String getElementValue(String id) {
			return getDriver().findElement(By.id(id)).getAttribute("value");
		}
			
		/********* Link  ************/
		
		 public void clickLink(String link){
			 getDriver().findElement(By.linkText(link)).click();
			
		 }
			
	     public void clickXpath(String id) {
	    	 getDriver().findElement(By.xpath(id)).click();
	    	
	    		
		}
	     public void click(String id) {
	    	 getDriver().findElement(By.id(id)).click();
	    					 
		}
		 
		 /********* Textos ************/
			
		public String getText(By by) {
				return getDriver().findElement(by).getText();
		}
			
		public String getText(String id) {
				return getText(By.id(id));
		}

	}

