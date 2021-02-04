package com.lyqid.pbems.model;

import com.lyqid.pbems.dataaccess.BasicDataApi;

/**
 * This data model rappresent a segment on a straight.
 * Instances is database related in order to use spring data.
 * @author pasquale
 *
 */

public interface RPolygon {
	
	/**
	 * Get the position of the starting point on the straight or segment (referenced to defined zero)
	 */
	public Double getX1();
	
	/**
	 * Set the position of the starting point on the straight or segment (referenced to defined zero)
	 */
	public void setX1(Double x1);
	
	/**
	 * Set the position of the ending point on the straight or segment (referenced to defined zero)
	 */
	public Double getX2();
	

	/**
	 * Get the position of the ending point on the straight or segment (referenced to defined zero)
	 */
	public void setX2(Double x2);
	
	/**
	 * Set the data associated with this point.
	 * @param data the data to use
	 */
	public <T extends BasicDataApi> void setData(T data);
	
	/**
	 * Get the data associated with this point
	 * This information could be of any kind (polygon, color, url to endpoints, and so on).
	 * @param data the data to use
	 */
	public <T extends BasicDataApi> T getData();
}
