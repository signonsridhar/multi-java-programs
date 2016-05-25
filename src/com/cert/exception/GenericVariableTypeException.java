package com.cert.exception;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by sridhar on 4/2/16.
 */
public class GenericVariableTypeException {
    public static void main(String[] args) throws IOException, SQLException {
        String src = "DBMS1";
        try{
            if (src.equals("DBMS"))
                throw new SQLException();
            else
                throw new IOException();
        } catch(Exception e){
            throw e;
        }

    }
}
