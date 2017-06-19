package teat.ocor.testes;

@SuppressWarnings("serial")
public class ExceçãoSemResponsável extends RuntimeException
{
	public ExceçãoSemResponsável()
	{
		super("Ocorrência não possui responsável atribuído");
	}
}
