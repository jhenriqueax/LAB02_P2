package agenda;

import java.util.Objects;

public class Favorito {
	
	/**
	 * Atributo do tipo str, que salva o nome do contato favoritado.
	 */
	private String nomeFavorito;
	/**
	 * Atributo do tipo str, que salva o sobrenome do contato favoritado.
	 */
	private String sobrenomeFavorito;

	
	/**
	 * Construtor que "constroi" o objeto favorito por meio dos parametros
	 * nome favorito e sobrenome favorito.
	 * 
	 * @param nomeFavorito nome do contato favoritado
	 * @param sobrenomeFavorito sobrenome do contato favoritado
	 */
	public Favorito(String nomeFavorito, String sobrenomeFavorito) {
		this.nomeFavorito = nomeFavorito;
		this.sobrenomeFavorito = sobrenomeFavorito;

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
