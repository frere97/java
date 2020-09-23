package br.com.dh.lojaonline.Controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dh.lojaonline.model.DataBase;
import br.com.dh.lojaonline.model.entities.Cliente;
import br.com.dh.lojaonline.model.entities.Produto;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {
	
	private DataBase db = new DataBase();
	
	@GetMapping()
	public List<Object> getProdutos(){
	return db.list("produtos");	
	}
	
	@PostMapping()
	public void addProduto(@RequestBody Produto produto) {
		db.save("produtos", produto);
	}


}
