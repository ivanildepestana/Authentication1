package br.ce.ip.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.ip.test.TestUserChangePassword;
import br.ce.ip.test.TestUserSessions;

@RunWith(Suite.class)
@SuiteClasses({
	TestUserSessions.class,
	TestUserChangePassword.class
	
})
public class TestSuite {

}