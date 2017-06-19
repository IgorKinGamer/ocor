package teat.ocor;

import java.util.*;

import teat.ocor.testes.*;

public class GerenciadorProjetos
{
	private Map<String, Projeto> projetos;
	
	public GerenciadorProjetos()
	{
		projetos = new HashMap<>();
	}
	
	public Collection<Projeto> pegarProjetos()
	{
		return projetos.values();
	}

	public void cadastrarProjeto(String nome)
	{
		nome = nome.toLowerCase();
		if (projetos.containsKey(nome))
			throw new ExceçãoProjetoExistente(nome);
		projetos.put(nome, new Projeto(nome));
	}

	public Projeto buscarProjeto(String nome)
	{
		return projetos.get(nome.toLowerCase());
	}
}
