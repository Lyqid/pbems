package com.lyqid.pbems.model;

/**
 * This data model represents a segment on straight (one-dimensional space)
 */
public class RObject<T> implements RPolygon {
 
	/**
	 * The start position of the segment on the straight or segment (referenced to defined zero)
	 */
	private Double x1;
	
	
	/**
	 * The end position of the segment on the straight or segment (referenced to defined zero)
	 */
	private Double x2;
	
	/**
	 * The informations associated to this point.
	 * This information could be of any kind (polygon, color, url to endpoints, and so on).
	 * However, it is important that there is a DataProcessor and a DataAccess capable of processing this data type
	 *  
	 */
	private T data;

	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	@Override
	public Double getX1() {
		return x1;
	}

	@Override
	public void setX1(Double x1) {

	}

	@Override
	public Double getX2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setX2(Double x2) {
		// TODO Auto-generated method stub
		
	}
	
}
