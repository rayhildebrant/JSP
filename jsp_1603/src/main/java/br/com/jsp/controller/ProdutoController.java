package br.com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.jsp.models.ProdutoService;

@Controller
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
	@RequestMapping("/produtos")
	public String todos(Model model) {
		model.addAttribute("produtos", produtoService.obterTodos());
		return "produtos";
	} 
}
