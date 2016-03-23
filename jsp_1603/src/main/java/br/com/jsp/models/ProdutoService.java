package br.com.jsp.models;

import java.util.List;

public interface ProdutoService {
	List<Produto> obterTodos();
	Produto obterPorId(long id);
	List<Produto> obterPorCategoria(long id);
}
