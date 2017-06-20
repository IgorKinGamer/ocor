package teat.ocor.exc;

@SuppressWarnings("serial")
public class ExceçãoSemResponsávelOuProjeto extends RuntimeException
{
	public ExceçãoSemResponsávelOuProjeto()
	{
		super("Ocorrência não possui responsável ou projeto atribuído");
	}
}
