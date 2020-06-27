package br.ce.ip.test;

import org.junit.Test;

import br.ce.ip.core.BaseTest;
import br.ce.ip.pages.MenuUserChangePasswordPage;

public class TestUserChangePassword extends BaseTest {
	
		
		MenuUserChangePasswordPage  menuPage = new MenuUserChangePasswordPage ();
	
	 @Test
	 	public void MenuUserChangePassword () throws InterruptedException {
		 	menuPage.ChangePassword();
		 	
	    		 
		}
	 
}



