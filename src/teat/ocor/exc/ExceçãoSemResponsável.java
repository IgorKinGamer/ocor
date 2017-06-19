package teat.ocor.exc;

@SuppressWarnings("serial")
public class ExceçãoSemResponsável extends RuntimeException
{
	public ExceçãoSemResponsável()
	{
		super("Ocorrência não possui responsável atribuído");
	}
}
