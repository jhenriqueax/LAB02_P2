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

	

	@Test
	void testaCadastraContato(){
	
		assertFalse(agendaTeste.cadastraContato(2, "Joao", "Henrique", "12345678"));
		assertFalse(agendaTeste.cadastraContato(3, "Pedro", "", "123456789"));
		
	}
	
}
