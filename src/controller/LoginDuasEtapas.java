package controller;

public class LoginDuasEtapas {
	
	public void fazerLogin(String nome, String senha) {
		System.out.println("Confirmar a chave");
	}
	
	public void confirmarSegundaEtapa(int chaveConfirmacao) {
		if(chaveConfirmacao <= 222) {
			System.out.println("Login realizado");
		}else {
			System.out.println("Chave errada!");
		}
	}
}
