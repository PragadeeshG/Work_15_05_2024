package com.test1;

public class ModuleRoleData {
	private Integer modulerole_id;
	private String description;
	private String authorizerTableName;
	private String effectiveStartDate;
	private String effectiveEndDate;
	private boolean objectMapped;
	private boolean dataAuthProvided;
	private boolean userRoleMapped;
	private String actionTypes;
	private String validAuth;
	private Integer processCount;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ModuleRoleData() {

	}

	public ModuleRoleData(Integer modulerole_id, String description, String authorizerTableName,
			String effectiveStartDate, String effectiveEndDate, boolean objectMapped, boolean dataAuthProvided,
			boolean userRoleMapped, String actionTypes, String validAuth, Integer processCount, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.modulerole_id = modulerole_id;
		this.description = description;
		this.authorizerTableName = authorizerTableName;
		this.effectiveStartDate = effectiveStartDate;
		this.effectiveEndDate = effectiveEndDate;
		this.objectMapped = objectMapped;
		this.dataAuthProvided = dataAuthProvided;
		this.userRoleMapped = userRoleMapped;
		this.actionTypes = actionTypes;
		this.validAuth = validAuth;
		this.processCount = processCount;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getModulerole_id() {
		return modulerole_id;
	}

	public void setModulerole_id(Integer modulerole_id) {
		this.modulerole_id = modulerole_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthorizerTableName() {
		return authorizerTableName;
	}

	public void setAuthorizerTableName(String authorizerTableName) {
		this.authorizerTableName = authorizerTableName;
	}

	public String getEffectiveStartDate() {
		return effectiveStartDate;
	}

	public void setEffectiveStartDate(String effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public String getEffectiveEndDate() {
		return effectiveEndDate;
	}

	public void setEffectiveEndDate(String effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public boolean isObjectMapped() {
		return objectMapped;
	}

	public void setObjectMapped(boolean objectMapped) {
		this.objectMapped = objectMapped;
	}

	public boolean isDataAuthProvided() {
		return dataAuthProvided;
	}

	public void setDataAuthProvided(boolean dataAuthProvided) {
		this.dataAuthProvided = dataAuthProvided;
	}

	public boolean isUserRoleMapped() {
		return userRoleMapped;
	}

	public void setUserRoleMapped(boolean userRoleMapped) {
		this.userRoleMapped = userRoleMapped;
	}

	public String getActionTypes() {
		return actionTypes;
	}

	public void setActionTypes(String actionTypes) {
		this.actionTypes = actionTypes;
	}

	public String getValidAuth() {
		return validAuth;
	}

	public void setValidAuth(String validAuth) {
		this.validAuth = validAuth;
	}

	public Integer getProcessCount() {
		return processCount;
	}

	public void setProcessCount(Integer processCount) {
		this.processCount = processCount;
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
