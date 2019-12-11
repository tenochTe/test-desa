package com.desa.principal.service.impl;

import com.desa.principal.service.APIConnector;

public class APIConnectorImpl implements APIConnector {

	@Override
	public String getEntry(String arg1, String arg2, String arg3) {
		return "-> APIConnector: ".concat(arg1).concat(" - ").concat(arg2).concat(" - ").concat(arg3);
	}

}
