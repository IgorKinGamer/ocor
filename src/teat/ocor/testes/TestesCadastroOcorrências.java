package teat.ocor.testes;

import static org.junit.Assert.*;
import static teat.ocor.ocor.Ocorrência.Prioridade.*;
import static teat.ocor.ocor.Ocorrência.Tipo.*;

import java.util.*;

import org.junit.*;

import teat.ocor.ocor.*;

public class TestesCadastroOcorrências
{
	private String descrição;
	
	@Before
	public void criarOcorrência()
	{
		descrição = "Conexão bluetooth para a comunicação entre celular e aparelho";
		//ocorrência = new OcorrênciaEditável(1, "Conexão bluetooth", descrição,
		//		TAREFA, ALTA);
	}
	
	@Test
	public void nenhumaOcorrência()
	{
		GerenciadorOcorrências gerenciador = new GerenciadorOcorrências();
		Collection<Ocorrência> ocorrências = gerenciador.ocorrências();
		assertEquals(0, ocorrências.size());
	}
	
	@Test
	public void ocorrênciaCadastrada()
	{
		GerenciadorOcorrências gerenciador = new GerenciadorOcorrências();
		Collection<Ocorrência> ocorrências = gerenciador.ocorrências();
		
		gerenciador.cadastrarOcorrência("Conexão bluetooth", descrição, TAREFA, ALTA);
		
		assertEquals(1, ocorrências.size());
		assertEquals(1, ocorrências.iterator().next().chave());
	}
}
