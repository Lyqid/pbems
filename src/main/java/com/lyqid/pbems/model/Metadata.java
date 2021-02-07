package com.lyqid.pbems.model;

import java.util.List;

public interface Metadata {

	public String getKey();
	public void setKey(String key);

	public List<String> getValues();
	public void setValues(List<String> values);

}
