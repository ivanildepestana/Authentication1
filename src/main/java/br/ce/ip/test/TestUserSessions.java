package br.ce.ip.test;



import org.junit.Test;


import br.ce.ip.core.BaseTest;
import br.ce.ip.pages.MenuUserPage;


public class TestUserSessions extends BaseTest{
	
		MenuUserPage menuPage = new MenuUserPage ();
	
	 @Test
	 	public void UserSessions () throws InterruptedException {
		 	menuPage.UserMenuAccess();
		 	
	    		 
		}
	 
}

