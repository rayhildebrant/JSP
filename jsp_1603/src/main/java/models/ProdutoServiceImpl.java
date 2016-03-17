package models;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	@Autowired
	NaMemoriaProdutoRepository produtoRepository;

	@Override
	public List<Produto> obterTodos() {
		return produtoRepository.obterTodos();
	}

}
