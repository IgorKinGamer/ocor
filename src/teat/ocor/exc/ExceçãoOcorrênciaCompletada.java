package teat.ocor.exc;

@SuppressWarnings("serial")
public class ExceçãoOcorrênciaCompletada extends RuntimeException
{
	public ExceçãoOcorrênciaCompletada()
	{
		super("Impossível alterar ocorrência já completada");
	}
}
