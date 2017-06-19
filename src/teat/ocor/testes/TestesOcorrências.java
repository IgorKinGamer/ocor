package teat.ocor.testes;

import static org.junit.Assert.*;
import static teat.ocor.Ocorrência.Estado.*;
import static teat.ocor.Ocorrência.Prioridade.*;
import static teat.ocor.Ocorrência.Tipo.*;

import org.junit.*;

import teat.ocor.*;

public class TestesOcorrências
{
	private String descrição;
	private OcorrênciaEditável ocorrência;
	
	@Before
	public void criarOcorrência()
	{
		descrição = "Conexão bluetooth para a comunicação entre celular e aparelho";
		ocorrência = new OcorrênciaEditável("Conexão bluetooth", descrição,
				TAREFA, ALTA);
	}
	
	@Test
	public void ocorrênciaCriada()
	{
		assertEquals("Conexão bluetooth", ocorrência.nome());
		assertEquals(descrição, ocorrência.descrição());
		assertEquals(TAREFA, ocorrência.tipo());
		assertEquals(ALTA, ocorrência.prioridade());
		assertEquals(ABERTA, ocorrência.estado());
	}
	
	@Test
	public void ocorrênciaCompletada()
	{
		Funcionário josé = new Funcionário(1, "José");
		ocorrência.alterarResponsável(josé);
		ocorrência.completar();
		
		assertEquals(COMPLETADA, ocorrência.estado());
	}
	
	@Test (expected = ExceçãoSemResponsável.class)
	public void completarSemResponsável()
	{
		ocorrência.completar();
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
	
	@Test (expected = ExceçãoOcorrênciaCompletada.class)
	public void alterarResponsávelDeCompletada()
	{
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
		Funcionário josé = new Funcionário(1, "José");
		ocorrência.alterarResponsável(josé);
		
		ocorrência.completar();
		ocorrência.alterarPrioridade(BAIXA);
	}
}
