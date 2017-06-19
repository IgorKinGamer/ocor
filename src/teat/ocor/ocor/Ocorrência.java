package teat.ocor.ocor;

import teat.ocor.func.*;

public abstract class Ocorrência
{
	private String nome, descrição;
	private Tipo tipo;
	Prioridade prioridade;
	Estado estado;
	Funcionário responsável;
	
	public Ocorrência(String nome, String descrição, Tipo tipo, Prioridade prioridade)
	{
		this.nome = nome;
		this.descrição = descrição;
		this.tipo = tipo;
		this.prioridade = prioridade;
		
		estado = Estado.ABERTA;
	}

	public String nome()
	{
		return nome;
	}

	public String descrição()
	{
		return descrição;
	}

	public Tipo tipo()
	{
		return tipo;
	}

	public Estado estado()
	{
		return estado;
	}

	public Prioridade prioridade()
	{
		return prioridade;
	}

	public Funcionário responsável()
	{
		return responsável;
	}

	public static enum Tipo
	{
		TAREFA
	}
	
	public static enum Prioridade
	{
		BAIXA, MÉDIA, ALTA
	}
	
	public static enum Estado
	{
		ABERTA, COMPLETADA
	}
}
