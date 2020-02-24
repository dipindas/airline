package com.sample.airline.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.sample.airline.service.AirlineService;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = AirlineController.class)
public class AirlineControllerTest {

	@Autowired
	private AirlineController airlineController;
	
	@Autowired
	private MockMvc mockMvc;
	
//	@MockBean
//	private AirlineService airlineService;
	
	@Test
	public void testTest() {
		assertEquals("one", "one");
	}
	
	@Test
	public void dummyTest() throws Exception {
		
		RequestBuilder request = MockMvcRequestBuilders
				.get("/test")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().string("welcome to airline world !!!"))
				.andReturn();
	}
	
	/*@Test
	public void dummyTestWithMock() throws Exception {
		
		when(airlineService.getResult()).thenReturn("welcome to airline world !!!");
		
		RequestBuilder request = MockMvcRequestBuilders
				.get("/test")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().string("welcome to airline world !!!"))
				.andReturn();
	}*/
	
	
	@Test
	public void testController() {
		String result = airlineController.testController();
		assertEquals("welcome to airline world !!!", result);
	}
	
}
