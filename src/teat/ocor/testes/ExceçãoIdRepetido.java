package teat.ocor.testes;

@SuppressWarnings("serial")
public class ExceçãoIdRepetido extends RuntimeException
{
	public ExceçãoIdRepetido()
	{
		super("Tentativa de cadastrar funcionário com id já existente");
	}
}
