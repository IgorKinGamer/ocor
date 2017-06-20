package teat.ocor.ocor;

import teat.ocor.exc.*;
import teat.ocor.func.*;
import teat.ocor.proj.*;

public class OcorrênciaEditável extends Ocorrência
{
	public OcorrênciaEditável(int chave, String nome, String descrição, Tipo tipo, Prioridade prioridade)
	{
		super(chave, nome, descrição, tipo, prioridade);
	}

	public void completar()
	{
		if (responsável == null || projeto == null)
			throw new ExceçãoSemResponsávelOuProjeto();
		estado = Estado.COMPLETADA;
	}

	public void alterarResponsável(Funcionário responsável)
	{
		if (estado == Estado.COMPLETADA)
			throw new ExceçãoOcorrênciaCompletada();
		this.responsável = responsável;
	}

	public void alterarPrioridade(Prioridade prioridade)
	{
		if (estado == Estado.COMPLETADA)
			throw new ExceçãoOcorrênciaCompletada();
		this.prioridade = prioridade;
	}

	public void alterarProjeto(Projeto projeto)
	{
		this.projeto = projeto;
	}
}
