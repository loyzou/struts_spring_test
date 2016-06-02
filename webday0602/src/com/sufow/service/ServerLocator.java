package com.sufow.service;
/**
 * description:所有service的基础类
 * @author Administrator
 *
 */
public class ServerLocator {

	private TestService testService;
	private SufowService sufowService;
	public TestService getTestService() {
		return testService;
	}
	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	public SufowService getSufowService() {
		return sufowService;
	}
	public void setSufowService(SufowService sufowService) {
		this.sufowService = sufowService;
	}


}
