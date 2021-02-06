package com.lyqid.pbems.dto;

import java.util.List;
import java.util.Map;

public class AbstractRealityDataModel {

	public List<AbstractRealityDataObject> list;

	public Map<String, List<String>> realityMetadata;

	public List<AbstractRealityDataObject> getList() {
		return list;
	}

	public void setList(List<AbstractRealityDataObject> list) {
		this.list = list;
	}

}
