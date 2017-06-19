package teat.ocor.func;

import java.util.*;

import teat.ocor.exc.*;

public class GerenciadorFuncionários
{
	private Map<Integer, Funcionário> funcionários;
	
	public GerenciadorFuncionários()
	{
		funcionários = new HashMap<>();
	}
	
	public Collection<Funcionário> pegarFuncionários()
	{
		return funcionários.values();
	}

	public void cadastrarFuncionário(int id, String nome)
	{
		if (funcionários.containsKey(id))
			throw new ExceçãoIdRepetido();
		funcionários.put(id, new Funcionário(id, nome));
	}

	public Funcionário buscarFuncionário(int id)
	{
		return funcionários.get(id);
	}
}
