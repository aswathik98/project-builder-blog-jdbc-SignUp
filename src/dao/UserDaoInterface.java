package dao;

import java.io.IOException;
import java.sql.SQLException;

import model.*;

interface UserDaoInterface{
	public int signUp(User user) throws  ClassNotFoundException, SQLException, IOException ;
	public boolean login(User user) throws  ClassNotFoundException, SQLException, IOException ;
}

