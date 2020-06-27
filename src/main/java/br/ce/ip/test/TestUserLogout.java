package br.ce.ip.test;

import org.junit.Test;
import br.ce.ip.core.BaseTest;
import br.ce.ip.pages.MenuUserLogout;


public class TestUserLogout extends BaseTest {
	
	
	MenuUserLogout  menuLogout = new MenuUserLogout ();

 @Test
 	public void MenuUserLogout() throws InterruptedException {
	 	menuLogout.Logout();
	 	
    		 
	}
 
}
