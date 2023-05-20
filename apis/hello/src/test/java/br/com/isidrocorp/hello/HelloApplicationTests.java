package br.com.isidrocorp.hello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.isidrocorp.hello.model.Produto;

@SpringBootTest
class HelloApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testeCriarProduto() {
		Produto p = new Produto();
		p.setId(1);
		p.setNome("Mouse");
		p.setDescricao("Mouse sem fio");
		p.setPreco(50);
		p.setQtdEstoque(4);
		p.setLinkFoto("mouse.jpg");
		Assertions.assertNotEquals(p, null);
	}
	@Test
	void testaEstoqueDiminuindo() {
		Produto p = new Produto();
		p.setQtdEstoque(10);
Assertions.assertEquals(p.diminuirEstoque(), 9);
	}
	@Test
	void estoqueNaoPodeNegativar() {
		Produto p = new Produto();
		p.setQtdEstoque(0);
		Assertions.assertEquals(p.diminuirEstoque(),0);
	}
}
