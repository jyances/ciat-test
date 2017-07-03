
package co.ciat.test.dao;


import java.io.IOException;
import java.util.List;

import co.ciat.test.model.CPartner;


/**
 * Generic DAO interface for all daos in the project 
 * @author jyances
 */
public interface GenericDao <T>{
	
    /**
     * this method to create a record in database
     * @param entity
     */
    public void create(T entity) throws Exception;

    public void createBin(T entity) throws IOException;
    
    public void createJson(T entity) throws IOException;
    
    /**
     * this method updates a record in database
     * @param entity
     */
    public Boolean update(T entity);

    /**
     * this method removes a record in database
     * @param entity
     */
    public void remove(T entity);

    /**
     * this method finds a record in data base 
     * 
     * @param id is a unique identify of register in database
     * @return returned a entity unique with a supplied id
     */
    public T find(Object id);
    
    
	/**
	 * Find all elements in the storage  
	 * @return
	 */
	public abstract List<T> findAll();


}
