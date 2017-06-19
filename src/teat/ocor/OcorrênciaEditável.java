package teat.ocor;

import teat.ocor.testes.*;

public class OcorrênciaEditável extends Ocorrência
{
	public OcorrênciaEditável(String nome, String descrição, Tipo tipo, Prioridade prioridade)
	{
		super(nome, descrição, tipo, prioridade);
	}

	public void completar()
	{
		if (responsável == null)
			throw new ExceçãoSemResponsável();
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
}
