package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJBDC;
import model.dao.impl.SellerDaoJBDC;

import java.sql.Connection;

public class DaoFactory {
    public static SellerDaoJBDC createSellerDao(){
        return new SellerDaoJBDC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJBDC(DB.getConnection());
    }
}
