package com.lyqid.pbems.dataaccess;

/**
 * This is the core concept of the abstraction. Resource can be any entity, stored in any way. The data loading
 * will be done by the specific implementation.
 * Using spring beans, is it possibile to load and instantiate 
 * 
 * @author pasquale
 *
 */
public interface R3ObjectDataAccess {

	public void getRealityObjects();

	public void describeObjects();
	
	public void putObject();
	
	public void editObject();
	
}
