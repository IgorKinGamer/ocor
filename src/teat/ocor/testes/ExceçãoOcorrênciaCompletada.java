package teat.ocor.testes;

@SuppressWarnings("serial")
public class ExceçãoOcorrênciaCompletada extends RuntimeException
{
	public ExceçãoOcorrênciaCompletada()
	{
		super("Impossível alterar ocorrência já completada");
	}
}
