/**
 * @author João Henrique Almeida Xavier
 */

package agenda;

public class Contato {

	/**
	 * Atributo do tipo str, que salva o nome do contato.
	 */
	private String nome;
	/**
	 * Atributo do tipo str, que salva o sobrenome do contato.
	 */
	private String sobrenome;
	/**
	 * Atributo do tipo str, que salva o telefone do contato.
	 */
	private String telefone;
	/**
	 * Array de str, que salva as tags do contato.
	 */
	private String[] tag;
	/**
	 * Atributo do tipo int, que salva a posição em que o contato foi favoritado.
	 */
	private int posicaoFavorito;
	/**
	 * Atributo do tipo str, que auxilia na concatenação das tags para sua exibição 
	 * no método toString
	 */
	private String concatena;
	/**\
	 * /**
	 * Atributo do tipo str, que auxilia na formatação das tags para sua exibição 
	 * no método toString
	 */
	private String formatada;
	
	
	/**
	 * Construtor que "constroi"  o objeto contato com os parametros nome, sobrenome
	 * e telefone previamente informados pelo usuário, além de inicializar outros atributos.
	 *  
	 * @param nome nome do contato
	 * @param sobrenome sobrenome do contato
	 * @param telefone telefone do contato
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.tag = new String[5];
	
	}
	
	
	/**
	 * Método que retornar a posição em que o contato foi favoritado.
	 *
	 * @return posicaoFavorito posicao favorita do contato
	 */
	public int getPosicaofavorito() {
		return posicaoFavorito;
	}

	/**
	 * Método que defini (salva) a posição em que o contato foi favoritado.
	 * 
	 * @param posicaofavorito posicao favorita do contato
	 */
	public void setPosicaofavorito(int posicaofavorito) {
		this.posicaoFavorito = posicaofavorito;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public String[] getTag() {
		return tag;
	}

	public void setTag(int posicao, String tag) {
		this.tag[posicao] = tag;

	}

	public String toString() {

		for (int i = 0; i < tag.length; i++) {

			if (tag[i] != null) {
				concatena += tag[i] + " ";
			}
		}

		formatada = String.format("%s %s\n%s \n%s", this.nome, this.sobrenome, this.telefone, this.concatena);
		return formatada;

	}

}
