package br.com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import models.Produto;
import models.ProdutoServiceImpl;

@Controller
public class ProdutoController {
	@Autowired(required=false)
	Produto p;
	//ProdutoServiceImpl produtoService;
	
	@RequestMapping("/produtos")
	public String todos(Model model) {
		//model.addAttribute("produtos", produtoService.obterTodos());
		return "produtos";
	}
	
}
