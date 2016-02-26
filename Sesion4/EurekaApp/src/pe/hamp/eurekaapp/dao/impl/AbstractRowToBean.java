package pe.hamp.eurekaapp.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Upao
 */
public abstract class AbstractRowToBean<T> {
    protected abstract T rowToBean(ResultSet rs)   
            throws SQLException; 
}
