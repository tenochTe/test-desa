package com.desa.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.desa.model.DummyRequest;
import com.desa.principal.ServiceFacade;
import com.desa.principal.service.APIConnector;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/app-config.xml")
public class ServiceFacadeTest {

	@Resource(name = "serviceFacade")
	private ServiceFacade serviceFacade;
	
	@Resource(name = "apiConnector")
	private APIConnector apiConnector;
	
	@Test
	public void test1() {
		
		DummyRequest dummyRequest =new DummyRequest();
		DummyRequest spyDummyRequest = Mockito.spy(dummyRequest);
			spyDummyRequest.setArg1("A");
			spyDummyRequest.setArg2("B");
			spyDummyRequest.setArg3("C");
		
		Mockito.when(spyDummyRequest.getRequest()).thenReturn("YeaaaH!");
		
		serviceFacade.getDummyResponse("A", "B", "C");
	}
	
	
}
