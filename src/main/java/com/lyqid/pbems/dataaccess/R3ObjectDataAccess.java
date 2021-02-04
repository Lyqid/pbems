package com.lyqid.pbems.dataaccess;

/**
 * This is the core concept of the abstraction. Resource can be any entity, stored in any way. The data loading
 * will be done by the specific implementation.
 * Using spring beans, is it possibile to load and instantiate 
 * 
 * @author pasquale
 *
 */
public abstract class R3ObjectDataAccess {

	public void getById();
	public void getByIntersection();
	public void getByDistances();
	
	
	public void put();
	
	public void list();
}
