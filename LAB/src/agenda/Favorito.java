package agenda;

public class Favorito {

	private String nomeFavorito;
	private String sobrenomeFavorito;


	public Favorito(String nomeFavorito, String sobrenomeFavorito) {
		this.nomeFavorito = nomeFavorito;
		this.sobrenomeFavorito = sobrenomeFavorito;

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

	public String toString() {
		
		return this.nomeFavorito + " " + this.sobrenomeFavorito;
		
	}
}
