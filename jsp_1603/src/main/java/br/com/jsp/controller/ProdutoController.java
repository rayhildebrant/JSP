package br.com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import models.ProdutoServiceImpl;

@Controller
public class ProdutoController {
	
	@Autowired
	ProdutoServiceImpl produtoService;
	
	@RequestMapping("/produtos")
	public String todos(Model model) {
	model.addAttribute("produtos", produtoService.obterTodos());
		return "produtos";
	} 
}
