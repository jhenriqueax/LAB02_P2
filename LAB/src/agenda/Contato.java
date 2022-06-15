/**
 * @author João Henrique Almeida Xavier
 */

package agenda;

public class Contato {

	private String nome;
	private String sobrenome;
	private String telefone;
	private String formatada;

	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
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

	public static void cadastraContato(int posicao, String nome2, String sobrenome2, String telefone2) {

	}

	public String toString() {
		formatada = String.format("%s %s\n%s", this.nome, this.sobrenome, this.telefone);
		return formatada;

	}

}
