package com.test1;

public class ModuleConfigAuthorizer {
	private Integer id;
	private String configName;
	private String fldName;
	private String label;
	private Integer configCount;
	private boolean canModify;
	private boolean canDelete;
	private String modifyType;
	private String modifyTypeIndicator;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ModuleConfigAuthorizer() {

	}

	public ModuleConfigAuthorizer(Integer id, String configName, String fldName, String label, Integer configCount,
			boolean canModify, boolean canDelete, String modifyType, String modifyTypeIndicator, String creationCr,
			String modifiedCr, String creationDate, String modifiedDate, String entityState) {
		super();
		this.id = id;
		this.configName = configName;
		this.fldName = fldName;
		this.label = label;
		this.configCount = configCount;
		this.canModify = canModify;
		this.canDelete = canDelete;
		this.modifyType = modifyType;
		this.modifyTypeIndicator = modifyTypeIndicator;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public String getFldName() {
		return fldName;
	}

	public void setFldName(String fldName) {
		this.fldName = fldName;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getConfigCount() {
		return configCount;
	}

	public void setConfigCount(Integer configCount) {
		this.configCount = configCount;
	}

	public boolean isCanModify() {
		return canModify;
	}

	public void setCanModify(boolean canModify) {
		this.canModify = canModify;
	}

	public boolean isCanDelete() {
		return canDelete;
	}

	public void setCanDelete(boolean canDelete) {
		this.canDelete = canDelete;
	}

	public String getModifyType() {
		return modifyType;
	}

	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
	}

	public String getModifyTypeIndicator() {
		return modifyTypeIndicator;
	}

	public void setModifyTypeIndicator(String modifyTypeIndicator) {
		this.modifyTypeIndicator = modifyTypeIndicator;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
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
