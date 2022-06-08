package controller;

public class LoginTokenAdapter implements Autenticacao{
	
	private LoginToken token;
	
	
	
	public LoginTokenAdapter(LoginToken token) {
		this.token = token;
	}
	
	@Override
	public void login() {
		
	}
}
