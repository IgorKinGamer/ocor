package teat.ocor.exc;

@SuppressWarnings("serial")
public class ExceçãoProjetoExistente extends RuntimeException
{
	public ExceçãoProjetoExistente(String nome)
	{
		super("Projeto já existente: " + nome);
	}
}
