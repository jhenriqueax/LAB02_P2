package agenda;

public class Favorito {

	private String nomeFavorito;
	private String sobrenomeFavorito;
	private String telefoneFavorito;

	public Favorito(String nomeFavorito, String sobrenomeFavorito, String telefoneFavorito) {
		this.nomeFavorito = nomeFavorito;
		this.sobrenomeFavorito = sobrenomeFavorito;
		this.telefoneFavorito = telefoneFavorito;
	}

	public Favorito(Contato contato) {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nomeFavorito;
	}

	public String getSobrenome() {
		return sobrenomeFavorito;
	}

	public String getTelefone() {
		return telefoneFavorito;
	}

	public String toString() {
		
		return this.nomeFavorito + " " + this.sobrenomeFavorito;
		
		
	}
}
