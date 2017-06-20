package teat.ocor.ocor;

import teat.ocor.func.*;
import teat.ocor.proj.*;

public abstract class Ocorrência
{
	private int chave;
	private String nome, descrição;
	private Tipo tipo;
	Prioridade prioridade;
	Estado estado;
	Funcionário responsável;
	Projeto projeto;
	
	public Ocorrência(int chave, String nome, String descrição, Tipo tipo, Prioridade prioridade)
	{
		this.chave = chave;
		this.nome = nome;
		this.descrição = descrição;
		this.tipo = tipo;
		this.prioridade = prioridade;
		
		estado = Estado.ABERTA;
	}

	public int chave()
	{
		return chave;
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

	public Projeto projeto()
	{
		return projeto;
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
