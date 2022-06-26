

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import agenda.Agenda;
import agenda.Favorito;



class AgendaTeste {
	
	private Agenda agendaTeste;
	

	
	@BeforeEach
	void preparaAgenda(){
		
		Agenda agenda = new Agenda();
		this.agendaTeste = agenda;
		
		
	}

	
	/**
	 * Testando comportamento com todos os  parametros 
	 */
	@Test
	void testaCadastraContato01(){
	
		assertFalse(agendaTeste.cadastraContato(2, "Eduardo", "Gabriel", "12345678"));
	}
	
	/**
	 * Testando comportamento sem o parametro sobrenome 
	 */
	@Test
	void testaCadastraContato02(){
	
		assertFalse(agendaTeste.cadastraContato(2, "Livia", "", "12345678"));
		
	}
	
	/**
	 * Testando comportamento com os limite das posiçoes do array de 100
	 */
	@Test
	void testaCadastraContato03(){
	
		assertFalse(agendaTeste.cadastraContato(1, "Joao", "Henrique", "555-1234"));
		assertFalse(agendaTeste.cadastraContato(50, "Gabriel", "Lacerda", "555-2345"));
		assertFalse(agendaTeste.cadastraContato(100, "Lucas", "Carvalho", "555-3456"));
		
		
	}
	
	/**
	 * Testando comportamento com o contato já cadastrado 
	 */
	@Test
	void testaCadastraContato04(){
		
		agendaTeste.cadastraContato(2, "Joao", "Henrique", "12345678");
	
		assertTrue(agendaTeste.cadastraContato(22, "Joao", "Henrique", "12345678"));
		
	}


	void testaCadastroFavorito01(){
		
		agendaTeste.cadastraContato(1, "Joao", "Henrique", "555-12345");
		
		agendaTeste.cadastraContatoFavorito(4, 1);
		
		//assertEquals(agendaTeste.getFavoritos(4) , agendaTeste.cadastraContatoFavorito(4, 1));
		
		
	}


	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	






}
