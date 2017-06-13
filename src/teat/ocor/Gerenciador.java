package teat.ocor;

import java.util.*;

import teat.ocor.testes.*;

public class Gerenciador
{
	private Map<Integer, Funcionário> funcionários;
	
	public Gerenciador()
	{
		funcionários = new HashMap<>();
	}
	
	public Collection<Funcionário> pegarFuncionários()
	{
		return funcionários.values();
	}

	public void cadastrarFuncionário(int id, String nome)
	{
		Funcionário anterior = funcionários.put(id, new Funcionário(id, nome));
		if (anterior != null)
			throw new ExceçãoIdRepetido();
	}

	public Funcionário buscarFuncionário(int id)
	{
		return funcionários.get(id);
	}
}
