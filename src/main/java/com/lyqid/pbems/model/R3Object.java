package com.lyqid.pbems.model;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * Top level data model represents an object in the space.
 * Objects is identified by an ObjectId.
 * 
 */
public interface R3Object {

	public BigInteger getObjectId();
	public BigInteger setObjectId();
	
	public R3Point getMassCenter();
	public void setMassCenter(R3Point massCenter);
	
	public R3Point getObjectCenterPosition();
	public void setObjectCenterPosition(R3Point objectCenter);
	
	public R3Polygon getPolygon();
	public void setPolygon(R3Polygon r3Polygon);
	
	public Map<String, List<String>> getMetadata();
	public void setMetadata(Map<String, List<String>> metadata);
	
}
