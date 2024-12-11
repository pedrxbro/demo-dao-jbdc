package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJBDC;

import java.sql.Connection;

public class DaoFactory {
    public static SellerDaoJBDC createSellerDao(){
        return new SellerDaoJBDC(DB.getConnection());
    }
}
