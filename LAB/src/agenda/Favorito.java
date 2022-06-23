package agenda;

import java.util.Objects;

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

	public int hashCode() {
		return Objects.hash(nomeFavorito, sobrenomeFavorito);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Favorito other = (Favorito) obj;
		return Objects.equals(nomeFavorito, other.nomeFavorito)
				&& Objects.equals(sobrenomeFavorito, other.sobrenomeFavorito);
	}
}


	
