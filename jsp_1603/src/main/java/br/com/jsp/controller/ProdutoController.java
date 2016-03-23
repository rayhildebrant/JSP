package br.com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.jsp.models.Produto;
import br.com.jsp.models.ProdutoService;

@Controller
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
	@RequestMapping("/produtos")
	public String todos(@RequestParam(value="categoriaId", required=false)Long id, Model model) {
		if (id == null) {
			model.addAttribute("produtos", produtoService.obterTodos());
		} else {
			model.addAttribute("produtos", produtoService.obterPorCategoria(id));
		}
		return "produtos";

	}
	
	@RequestMapping("/detalhe/{id}")
	public String detalhe (@PathVariable ("id") long id, Model model) {
		Produto produto;
		produto = produtoService.obterPorId(id);
		model.addAttribute("produto", produto);
		return "produto-detalhe";
	}
}
