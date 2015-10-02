package com.vertipac.service;

import java.io.Serializable;
import java.util.List;

import com.vertipac.exception.ServiceException;

public interface IGenericService<T extends Serializable, ID extends Serializable> {
	/**
     * Transaction which will search for row based on ID.
     * 
     * @param id ID
     * @return Row object
     */
    T findById( ID id ) throws ServiceException;

    /**
     * Transaction which will return all the rows from particular table.
     * 
     * @return List of rows
     */
    List< T > findAll() throws ServiceException;

    /**
     * Transaction which will return matched rows based on the criteria set by
     * example.
     * 
     * @param exampleInstance condition parameter to be matched
     * @return List of matched rows
     */
    List< T > findByCriteria( T exampleInstance ) throws ServiceException;

    /**
     * Transaction to insert record into the database.
     * 
     * @param entity value objects to be inserted
     * @return Same value if inserted successfully else null
     */
    T saveEntity( T entity ) throws ServiceException;

    /**
     * Transaction to update record into the database.
     * 
     * @param entity row key with other values
     * @return Same entity if updated else null
     */
    T updateEntity( T entity ) throws ServiceException;

    /**
     * Transaction to delete row/s from the database.
     * 
     * @param entity key for matching rows to be deleted
     */
    void deleteEntity( T entity ) throws ServiceException;

    /**
     * This method will return object by id by keeping lazy property true.
     * NOTE : Get MarketSegment object with vertical id =1 then only we get MarketSegment object without region object. 
     * @param entity
     * @return
     * @throws Exception
     */
    T findObjectById(T  entity ) throws ServiceException;
}
