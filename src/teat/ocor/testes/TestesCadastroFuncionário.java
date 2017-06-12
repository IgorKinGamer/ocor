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
}
