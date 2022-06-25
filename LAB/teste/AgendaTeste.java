import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import agenda.Agenda;

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
	 * Testando limite das posiçoes do array de 100
	 */
	@Test
	void testaCadastraContato03(){
	
		assertFalse(agendaTeste.cadastraContato(1, "Joao", "Henrique", "555-1234"));
		assertFalse(agendaTeste.cadastraContato(50, "Gabriel", "Lacerda", "555-2345"));
		assertFalse(agendaTeste.cadastraContato(100, "Lucas", "Carvalho", "555-3456"));
		
		
	}


}
