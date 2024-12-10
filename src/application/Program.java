package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");
        Seller seller = new Seller(21, "Pedro", "pedro@gmail.com", new Date(), 3000, department);

        //Instanciando o SellerDao com factory

        SellerDao sellerDao = DaoFactory.createSellerDao();
    }
}