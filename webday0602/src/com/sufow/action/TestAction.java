package com.sufow.action;

import com.sufow.service.ServerLocator;

public class TestAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public String execute(){
		ServerLocator server = this.getServerLocator();
		String result = server.getSufowService().show();
		
		System.out.println("result--->"+result);
		return "success";
	}
}
