package br.com.dh.lojaonline.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dh.lojaonline.model.entities.Cliente;
import br.com.dh.lojaonline.model.repositories.clienteRepository;

@RestController
@RequestMapping(path = "/cliente")
public class ClientController {

	@Autowired
	private clienteRepository clienteRepository;
	
	@GetMapping
	public Iterable<Cliente> getClientes(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> getById(@PathVariable int id){
		return clienteRepository.findById(id);
	}

	@PostMapping()
	public Cliente addCliente(@RequestBody Cliente cliente) {
		
		clienteRepository.save(cliente);
		return cliente;
	}

	@PutMapping("/{idCliente}")
	public Cliente updateCliente(@PathVariable int idCliente, @RequestBody Cliente dadosCliente) throws Exception{
		Cliente meuCliente = clienteRepository.findById(idCliente).orElseThrow(() -> new IllegalAccessException());
		
		if(!dadosCliente.getCpf().isEmpty()) {meuCliente.setCpf(dadosCliente.getCpf());}
		clienteRepository.save(meuCliente);
		
		return meuCliente;
	}
	
	@DeleteMapping("/{id}")
	public void DeleteCliente(@PathVariable int id) {
		clienteRepository.deleteById(id);
		
	}
	
}