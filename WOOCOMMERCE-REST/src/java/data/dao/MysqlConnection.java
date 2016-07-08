/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.dao;

import javax.naming.*;
import javax.sql.*;

/**
 *
 * @author Deschamps Sébastien
 */
public class MysqlConnection {

    private static DataSource MysqlConnection = null;
    private static Context context = null;
    
    public static DataSource MysqlConnection() throws Exception {
        if(MysqlConnection != null)
        {
            return MysqlConnection;
        }

        try {
            if(context == null)
            {
                context = new InitialContext();
            }
            MysqlConnection = (DataSource) context.lookup("java:app/JNDI-MySQL");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return MysqlConnection;
    } 
}
