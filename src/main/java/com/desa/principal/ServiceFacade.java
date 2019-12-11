package com.desa.principal;

import com.desa.model.DummyRequest;
import com.desa.model.DummyResponse;
import com.desa.principal.service.APIConnector;

public class ServiceFacade {
	
	private APIConnector apiConnector;
	
	public DummyResponse getDummyResponse(String arg1, String arg2, String arg3 ) {
		
		DummyRequest dummyRequest =new DummyRequest();
			dummyRequest.setArg1(arg1);
			dummyRequest.setArg2(arg2);
			dummyRequest.setArg3(arg3);
			
			dummyRequest.getRequest();
			
		DummyResponse dummyResponse =new DummyResponse(); 
			dummyResponse.setArg1( this.apiConnector.getEntry(dummyRequest.getArg1(), dummyRequest.getArg2(), dummyRequest.getArg3()) );
			
			dummyResponse.getResponse();
		
		return dummyResponse;
	}
	
	
	public void setApiConnector(APIConnector apiConnector) {
		this.apiConnector = apiConnector;
	}
	
}
