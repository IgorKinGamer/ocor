package teat.ocor.testes;

import static org.junit.Assert.*;
import static teat.ocor.ocor.Ocorrência.Estado.*;
import static teat.ocor.ocor.Ocorrência.Prioridade.*;
import static teat.ocor.ocor.Ocorrência.Tipo.*;

import org.junit.*;

import teat.ocor.exc.*;
import teat.ocor.func.*;
import teat.ocor.ocor.*;
import teat.ocor.proj.*;

public class TestesOcorrências
{
	private String descrição;
	private OcorrênciaEditável ocorrência;
	
	@Before
	public void criarOcorrência()
	{
		descrição = "Conexão bluetooth para a comunicação entre celular e aparelho";
		ocorrência = new OcorrênciaEditável(1, "Conexão bluetooth", descrição,
				TAREFA, ALTA);
	}
	
	@Test
	public void ocorrênciaCriada()
	{
		assertEquals(1, ocorrência.chave());
		assertEquals("Conexão bluetooth", ocorrência.nome());
		assertEquals(descrição, ocorrência.descrição());
		assertEquals(TAREFA, ocorrência.tipo());
		assertEquals(ALTA, ocorrência.prioridade());
		assertEquals(ABERTA, ocorrência.estado());
		assertEquals(null, ocorrência.responsável());
		assertEquals(null, ocorrência.projeto());
	}
	
	@Test
	public void ocorrênciaCompletada()
	{
		Projeto projeto = new Projeto("Controle Celular");
		ocorrência.alterarProjeto(projeto);
		Funcionário josé = new Funcionário(1, "José");
		ocorrência.alterarResponsável(josé);
		ocorrência.completar();
		
		assertEquals(COMPLETADA, ocorrência.estado());
	}
	
	@Test
	public void alterarResponsável()
	{
		Funcionário josé = new Funcionário(1, "José");
		ocorrência.alterarResponsável(josé);
		assertEquals(new Funcionário(1, "José"), ocorrência.responsável());
	}
	
	@Test
	public void alterarPrioridade()
	{
		ocorrência.alterarPrioridade(BAIXA);
		assertEquals(BAIXA, ocorrência.prioridade());
	}
	
	@Test
	public void alterarProjeto()
	{
		Projeto projeto = new Projeto("Controle Celular");
		ocorrência.alterarProjeto(projeto);
		assertEquals(projeto, ocorrência.projeto());
	}
	
	@Test (expected = ExceçãoSemResponsávelOuProjeto.class)
	public void completarSemResponsável()
	{
		Projeto projeto = new Projeto("Controle Celular");
		ocorrência.alterarProjeto(projeto);
		ocorrência.completar();
	}
	
	@Test (expected = ExceçãoSemResponsávelOuProjeto.class)
	public void completarSemProjeto()
	{
		Funcionário josé = new Funcionário(1, "José");
		ocorrência.alterarResponsável(josé);
		ocorrência.completar();
	}
	
	@Test (expected = ExceçãoOcorrênciaCompletada.class)
	public void alterarResponsávelDeCompletada()
	{
		Projeto projeto = new Projeto("Controle Celular");
		ocorrência.alterarProjeto(projeto);
		Funcionário josé, joão;
		josé = new Funcionário(1, "José");
		joão = new Funcionário(2, "João");
		
		ocorrência.alterarResponsável(josé);
		ocorrência.completar();
		ocorrência.alterarResponsável(joão);
	}
	
	@Test (expected = ExceçãoOcorrênciaCompletada.class)
	public void alterarPrioridadeDeCompletada()
	{
		Projeto projeto = new Projeto("Controle Celular");
		ocorrência.alterarProjeto(projeto);
		Funcionário josé = new Funcionário(1, "José");
		ocorrência.alterarResponsável(josé);
		
		ocorrência.completar();
		ocorrência.alterarPrioridade(BAIXA);
	}
}
