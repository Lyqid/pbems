package com.lyqid.pbems.model;

import java.math.BigInteger;
import java.util.List;

/**
 * Top level data model represents an object in the space.
 * Objects is identified by an ObjectId.
 * 
 */
public interface R3Object {

	public BigInteger getObjectId();
	public void setObjectId(BigInteger objectId);
	
	public R3Point getMassCenter();
	public void setMassCenter(R3Point massCenter);
	
	public R3Point getObjectCenterPosition();
	public void setObjectCenterPosition(R3Point objectCenter);
	
	public R3Polygon getPolygon();
	public void setPolygon(R3Polygon r3Polygon);
	
	public List<Metadata> getMetadata();
	public void setMetadata(List<Metadata> metadata);
	
}
