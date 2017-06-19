package teat.ocor.testes;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

import teat.ocor.*;

public class TestesCadastroProjetos
{
	@Test
	public void nenhumProjetoCadastrado()
	{
		GerenciadorProjetos gerenciador = new GerenciadorProjetos();
		Collection<Projeto> projetos = gerenciador.pegarProjetos();
		assertEquals(0, projetos.size());
	}
	
	@Test
	public void cadastrarControleCelular()
	{
		GerenciadorProjetos gerenciador = new GerenciadorProjetos();
		Collection<Projeto> projetos = gerenciador.pegarProjetos();
		
		gerenciador.cadastrarProjeto("Controle Celular");
		
		assertEquals(new Projeto("Controle Celular"), projetos.iterator().next());
	}
	
	@Test (expected = ExceçãoProjetoExistente.class)
	public void cadastrarProjetoRepetido()
	{
		GerenciadorProjetos gerenciador = new GerenciadorProjetos();
		gerenciador.cadastrarProjeto("Controle Celular");
		gerenciador.cadastrarProjeto("CONTROLE celular");
	}
	
	@Test
	public void buscarProjeto()
	{
		GerenciadorProjetos gerenciador = new GerenciadorProjetos();
		gerenciador.cadastrarProjeto("Controle Celular");
		
		assertEquals(new Projeto("CONTROLE CELULAR"), gerenciador.buscarProjeto("controle celular"));
		assertEquals(null, gerenciador.buscarProjeto("Panela de Pizza"));
	}
}
