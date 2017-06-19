package teat.ocor.testes;

import static org.junit.Assert.*;

import org.junit.*;

import teat.ocor.*;

public class TestesProjeto
{
	@Test
	public void criarProjeto()
	{
		Projeto projeto = new Projeto("Controle Celular");
		assertEquals("Controle Celular", projeto.nome());
		assertEquals(0, projeto.númeroOcorrências());
	}
	
	@Test
	public void igualdadeProjetos()
	{
		assertEquals(new Projeto("Controle Celular"), new Projeto("Controle Celular"));
		assertEquals(new Projeto("controle celular"), new Projeto("Controle Celular"));
		assertNotEquals(new Projeto("Controle"), new Projeto("Controle Celular"));
	}
	
	@Test (expected = ExceçãoNomeVazio.class)
	public void exceçãoNomeVazio()
	{
		new Projeto("");
	}
}
