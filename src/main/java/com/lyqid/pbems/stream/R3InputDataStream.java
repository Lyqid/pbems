package com.lyqid.pbems.stream;

import java.math.BigInteger;

import com.lyqid.pbems.stream.criteria.TransformationCriteria;

public interface R3InputDataStream {

	public void changeReality(BigInteger object, TransformationCriteria transformation);
	
}
