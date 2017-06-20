package teat.ocor.ocor;

import java.util.*;

import teat.ocor.ocor.Ocorrência.*;

public class GerenciadorOcorrências
{
	private int próximaChave;
	
	private Map<Integer, Ocorrência> ocorrências;
	
	public GerenciadorOcorrências()
	{
		próximaChave = 1;
		
		ocorrências = new HashMap<>();
	}
	
	public Collection<Ocorrência> ocorrências()
	{
		return ocorrências.values();
	}

	public void cadastrarOcorrência(String nome, String descrição, Tipo tipo, Prioridade prioridade)
	{
		int chave = próximaChave++;
		Ocorrência ocorrência = new OcorrênciaEditável(chave, nome, descrição, tipo, prioridade);
		ocorrências.put(chave, ocorrência);
	}
}
