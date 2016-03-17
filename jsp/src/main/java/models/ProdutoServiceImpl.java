package models;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class ProdutoServiceImpl implements ProdutoService {
	@Autowired
	ProdutoRepository produtoRepository;

	@Override
	public List<Produto> obterTodos() {
		return produtoRepository.obterTodos();
	}

}
