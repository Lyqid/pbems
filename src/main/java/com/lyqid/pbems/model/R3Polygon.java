package com.lyqid.pbems.model;

import java.util.Collection;
import java.util.List;

public interface R3Polygon {

	public List<R3Plane> getPlanes();

	public void setPlanes(Collection<R3Plane> planes);
	
	public R3Point getCenter();
	
}
