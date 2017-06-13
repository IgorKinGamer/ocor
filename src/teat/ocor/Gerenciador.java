package teat.ocor;

import java.util.*;

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
		funcionários.put(id, new Funcionário(id, nome));
	}

	public Funcionário buscarFuncionário(int id)
	{
		return funcionários.get(id);
	}

}
