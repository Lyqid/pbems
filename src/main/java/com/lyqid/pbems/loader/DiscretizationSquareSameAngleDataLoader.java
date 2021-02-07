package com.lyqid.pbems.loader;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.lyqid.pbems.model.R3Object;

public abstract class DiscretizationSquareSameAngleDataLoader {

	Map<BigInteger, R3Object> identifierReality;
	
	Map<BigInteger, List<R3Object>> discretizedReality;
	
	public abstract Map<BigInteger, R3Object> loadByIdentifier();
	
	public abstract Map<BigInteger, List<R3Object>> loadDiscretized();

	public List<R3Object> getBySquare(BigInteger square) {
		return discretizedReality.get(square);
	}
	
	public List<R3Object> 
	
}
