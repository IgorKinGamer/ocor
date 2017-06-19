package teat.ocor;

import teat.ocor.testes.*;

public class Projeto
{
	private String nome;

	public Projeto(String nome)
	{
		if (nome.isEmpty())
			throw new ExceçãoNomeVazio();
		this.nome = nome;
	}

	public String nome()
	{
		return nome;
	}

	public int númeroOcorrências()
	{
		return 0;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Projeto
				&& nome.equalsIgnoreCase(((Projeto) obj).nome);
	}
}
