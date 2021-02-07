package com.lyqid.pbems.stream;

import java.util.List;
import java.util.Map;

import com.lyqid.pbems.dto.AbstractRealityDataModel;
import com.lyqid.pbems.model.R3Point;

public interface R3OutputDataStream {

	public AbstractRealityDataModel streamReality(R3Point r3Point, Map<String, List<String>> processMetadata);
	
}
