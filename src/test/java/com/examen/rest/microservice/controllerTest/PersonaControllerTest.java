package com.examen.rest.microservice.controllerTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.examen.rest.microservice.controller.PersonaController;
import com.examen.rest.microservice.model.Persona;
import com.examen.rest.microservice.service.PersonaService;

@RunWith(SpringRunner.class)
@WebMvcTest(PersonaController.class)
public class PersonaControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@InjectMocks
	private PersonaService personaService;
	
	private Persona persona;
	
//	@BeforeEach
//	void setUp() {
//		MockitoAnnotations.openMocks(this);
//		
//		persona = new Persona();
//		persona.setId(1);
//		persona.setNombre("ADRIAN");
//		persona.setApellidos("RODRIGUEZ");
//	    persona.setApellidos("RODARFC");
//		persona.setRfc("RODACURP");
//	    persona.setEdad("38");
//      persona.setSexo("Masculino");
//      persona.setNacionalidad("Mexicana");

	
//	}
	
//	@Test
//	public void helloUsers_basic() throws Exception{
//		RequestBuilder request = MockMvcRequestBuilders
//				.get("/hello-users")
//				.accept(MediaType.APPLICATION_JSON);
//		
//		MvcResult result = mockMvc.perform(request).andReturn();
//		
////		assertEquals("hello-usersss" ,result.getResponse().getContentAsString());
//	}

	@Test
	public void testPersona() throws Exception{
		RequestBuilder request = MockMvcRequestBuilders
				.get("/persona")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request).andReturn();
	
		
		assertEquals("Hola desde persona" ,result.getResponse().getContentAsString());
	}
}
