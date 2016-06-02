package com.sufow.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sufow.service.ServerLocator;

public class BaseAction extends ActionSupport  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServerLocator serverLocator;

	public ServerLocator getServerLocator() {
		return serverLocator;
	}

	public void setServerLocator(ServerLocator serverLocator) {
		this.serverLocator = serverLocator;
	}



}
