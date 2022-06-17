package agenda;

/**
 * Uma agenda que mantém uma lista de contatos com posições. Podem existir 100
 * contatos.
 * 
 * @author nazareno
 *
 */

public class Agenda {

	private static final int TAMANHO_AGENDA = 100;
	private static final int TAMANHO_AGENDA_FAVORITOS = 10;

	private Favorito[] favoritos;
	private Contato[] contatos;
	

	/**
	 * Cria uma agenda.
	 */
	public Agenda() {
		this.contatos = new Contato[TAMANHO_AGENDA];
		this.favoritos = new Favorito[TAMANHO_AGENDA_FAVORITOS];
	}

	public Favorito[] getFavoritos() {
		return this.favoritos.clone();
	}

	/**
	 * Acessa a lista de contatos mantida.
	 * 
	 * @return O array de contatos.
	 */
	public Contato[] getContatos() {
		return this.contatos.clone();
	}

	/**
	 * Acessa os dados de um contato específico.
	 * 
	 * @param posicao Posição do contato na agenda.
	 * @return Dados do contato. Null se não há contato na posição.
	 */
	public Contato getContato(int posicao) {
		return contatos[posicao];
	}

	/**
	 * #############Cadastra um contato em uma posição. Um cadastro em uma posição
	 * que já existe sobrescreve o anterior.
	 * 
	 * @param posicao   Posição do contato.
	 * @param nome      Nome do contato.
	 * @param sobrenome Sobrenome do contato.
	 * @param telefone  Telefone do contato.
	 */
	public boolean cadastraContato(int posicao, String nome, String sobrenome, String telefone) {

		boolean cadastrado = false;

		for (int i = 0; i < contatos.length; i++) {

			if (contatos[i] != null) {
				if (contatos[i].getNome().equals(nome) && contatos[i].getSobrenome().equals(sobrenome)) {
					cadastrado = true;
					break;
				}
			}
			if (i == 99) {
				this.contatos[posicao] = new Contato(nome, sobrenome, telefone);
				cadastrado = false;
				break;
			}

		}
		return cadastrado;

	}

	public void cadastraContatoFavorito(int posicao, int contato) {
		this.favoritos[posicao] = new Favorito(contatos[contato].getNome(), contatos[contato].getSobrenome());
		
	}

	public Favorito getFavoritos(int i) {
		return this.favoritos[i];
	}

}
