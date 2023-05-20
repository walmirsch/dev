package br.com.isidrocorp.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.hello.model.Produto;

@RestController
public class HelloController {

	@GetMapping("/teste")
	public String digaOla() {
		return "Hello world. Meu primeiro endpoint (api).";
	}

	@GetMapping("/produto")
	public Produto recuperarProduto() {
		Produto p = new Produto();
		p.setId(1234);
		p.setNome("Computador Top de Linha");
		p.setDescricao("Computador Top de Linha cheio de Luzinhas que fica um circo de noite");
		p.setPreco(2500.00);
		p.setQtdEstoque(4);
		p.setLinkFoto("computador.jpg");
		return p;
	}

@PostMapping ("/produto")
	public ResponseEntity<Produto> receberProduto(@RequestBody Produto p) {
	System.out.println("Recebido produto: " + p);
	if(p.getPreco()<=0 || p.getQtdEstoque()<=0) {
		return ResponseEntity.badRequest().build();
	}
	return ResponseEntity.ok(p);
}
} // HelloController
