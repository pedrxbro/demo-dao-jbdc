package model.dao;

import model.dao.impl.SellerDaoJBDC;

public class DaoFactory {
    public static SellerDaoJBDC createSellerDao(){
        return new SellerDaoJBDC();
    }
}
