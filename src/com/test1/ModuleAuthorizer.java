package com.test1;

public class ModuleAuthorizer {
	private Integer moduleId;
	private String authorizerModule1;
	private String authorizerModuleValue1;
	private String authorizerModule2;
	private String authorizerModuleValue2;
	private String authorizerModule3;
	private String authorizerModuleValue3;
	private String authorizerModuleSystem;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ModuleAuthorizer() {

	}

	public ModuleAuthorizer(Integer moduleId, String authorizerModule1, String authorizerModuleValue1,
			String authorizerModule2, String authorizerModuleValue2, String authorizerModule3,
			String authorizerModuleValue3, String authorizerModuleSystem, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.moduleId = moduleId;
		this.authorizerModule1 = authorizerModule1;
		this.authorizerModuleValue1 = authorizerModuleValue1;
		this.authorizerModule2 = authorizerModule2;
		this.authorizerModuleValue2 = authorizerModuleValue2;
		this.authorizerModule3 = authorizerModule3;
		this.authorizerModuleValue3 = authorizerModuleValue3;
		this.authorizerModuleSystem = authorizerModuleSystem;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public String getAuthorizerModule1() {
		return authorizerModule1;
	}

	public void setAuthorizerModule1(String authorizerModule1) {
		this.authorizerModule1 = authorizerModule1;
	}

	public String getAuthorizerModuleValue1() {
		return authorizerModuleValue1;
	}

	public void setAuthorizerModuleValue1(String authorizerModuleValue1) {
		this.authorizerModuleValue1 = authorizerModuleValue1;
	}

	public String getAuthorizerModule2() {
		return authorizerModule2;
	}

	public void setAuthorizerModule2(String authorizerModule2) {
		this.authorizerModule2 = authorizerModule2;
	}

	public String getAuthorizerModuleValue2() {
		return authorizerModuleValue2;
	}

	public void setAuthorizerModuleValue2(String authorizerModuleValue2) {
		this.authorizerModuleValue2 = authorizerModuleValue2;
	}

	public String getAuthorizerModule3() {
		return authorizerModule3;
	}

	public void setAuthorizerModule3(String authorizerModule3) {
		this.authorizerModule3 = authorizerModule3;
	}

	public String getAuthorizerModuleValue3() {
		return authorizerModuleValue3;
	}

	public void setAuthorizerModuleValue3(String authorizerModuleValue3) {
		this.authorizerModuleValue3 = authorizerModuleValue3;
	}

	public String getAuthorizerModuleSystem() {
		return authorizerModuleSystem;
	}

	public void setAuthorizerModuleSystem(String authorizerModuleSystem) {
		this.authorizerModuleSystem = authorizerModuleSystem;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
