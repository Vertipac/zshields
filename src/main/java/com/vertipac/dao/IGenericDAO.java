/**
 * 
 */
package com.vertipac.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.vertipac.exception.DAOExceptions;


/**
 * @author Rahul.Thachilath
 *
 */
public interface IGenericDAO<T, ID extends Serializable>
{
    /**
     * Transaction which will search for row based on ID.
     * 
     * @param id ID
     * @return Row object
     */
    T findById( ID id ) throws DAOExceptions;

    /**
     * Transaction which will return all the rows from particular table.
     * 
     * @return List of rows
     */
    List< T > findAll() throws DAOExceptions;

    /**
     * Transaction which will return matched rows based on the criteria set by
     * example.
     * 
     * @param exampleInstance condition parameter to be matched
     * @return List of matched rows
     */
    List< T > findByCriteria( T exampleInstance ) throws DAOExceptions;

    /**
     * Transaction to insert record into the database.
     * 
     * @param entity value objects to be inserted
     * @return Same value if inserted successfully else null
     */
    T saveEntity( T entity ) throws DAOExceptions;

    /**
     * Transaction to update record into the database.
     * 
     * @param entity row key with other values
     * @return Same entity if updated else null
     */
    T updateEntity( T entity ) throws DAOExceptions;

    /**
     * Transaction to delete row/s from the database.
     * 
     * @param entity key for matching rows to be deleted
     */
    void deleteEntity( T entity ) throws DAOExceptions;

    /**
     * This function set the hibernate session.
     * 
     * @param session Hibernate session.
     */
    void setSession( Session session );
    
    /**
     * This function returns Current time stamp in UTC.
     * @return Datetime in UTC format.
     */
    Date getCurrentUTCTimeStamp();
    
    /**
     * This function set the logged in user id for the session.
     * @param userId userid
     */
    void setUserId( String userId );
    /**
     * This function returns the userid for the session.
     * @return User id
     */
    String getUserId();

    /**
     * This method will return object by id by keeping lazy property true.
     * NOTE : Get MarketSegment object with vertical id =1 then only we get MarketSegment object without region object. 
     * @param entity
     * @return
     * @throws Exception
     */
    T findObjectById(T  entity ) throws DAOExceptions;
    

}
