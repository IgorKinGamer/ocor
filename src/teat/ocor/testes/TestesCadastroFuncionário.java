package teat.ocor.testes;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

import teat.ocor.*;

public class TestesCadastroFuncionário
{
	@Test
	public void gerenciadorVazio()
	{
		Gerenciador gerenciador = new Gerenciador();
		Collection<Funcionário> funcionários = gerenciador.pegarFuncionários();
		assertEquals(0, funcionários.size());
	}
	
	@Test
	public void cadastrarJosé()
	{
		Gerenciador gerenciador = new Gerenciador();
		Collection<Funcionário> funcionários = gerenciador.pegarFuncionários();
		
		gerenciador.cadastrarFuncionário(1, "José");
		
		assertEquals(1, funcionários.size());
		assertEquals(new Funcionário(1, "José"), funcionários.iterator().next());
	}
	
	@Test
	public void buscarFuncionárioPorId()
	{
		Gerenciador gerenciador = new Gerenciador();
		
		gerenciador.cadastrarFuncionário(1, "José");
		
		assertEquals(new Funcionário(1, "José"), gerenciador.buscarFuncionário(1));
		assertEquals(null, gerenciador.buscarFuncionário(2));
	}
	
	@Test (expected = ExceçãoIdRepetido.class)
	public void cadastrarFuncionárioComIdRepetido()
	{
		Gerenciador gerenciador = new Gerenciador();
		
		gerenciador.cadastrarFuncionário(1, "José");
		gerenciador.cadastrarFuncionário(1, "João");
	}
}
