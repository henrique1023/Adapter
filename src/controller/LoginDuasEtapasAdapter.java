package controller;

public class LoginDuasEtapasAdapter implements Autenticacao{
	
	private LoginDuasEtapas login;
	
	@Override
	public void login() {
	}
	
	public LoginDuasEtapasAdapter(LoginDuasEtapas login) {
		this.login = login;
	}

}
