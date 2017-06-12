package teat.ocor;

public class Funcionário
{
	private String nome;
	private int id;
	
	public Funcionário(int id, String nome)
	{
		this.nome = nome;
		this.id = id;
	}

	public String nome()
	{
		return nome;
	}

	public int identificador()
	{
		return id;
	}
	
	@Override
	public boolean equals(Object outro)
	{
		return outro instanceof Funcionário
				&& nome.equals(((Funcionário) outro).nome)
				&& id == ((Funcionário) outro).id;
	}
}
