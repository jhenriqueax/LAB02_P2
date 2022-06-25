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
	 * Construtor que "constroi" o objeto favorito por meio dos parametros nome
	 * favorito e sobrenome favorito.
	 * 
	 * @param nomeFavorito      nome do contato favoritado
	 * @param sobrenomeFavorito sobrenome do contato favoritado
	 */
	public Favorito(String nomeFavorito, String sobrenomeFavorito) {
		this.nomeFavorito = nomeFavorito;
		this.sobrenomeFavorito = sobrenomeFavorito;
	}

	/**
	 * Método que retorna o nome do objeto favorito.
	 * 
	 * @return nome favorito
	 */
	public String getNome() {
		return nomeFavorito;
	}

	/**
	 * Método que retorna o sobrenome favorito.
	 * 
	 * @return sobrenome favorito
	 */
	public String getSobrenome() {
		return sobrenomeFavorito;
	}

	/**
	 * Método tostring que imprimi o objeto favoritos retorndo nome e sobrenome
	 * favorito.
	 */
	public String toString() {

		return this.nomeFavorito + " " + this.sobrenomeFavorito;

	}

	/**
	 * Método hashcode utilizando na implementação do equals
	 */
	public int hashCode() {
		return Objects.hash(nomeFavorito, sobrenomeFavorito);
	}

	/**
	 * Método equal que compara 2 objetos.
	 */
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
