package teat.ocor.testes;

import static org.junit.Assert.*;

import org.junit.*;

import teat.ocor.*;

public class TestesFuncionário
{
	@Test
	public void criarJosé()
	{
		Funcionário josé = new Funcionário(1, "José");
		assertEquals("José", josé.nome());
		assertEquals(1, josé.identificador());
	}
	
	@Test
	public void igualdadeFuncionários()
	{
		assertEquals(new Funcionário(1, "José"), new Funcionário(1, "José"));
		assertNotEquals(new Funcionário(1, "José"), new Funcionário(2, "José"));
		assertNotEquals(new Funcionário(1, "José"), new Funcionário(1, "João"));
	}
}
