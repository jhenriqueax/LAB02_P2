/**
 * @author João Henrique Almeida Xavier
 */

package agenda;

import java.util.Iterator;

public class Contato {

	private String nome;
	private String sobrenome;
	private String telefone;
	private String[] tag;
	private int posicaofavorito;
	
	public int getPosicaofavorito() {
		return posicaofavorito;
	}

	public void setPosicaofavorito(int posicaofavorito) {
		this.posicaofavorito = posicaofavorito;
	}

	private String concatena;
	private String formatada;

	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.tag = new String[5];
		this.concatena = "";
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

	
	public static void cadastraContato(int posicao, String nome2, String sobrenome2, String telefone2) {

	}

	public String toString() {
		
		for (int i = 0; i < tag.length; i++) {
			
			if(tag[i] != null){
			concatena += tag[i] + " ";
			}
		}
	
		formatada = String.format("%s %s\n%s \n%s", this.nome, this.sobrenome, this.telefone, this.concatena);
		return formatada;

	}
	


}
