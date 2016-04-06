package br.com.jsp.modelsViews;

import br.com.jsp.models.Cliente;

public class ClienteModelView {
	private Cliente cliente;
	private String confirmacaoSenha;
	
	public String getConfirmacaoSenha() {
		return confirmacaoSenha;
	}
	
	public void setConfirmacaoSenha(String confSenha) {
		confirmacaoSenha = confSenha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
