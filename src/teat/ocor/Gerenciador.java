package teat.ocor;

import java.util.*;

public class Gerenciador
{
	private List<Funcionário> funcionários;
	
	public Gerenciador()
	{
		funcionários = new LinkedList<>();
	}
	
	public Collection<Funcionário> pegarFuncionários()
	{
		return funcionários;
	}

	public void cadastrarFuncionário(int id, String nome)
	{
		funcionários.add(new Funcionário(id, nome));
	}

	public Funcionário buscarFuncionário(int id)
	{
		for (Funcionário f : funcionários)
			if (f.identificador() == id)
				return f;
		return null;
	}

}
