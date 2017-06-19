package teat.ocor.testes;

@SuppressWarnings("serial")
public class ExceçãoNomeVazio extends RuntimeException
{
	public ExceçãoNomeVazio()
	{
		super("Projetos não podm ter nome vazio");
	}
}
