package com.example.junit;import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;import org.junit.Before;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.mockito.InjectMocks;

import org.mockito.MockitoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.web.WebAppConfiguration;

import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import org.springframework.web.context.WebApplicationContext;import com.example.controller.HotelController;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations={​​​​​​​​"classpath:myapp-servlet-context.xml"}​​​​​​​​)

@WebAppConfiguration

public class HotelControllerTest{​​​​​​​​
		@Autowired
		private WebApplicationContext webApplicationContext;
		private MockMvc mockMvc;
		@Before

		public void setup() {​​​​​​
			mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		}​​​​​​​​
		@Test
		public void testhomepage() throws Exception {​​​​​​​​
			this.mockMvc.perform(get("/"))
			.andExpect(status().isOk())
			.andExpect(forwardedUrl("webapp/index.jsp"));
		}​​​​​​​​

}​​​​​​​​

