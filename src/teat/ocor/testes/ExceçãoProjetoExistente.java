package teat.ocor.testes;

@SuppressWarnings("serial")
public class ExceçãoProjetoExistente extends RuntimeException
{
	public ExceçãoProjetoExistente(String nome)
	{
		super("Projeto já existente: " + nome);
	}
}
